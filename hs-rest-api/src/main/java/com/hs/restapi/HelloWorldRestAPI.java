package com.hs.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestAPI {
	
	@RequestMapping("/hello")
	public String helloWorld() {
		System.out.println("HelloWorld");
		return "helloworld";
	}

}
