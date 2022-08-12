package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

/*
 * @Configuration - mark the class as a source for bean definitions
 * for the application context
 * 
 * @ComponentScan tells Spring to look for other components,
 * configurations, services in other packages
 */

@SpringBootApplication
@ComponentScan(basePackages= {"com.example*"})
@CrossOrigin(origins = "http://localhost:4200")
public class MainDriver {
	
	public static void main(String[] args) {
		SpringApplication.run(MainDriver.class, args);
	}

}
