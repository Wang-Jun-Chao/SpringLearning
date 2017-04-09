package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 王俊超
 * Date: 2017-04-09 12:58
 * All Rights Reserved !!!
 */
@RestController
@RequestMapping("${context.rootpath}")
public class MultiProfileController {
    @RequestMapping(path = "/hello")
    public String hello(@Value("${context.rootpath}") String contextRootPath) {
        return contextRootPath;
    }
}
