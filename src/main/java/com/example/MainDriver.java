package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
		return "Hello World!";
	 }
	@GetMapping("/welcome")
	public @ResponseBody ResponseEntity<String> getWord(){
		return new ResponseEntity<>("Welcome to redhat Openshift", HttpStatus.OK);
	}
	public static void main(String[] args) {
		SpringApplication.run(MainDriver.class, args);
	}

}
