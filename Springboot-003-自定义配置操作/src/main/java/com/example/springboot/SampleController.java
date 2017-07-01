package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 王俊超
 * Date: 2017-07-01 08:12
 * All Rights Reserved !!!
 */
@RestController
public class SampleController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello!!!";
    }
}
