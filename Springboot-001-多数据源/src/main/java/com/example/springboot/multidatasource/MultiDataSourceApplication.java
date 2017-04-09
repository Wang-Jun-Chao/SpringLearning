package com.example.springboot.multidatasource;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Author: 王俊超
 * Date: 2017-04-09 09:14
 * All Rights Reserved !!!
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class MultiDataSourceApplication  {
    public static void main(String[] args) {
        SpringApplication.run(MultiDataSourceApplication.class, args);
    }
}
