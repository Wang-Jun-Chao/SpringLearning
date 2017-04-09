package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Author: 王俊超
 * Date: 2017-04-09 12:51
 * All Rights Reserved !!!
 */
@SpringBootApplication
@EnableWebMvc
public class MultiProfileApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiProfileApplication.class, args);
    }
}
