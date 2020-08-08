package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/test")
	public String index() {
		showResttemplate();
		return "Greetings from Spring Boot!";
	}
	private void showResttemplate()
	{
		System.out.println("restTemplate : "+restTemplate);
	}

}
