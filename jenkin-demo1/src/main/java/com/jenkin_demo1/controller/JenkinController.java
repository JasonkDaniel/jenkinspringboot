package com.jenkin_demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, Jenkins!";
	}
}
