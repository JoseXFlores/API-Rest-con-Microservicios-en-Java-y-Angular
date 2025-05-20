package com.jose.commons.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class ProductoDTO {
	
	private Long id; 
	
	@NotBlank(message = "El nombre no puede estar en blanco")
	private String nombre;
	
	@NotBlank(message = "El apellido no puede estar en blanco")
	private String descripcion;
	
	@NotNull(message = "El precio no puede ser nulo")
	@DecimalMin(value = "0", inclusive = false, message = "El precio debe ser un número positivo")
	private Long precio;

	@NotNull(message = "El stock no puede ser nulo")
	@Min(value = 1, message = "El stock debe ser un número entero positivo")
	private Integer stock;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}



}
