package com.javasense.springbootdi;

import com.javasense.springbootdi.controller.HomeController;
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
	}

}
