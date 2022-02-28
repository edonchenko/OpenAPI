package com.example.OpenAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String helloWorld(){
     return "Hello, World!";
    }
    @GetMapping("/bb")
    public String bbWorld(){
      return "BB, World!";
    }
}
