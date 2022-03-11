package com.example.aws;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

    @GetMapping("/")
    public String hello(){
        return "AWS";
    }

}
