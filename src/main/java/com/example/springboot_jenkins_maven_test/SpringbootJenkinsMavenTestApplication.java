package com.example.springboot_jenkins_maven_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// create simple maven project 
// add git project and repo url 
// into trigger snapshot no maven target no pre steps
// it will automatically pull pom.xml file into goals clean install only
// all default no maven pre built steps

@RestController
@SpringBootApplication
public class SpringbootJenkinsMavenTestApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootJenkinsMavenTestApplication.class, args);
	}
	@RequestMapping("/jenkins")
	public String test()
	{
		return "this is jenkins test";
	}
	@RequestMapping("/maven")
	public String test1()
	{
		return "this is maven test";
	}
	@RequestMapping("/branch")
	public String test2()
	{
		return "this is branch test";
	}

}
