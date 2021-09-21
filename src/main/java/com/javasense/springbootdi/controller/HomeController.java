package com.javasense.springbootdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {


    public String sayHello() {
        System.out.println("Hello World");

        return  "HeLLO every body";
    }
}
