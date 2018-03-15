package com.aliyun.openservices.spring.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhuyi on 18/3/15.
 */
@Slf4j
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/echo")
    public String echo(String name) {
        return "echo" + name;
    }

}
