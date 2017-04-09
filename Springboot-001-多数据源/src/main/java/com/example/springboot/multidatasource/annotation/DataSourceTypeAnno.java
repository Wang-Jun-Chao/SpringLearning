package com.example.springboot.multidatasource.annotation;

import com.example.springboot.multidatasource.common.DataSourceEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据源类型注解
 * <p>
 * Author: 王俊超
 * Date: 2017-04-09 09:50
 * All Rights Reserved !!!
 */
@Retention(RetentionPolicy.RUNTIME) // 在运行时可见
@Target(ElementType.METHOD) // 注解可以用在方法上
public @interface DataSourceTypeAnno {
    DataSourceEnum value() default DataSourceEnum.master;
}
