package com.jose.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.jose.commons.controllers","com.jose.cliente"})
@EntityScan({"com.jose.commons.models.entities"})

public class ClienteMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteMicroservicioApplication.class, args);
	}

}
