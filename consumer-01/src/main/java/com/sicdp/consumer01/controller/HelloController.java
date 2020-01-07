package com.sicdp.consumer01.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/service/hello")
    public String hello() {
//        return restTemplate.getForEntity("http://localhost:8080/service/hello", String.class).getBody();
        return restTemplate.getForEntity("http://provider-01/service/hello", String.class).getBody();
    }
}
