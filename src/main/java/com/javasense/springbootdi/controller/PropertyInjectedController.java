package com.javasense.springbootdi.controller;

import com.javasense.springbootdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
