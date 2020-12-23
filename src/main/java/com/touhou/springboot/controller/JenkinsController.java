package com.touhou.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    private static final Logger log = LoggerFactory.getLogger(JenkinsController.class);

    @GetMapping("/test")
    public String test() {
        return "hello world, I'm go test!";
    }
}
