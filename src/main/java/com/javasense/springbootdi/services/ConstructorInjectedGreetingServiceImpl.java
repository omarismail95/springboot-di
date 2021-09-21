package com.javasense.springbootdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {



    @Override
    public String sayGreeting() {
        return "Hello From Constructor Greeting Service Impl";
    }
}
