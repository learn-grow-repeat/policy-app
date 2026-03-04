package com.policy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloWorldController { 
   @GetMapping("/hello")
  public String index() {
      System.out.println("HelloWorldController-hello!!!")
    return "Greetings from Spring Boot!";
  }
  @GetMapping("/")
  public String index1() {
     System.out.println("Greetings Swathy Sudha!")
    return "Greetings Swathy Sudha!";
  }

}
