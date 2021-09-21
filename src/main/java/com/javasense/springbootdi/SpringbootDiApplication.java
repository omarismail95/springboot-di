package com.javasense.springbootdi;

import com.javasense.springbootdi.controller.ConstructorInjectedController;
import com.javasense.springbootdi.controller.HomeController;
import com.javasense.springbootdi.controller.PropertyInjectedController;
import com.javasense.springbootdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDiApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootDiApplication.class, args);
		HomeController my = (HomeController)applicationContext.getBean("homeController");

		String greeting = my.sayHello();
		System.out.println(greeting);

		System.out.println("<----------------Property Injection -------->");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applicationContext
				.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("<----------------Setter Injection -------->");
		SetterInjectedController setterInjectedController = (SetterInjectedController)applicationContext
				.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("<----------------Constructor Injection -------->");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)applicationContext
				.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

	}

}
