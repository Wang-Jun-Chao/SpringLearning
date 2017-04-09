package com.example.springboot.multidatasource.aspect;

import com.example.springboot.multidatasource.annotation.DataSourceTypeAnno;
import com.example.springboot.multidatasource.common.DataSourceContextHolder;
import com.example.springboot.multidatasource.common.DataSourceEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Author: 王俊超
 * Date: 2017-04-09 09:54
 * All Rights Reserved !!!
 */
@Component
@Aspect
public class DataSourceAspect {
    @Pointcut("execution(* com.example.springboot.multidatasource.dao..*(..)) " +
            "&& @annotation(com.example.springboot.multidatasource.annotation.DataSourceTypeAnno)")
    public void dataSourcePointcut() {
    }

    @Around("dataSourcePointcut()")
    public Object doAround(ProceedingJoinPoint pjp) {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        DataSourceTypeAnno typeAnno = method.getAnnotation(DataSourceTypeAnno.class);
        DataSourceEnum sourceEnum = typeAnno.value();

        if (sourceEnum == DataSourceEnum.master) {
            DataSourceContextHolder.setDataSourceType(DataSourceEnum.master);
        } else if (sourceEnum == DataSourceEnum.slaver) {
            DataSourceContextHolder.setDataSourceType(DataSourceEnum.slaver);
        }

        Object result = null;
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            DataSourceContextHolder.resetDataSourceType();
        }

        return result;
    }
}
