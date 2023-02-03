package com.dolzanes.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(
		basePackages = { 
			"com.dolzanes.project.domain.repository",
			"com.dolzanes.project.domain.service" 
		}
)
@RestController
public class SpringProjectApiApplication {
	
	@Autowired
	@Qualifier("applicationName")
	private String applicationName;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApiApplication.class, args);
	}

}
