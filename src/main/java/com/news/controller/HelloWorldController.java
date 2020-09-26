package com.news.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenheng
 * @time 2020/9/26 18:02
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,world";
    }
}
