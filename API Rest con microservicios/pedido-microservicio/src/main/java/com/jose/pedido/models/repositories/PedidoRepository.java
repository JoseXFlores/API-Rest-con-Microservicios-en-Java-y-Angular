package com.jose.pedido.models.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jose.commons.models.entities.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long>  {	
	
	@Query("SELECT DISTINCT p FROM Pedido p " +
			       "LEFT JOIN p.productos prod " +
			       "WHERE LOWER(p.idCliente.nombre) LIKE LOWER(CONCAT('%', :letra, '%')) " +
			       "OR LOWER(prod.nombre) LIKE LOWER(CONCAT('%', :letra, '%'))")
		List<Pedido> buscarPorLetraEnNombreCliente(@Param("letra") String letra);
		List<Pedido> findByEstado(Long estado);
	

	

}
