package com.javasense.springbootdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {



    @Override
    public String sayGreeting() {
        return "Hello From Property Greeting Service Impl";
    }
}
