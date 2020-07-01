package com.jwramirezl.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServicioEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioEurekaServerApplication.class, args);
	}

}
