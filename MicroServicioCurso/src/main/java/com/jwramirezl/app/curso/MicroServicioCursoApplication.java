package com.jwramirezl.app.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.example.demo.entity",
			"com.jwramirezl.app.entity"})
public class MicroServicioCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioCursoApplication.class, args);
	}

}
