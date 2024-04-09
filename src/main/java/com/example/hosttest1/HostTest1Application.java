package com.example.hosttest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@SpringBootApplication
public class HostTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(HostTest1Application.class, args);
	}
	@GetMapping
	public String hello(){
		return "heloo";
	}
}
