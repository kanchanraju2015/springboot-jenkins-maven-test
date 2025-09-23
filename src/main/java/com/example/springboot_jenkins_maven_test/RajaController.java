package com.example.springboot_jenkins_maven_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RajaController {
	
	@RequestMapping("/test")
	public String test() {
		return "this jenkis test maven";
	}

}
