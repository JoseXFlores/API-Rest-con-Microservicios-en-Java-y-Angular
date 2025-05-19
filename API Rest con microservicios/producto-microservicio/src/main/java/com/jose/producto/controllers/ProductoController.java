package com.jose.producto.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jose.commons.controllers.CommonControllers;

import com.jose.commons.dto.ProductoDTO;
import com.jose.producto.services.ProductoService;


@RestController
public class ProductoController extends CommonControllers<ProductoDTO,ProductoService> {
	
	public ProductoController(ProductoService service) {
		super(service);
	}

}
