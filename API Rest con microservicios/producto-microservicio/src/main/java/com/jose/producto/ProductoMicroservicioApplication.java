package com.jose.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.jose.commons.controllers","com.jose.producto"})
@EntityScan({"com.jose.commons.models.entities"})

public class ProductoMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductoMicroservicioApplication.class, args);
	}

}
