package com.jose.commons.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CommonMapper <D,E, R extends JpaRepository<E, Long>> {
	
	@Autowired
	protected R repository;
	
	protected abstract D entityToDTO(E entity);
	
	protected abstract E dtoEntity(D dto);


}
