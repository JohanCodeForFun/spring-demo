package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public  class HelloController {

  @Value("${app.environment}")
  private String environment;

  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot running in " + environment + " environment!";
  }
}
