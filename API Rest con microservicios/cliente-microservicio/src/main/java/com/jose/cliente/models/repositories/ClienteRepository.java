package com.jose.cliente.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jose.commons.models.entities.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{
	
	

}
