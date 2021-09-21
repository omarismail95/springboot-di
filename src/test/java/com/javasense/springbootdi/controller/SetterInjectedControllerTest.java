package com.javasense.springbootdi.controller;

import com.javasense.springbootdi.services.SetterInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {


    SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterInjectedGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());


    }
}