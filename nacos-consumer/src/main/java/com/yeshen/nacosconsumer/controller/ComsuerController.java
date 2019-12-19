package com.yeshen.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class ComsuerController {

/*    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;*/

    /*@RequestMapping("/list")
    public String test(String msg){
        ServiceInstance serviceInstance = loadBalancerClient.choose("NacosProvider");
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/list?msg="+ msg,String.class);
    }*/

   /* @RequestMapping("/list")
    public String test(String msg){
        ServiceInstance serviceInstance = loadBalancerClient.choose("NacosProvider");
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject("http://NacosProvider/list?msg="+ msg,String.class);
*/

       /* @Autowired
        private UserService userService;
        @RequestMapping("/list")
        public String user(String msg){
           return userService.user(msg);*/
       @Autowired
     private WebClient.Builder webClientBuilder;

    @RequestMapping("/list")
    public Mono<String> usr(String msg){
           return webClientBuilder.build()
                                     .get()
                                     .uri("http://NacosProvider/list?msg="+msg)
                                     .retrieve()
                                     .bodyToMono(String.class);
       }
}
