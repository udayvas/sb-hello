package com.example.demo.controllers;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PingController {

	@GetMapping("/")
	public String hello() {
		log.info("demo ready");
		return "Hello there !! ";
	}
	
	@GetMapping("/ping")
	public String ping() {
		log.info("ping received at "+Instant.now());
		return "Ping at "+Instant.now();
	}
	
}
