package com.example.springZeroToHero.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @GetMapping("/helo")
 public String Hello(){
    return "Hello";
 }
}