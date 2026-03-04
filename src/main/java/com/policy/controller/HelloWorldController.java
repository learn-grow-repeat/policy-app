package com.policy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloWorldController { 
   @GetMapping("/hello")
  public String index() {
    return "Greetings from Spring Boot!";
  }
  @GetMapping("/")
  public String index() {
    return "Greetings Swathy Sudha!";
  }

}
