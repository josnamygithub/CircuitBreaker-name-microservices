package com.example.demo;

import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class NameConfiguration {
		
		@Bean
		public RestTemplate restTeamplate() {
			RestTemplate restTemplate = new RestTemplate();
			return restTemplate;
		}

		 @Bean
		    public CircuitBreakerFactory circuitBreakerFactory() {
		        return circuitBreakerFactory();
		    }
}



