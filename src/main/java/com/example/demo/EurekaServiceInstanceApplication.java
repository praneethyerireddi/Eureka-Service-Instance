package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaServiceInstanceApplication {
	
	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceInstanceApplication.class, args);
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "Service Instance Hello " + port;
	}

}
