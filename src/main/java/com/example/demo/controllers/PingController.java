package com.example.demo.controllers;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

	@GetMapping("/")
	public String hello() {
		return "Hello there !! ";
	}
	
	@GetMapping("/ping")
	public String ping() {
		return "Ping at "+Instant.now();
	}
	
}
