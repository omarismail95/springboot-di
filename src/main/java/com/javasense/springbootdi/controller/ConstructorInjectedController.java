package com.javasense.springbootdi.controller;

import com.javasense.springbootdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;


    // Autowired in constructor case is optional
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
