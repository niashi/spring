package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Opa, Mundão!\n\nPra realizar esta atividade, eu precisei de muita atenção aos detalhes e PRINCIPALMENTE de persistência!";
	}
}
