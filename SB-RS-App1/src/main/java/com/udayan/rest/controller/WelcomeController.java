package com.udayan.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	public WelcomeController() {
		super();
		System.out.println("WelcomeController Constructor");
}

	@GetMapping(value = "/welcomeMsg")
	// or @GetMapping("/welcomeMsg")
	public ResponseEntity<String> welcomeMsg() {
		String responseMsg = "Welcome to learn java with Local Developer";
		return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
	}

}
