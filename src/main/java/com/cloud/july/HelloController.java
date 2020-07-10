package com.cloud.july;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
  @GetMapping("/")
  public String hello() {
    return "hello world!";
  }
}