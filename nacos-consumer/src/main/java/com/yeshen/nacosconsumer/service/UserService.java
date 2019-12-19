package com.yeshen.nacosconsumer.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yeshen
 */
@FeignClient("NacosProvider")
public interface UserService {
    @GetMapping("/list")
    public String user(@RequestParam("msg") String msg);
}
