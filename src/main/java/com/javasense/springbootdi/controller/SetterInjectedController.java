package com.javasense.springbootdi.controller;

import com.javasense.springbootdi.services.GreetingService;

public class SetterInjectedController {



    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
