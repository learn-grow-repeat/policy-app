package com.policy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloWorldController { 
  @GetMapping("/")
  public String index() {
      System.out.println("HelloWorldController-hello!!!");
    return "Greetings from Spring Boot!";
  }
 
}
