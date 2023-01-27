package com.hackathon.CheckinMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CheckinMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckinMicroserviceApplication.class, args);
		System.out.println("application started on port:8075");
	}
	 @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }
}
