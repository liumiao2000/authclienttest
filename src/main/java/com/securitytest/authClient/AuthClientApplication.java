package com.securitytest.authClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.securitytest.authClient.converter.JsonFromTextHttpMessageConverter;

@SpringBootApplication
public class AuthClientApplication {
	
	@Bean
	public RestTemplate getRestTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new JsonFromTextHttpMessageConverter());
		return restTemplate;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AuthClientApplication.class, args);
	}

}
