package com.dockerdemo.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "Docker Running ...";
    }


    @GetMapping("docker")
    public String dockerHealthCheck(){
        return "Docker is working fine";
    }
}
