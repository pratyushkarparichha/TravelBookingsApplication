package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class FlightSearchApplication {
	
//	 @Bean
//	  public WebClient.Builder getWebClientBuilder() { 
//		 return WebClient.builder(); }
	 
	  @Bean
		@LoadBalanced
		public RestTemplate restTemplate()
		{
			return new RestTemplate();
		}

	
	public static void main(String[] args) {
		SpringApplication.run(FlightSearchApplication.class, args);
		
	}

}
