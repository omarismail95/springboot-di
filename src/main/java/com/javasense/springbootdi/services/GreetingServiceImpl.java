package com.javasense.springbootdi.services;

public class GreetingServiceImpl implements GreetingService {



    @Override
    public String sayGreeting() {
        return "Hello From Greeting Service Impl";
    }
}
