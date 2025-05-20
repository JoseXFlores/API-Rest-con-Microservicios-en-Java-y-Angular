package com.jose.commons.dto;

import java.time.LocalDate;
import java.util.List;

public class PedidoDTOGet {
	
	   	private Long id;
	   	
	    private String idCliente;
	    
	    private List<String> productos;
	    
	    private Long total;
	   
	    private LocalDate fecha;
	    
	    private Long estado;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(String idCliente) {
			this.idCliente = idCliente;
		}

		public List<String> getProductos() {
			return productos;
		}

		public void setProductos(List<String> productos) {
			this.productos = productos;
		}

		public Long getTotal() {
			return total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public Long getEstado() {
			return estado;
		}

		public void setEstado(Long estado) {
			this.estado = estado;
		}


}
