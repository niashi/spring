package com.helloObj.helloObj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-obj")
public class HelloObjController {
	
	@GetMapping
	public String helloObj() {
		return "Opa, Mundão!\n\nEssa semana, meu objetivo principal é entender tudo que estou fazendo com o Spring Boot.";
	}
}
