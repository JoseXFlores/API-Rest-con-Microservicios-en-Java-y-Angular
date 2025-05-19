package com.jose.pedido.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jose.commons.dto.AvionDTOGet;


@FeignClient(name = "avion-microservicio")
public interface AvionClient {
	
	@GetMapping("/get/{id}")
	public AvionDTOGet getAvionById(@PathVariable Long id);

}
