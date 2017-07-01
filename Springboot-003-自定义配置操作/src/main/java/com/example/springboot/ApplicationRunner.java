package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: 王俊超
 * Date: 2017-07-01 08:11
 * All Rights Reserved !!!
 */
@SpringBootApplication
//@EnableAutoConfiguration
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}
