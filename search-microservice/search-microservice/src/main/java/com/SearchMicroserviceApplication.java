package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SearchMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchMicroserviceApplication.class, args);
		System.out.println("connection established");
	}
	 @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }

}
