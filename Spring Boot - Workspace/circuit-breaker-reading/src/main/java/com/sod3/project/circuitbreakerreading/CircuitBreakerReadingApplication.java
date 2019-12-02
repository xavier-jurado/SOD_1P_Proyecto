package com.sod3.project.circuitbreakerreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@RestController
@SpringBootApplication
@EnableEurekaClient
public class CircuitBreakerReadingApplication {
	  @Autowired
	  private BookService bookService;
	
	  @Bean
	  public RestTemplate rest(RestTemplateBuilder builder) {
	  return builder.build();
	  }
	
	  @RequestMapping("/to-read")
	  public String toRead() {
	  return bookService.readingList();
	  }
	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerReadingApplication.class, args);
	}

	@RequestMapping(value = "/")
   	public String home() {
    return "Circuit Breaker Reading";
   }
}
