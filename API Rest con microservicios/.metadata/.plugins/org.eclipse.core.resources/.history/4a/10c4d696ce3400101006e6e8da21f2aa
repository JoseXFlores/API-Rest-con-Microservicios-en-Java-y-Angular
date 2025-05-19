package com.jose.commons.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public class AvionDTOPost {

	private Long id;                                                                
    
	@NotBlank(message = "El nombre no puede estar en blanco") 
    private String numRegistro;
	
	@NotBlank(message = "El tipo no puede estar en blanco") 
    private String tipo;
	
	@NotBlank(message = "El codigo del modelo no puede estar en blanco") 
    private String codigoModelo;

	@NotNull(message = "La capacidad no puede estar en blanco") 
    private Long capacidad;
    
	@NotNull(message = "La fecha del primer vuelo no puede ser nula")
	@Past(message = "La fecha del primer vuelo debe estar en el pasado")
    private LocalDate fechaPrimerVuelo;
	
	@Min(value = 1, message = "El estatus mínimo permitido es 1")
	@Max(value = 2, message = "El estatus máximo permitido es 2")
	@NotNull(message = "El estatus es obligatorio")
    private Long estatus;


    private Long idAerolineas;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumRegistro() {
		return numRegistro;
	}


	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCodigoModelo() {
		return codigoModelo;
	}


	public void setCodigoModelo(String codigoModelo) {
		this.codigoModelo = codigoModelo;
	}


	public Long getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;
	}


	public LocalDate getFechaPrimerVuelo() {
		return fechaPrimerVuelo;
	}


	public void setFechaPrimerVuelo(LocalDate fechaPrimerVuelo) {
		this.fechaPrimerVuelo = fechaPrimerVuelo;
	}


	public Long getEstatus() {
		return estatus;
	}


	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}


	public Long getIdAerolineas() {
		return idAerolineas;
	}


	public void setIdAerolineas(Long idAerolineas) {
		this.idAerolineas = idAerolineas;
	}

	
}
