package com.jwramirezl.app.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.jwramirezl.app.common.alumno.entity"})
public class MicroServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioUsuarioApplication.class, args);
	}

}
