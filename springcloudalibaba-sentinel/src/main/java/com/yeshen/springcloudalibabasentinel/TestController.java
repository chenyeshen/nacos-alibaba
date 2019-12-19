package com.yeshen.springcloudalibabasentinel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        testService.doSomeThing("hello " + new Date());
        return "didispace.com";
    }

}
