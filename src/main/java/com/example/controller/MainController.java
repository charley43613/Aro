package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/person")
	public @ResponseBody ResponseEntity<String> getWord(){
		return new ResponseEntity<>("Happy Thursday, yo", HttpStatus.OK);
	}

}
