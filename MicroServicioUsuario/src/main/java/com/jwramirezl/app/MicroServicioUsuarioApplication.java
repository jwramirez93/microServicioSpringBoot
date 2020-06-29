package com.jwramirezl.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioUsuarioApplication.class, args);
	}

}
