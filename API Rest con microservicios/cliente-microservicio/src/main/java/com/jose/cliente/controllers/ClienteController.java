package com.jose.cliente.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jose.cliente.services.ClienteService;
import com.jose.commons.controllers.CommonControllers;
import com.jose.commons.dto.ClienteDTO;


@RestController
public class ClienteController extends CommonControllers<ClienteDTO,ClienteService> {
	
	public ClienteController(ClienteService service) {
		super(service);
	}

}
