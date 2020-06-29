package com.jwramirezl.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServicioCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioCursoApplication.class, args);
	}

}
