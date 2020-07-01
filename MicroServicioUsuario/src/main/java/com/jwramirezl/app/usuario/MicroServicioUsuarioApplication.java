package com.jwramirezl.app.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.example.demo.entity"})
public class MicroServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioUsuarioApplication.class, args);
	}

}
