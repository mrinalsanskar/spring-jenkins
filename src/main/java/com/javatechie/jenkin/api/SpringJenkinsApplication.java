package com.javatechie.jenkin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {


	@GetMapping("/ping")
	public String message() {
		return "Maine change kiya code jenkins build test karne ko";
	}
	
	@GetMapping("/pong")
	public String message2() {
		return "Mazedaar cheez hai yaar ye jenkins";
	}

	public static  void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
