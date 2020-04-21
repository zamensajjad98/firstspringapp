package com.zamen.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController
{
    @GetMapping("/")
 public String sayHelloGet()
 {
     return "hello world from get";
 }

    @PostMapping("/")
    public String sayHelloPost()
    {
        return "hello world from post";
    }

    @PutMapping("/")
    public String sayHelloPut()
    {
        return "hello world from put";
    }

    @DeleteMapping("/")
    public String sayHelloDelete()
    {
        return "hello world from delete";
    }



}
