package com.jose.commons.models.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "PEDIDOS")
@Entity	
public class Pedido {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PEDIDOS_SEQ")
	    @SequenceGenerator(name = "PEDIDOS_SEQ", sequenceName = "PEDIDOS_SEQ", allocationSize = 1)
		
	    @Column (name= "ID_PEDIDO")
	    private Long id;
	    
		@Column (name= "ID_CLIENTE")
	    private String nombre;
		
		@ManyToMany
		@JoinColumn(name="ID_PRODUCTO", referencedColumnName="ID_PRODUCTO")
		private List<Producto> listaProductos;
	    
		@ManyToMany(cascade = CascadeType.MERGE)
		@JoinTable(
				name = "TOTAL",
				joinColumns = @JoinColumn(name = "ID_PEDIDOS"),
				inverseJoinColumns = @JoinColumn(name = "ID_PRODUCTO")
		)
		
		private Set<Producto> productos;
	    
		@Column(name = "TOTAL")
		private Integer total;

		@Column (name= "FECHA_CREACION ")
	    private LocalDate fecha;
		
		@Column(name = "ID_ESTATUS")
	    private Long estatus;

		public Pedido() {
			
			this.productos = new HashSet<>();
	
		}

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

		public List<Producto> getListaProductos() {
			return listaProductos;
		}

		public void setListaProductos(List<Producto> listaProductos) {
			this.listaProductos = listaProductos;
		}

		public Set<Producto> getProductos() {
			return productos;
		}

		public void setProductos(Set<Producto> productos) {
			this.productos = productos;
		}

		public Integer getTotal() {
			return total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public Long getEstatus() {
			return estatus;
		}

		public void setEstatus(Long estatus) {
			this.estatus = estatus;
		}
	
	
}
