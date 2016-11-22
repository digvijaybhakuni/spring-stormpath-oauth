package com.dgstack.spring.oauth2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStormpathOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStormpathOauthApplication.class, args);
	}
	
	@Value("${stormpath.client.apiKey.id}")
	private String apiId;
	
	@Value("${stormpath.client.apiKey.secret}")
	private String apiSecret;
	
	@Value("${stormpath.application.href}")
	private String stormpathUrl;
	

}
