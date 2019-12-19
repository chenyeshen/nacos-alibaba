package com.yeshen.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class ProviderController {


    @RequestMapping("/list")
    public String test(String msg){
        return "hahaha"+msg;
    }
    @RequestMapping("/cat")
    public String cat(String msg){
        return "hahaha"+msg;
    }
}
