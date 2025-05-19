package com.jose.commons.dto;

import java.time.LocalDate;

public class VueloDTOGet {
	
	   	private Long id;
	   	
	    private String codigoVuelo;
	    
	    private String avion;
	    
	    private String origen;
	    
	    private String destino;
	    
	    private LocalDate fechaSalida;
	    
	    private Long estatus;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCodigoVuelo() {
			return codigoVuelo;
		}

		public void setCodigoVuelo(String codigoVuelo) {
			this.codigoVuelo = codigoVuelo;
		}

		public String getAvion() {
			return avion;
		}

		public void setAvion(String avion) {
			this.avion = avion;
		}

		public String getOrigen() {
			return origen;
		}

		public void setOrigen(String origen) {
			this.origen = origen;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public LocalDate getFechaSalida() {
			return fechaSalida;
		}

		public void setFechaSalida(LocalDate fechaSalida) {
			this.fechaSalida = fechaSalida;
		}

		public Long getEstatus() {
			return estatus;
		}

		public void setEstatus(Long estatus) {
			this.estatus = estatus;
		}



}
