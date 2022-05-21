package com.pkb.samplemicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Sample API using API Gateway...!!! ";
	}

}
