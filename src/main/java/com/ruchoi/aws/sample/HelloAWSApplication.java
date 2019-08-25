package com.ruchoi.aws.sample;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloAWSApplication {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(HelloAWSApplication.class, args);
	}

	@RequestMapping(value = "/hello")
	public String getProductName() {
	   return "Honey3";   
	}

	@GetMapping("/health")
    public String getHealth () {
        return "UP"; 
    }

	@GetMapping("/profile")
    public String getProfile () {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }
}
