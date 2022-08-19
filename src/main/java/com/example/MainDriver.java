package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * @Configuration - mark the class as a source for bean definitions
 * for the application context
 * 
 * @ComponentScan tells Spring to look for other components,
 * configurations, services in other packages
 */
@RestController
@SpringBootApplication
@ComponentScan(basePackages= {"com.example*"})
public class MainDriver {
	@RequestMapping("/")
	    String home() {
		return "Hello Redhat Openshift, happy Monday!";
	 }
	public static void main(String[] args) {
		SpringApplication.run(MainDriver.class, args);
	}

}
