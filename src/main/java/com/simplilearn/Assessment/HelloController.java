package com.simplilearn.AssessmentProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @RequestMapping("/hello")
    public String sayHi (){
        return "Hello, Welcome Spring Boot!";
    }   
}
