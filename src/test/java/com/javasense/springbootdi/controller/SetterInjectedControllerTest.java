package com.javasense.springbootdi.controller;

import com.javasense.springbootdi.services.GreetingServiceImpl;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {


    SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());


    }
}