package com.sod3.project.circuitbreakerbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class CircuitBreakerBookstoreApplication {

	@RequestMapping(value = "/recommended")
  	public String readingList(){
  	return "Spring en funcionamiento (Manning), Cloud Native Java (O'Reilly), Sistemas Operativos Distribuidos (Circuit Breaker)";
  	}
	
	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerBookstoreApplication.class, args);
	}
	
	@RequestMapping(value = "/")
   	public String home() {
      return "Circuit Breaker Bookstore";
   }
}
