package com.ruchoi.aws.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloAWSApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAWSApplication.class, args);
	}

	@RequestMapping(value = "/hello")
	public String getProductName() {
	   return "Honey";   
    }
}
