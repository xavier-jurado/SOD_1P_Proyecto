package com.sod3.project.ServidorRegistros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServidorRegistrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorRegistrosApplication.class, args);
	}

}
