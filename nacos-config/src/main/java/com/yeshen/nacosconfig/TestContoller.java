package com.yeshen.nacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestContoller {
    @Value("${test:test空的}")
    private String str;

    @RequestMapping("/test")
    public String cat(){
        return "hahaha"+str;
    }
}
