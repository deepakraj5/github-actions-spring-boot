package com.kannan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hi I am from SpringBoot";
    }
    @RequestMapping("/deepak")
    public String deepak(){
        return "Deepak";
    }

}
