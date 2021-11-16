package com.example.springboot2fromchinesetut.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@ResponseBody // @ResponseBody'nin anlami burdaki methodlarin hepsinin browsere yazilacak.
//@Controller

@RestController // @RestController icerinde @ResponseBody ve @Controller var.
public class SelamController {

    @RequestMapping("/selam")
    public String handle01() {
        return "Selam alaykum, Spring Boot 2!";
    }
}
