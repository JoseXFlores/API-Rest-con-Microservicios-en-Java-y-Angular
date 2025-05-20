package com.jose.commons.servicies;

import java.util.List;
import java.util.Optional;


public interface CommonService<D> {
	
	List<D> listar ();
	
	Optional<D> obtenerPorId(Long id);
	
	D editar(D dto, Long id);
	
	D insertar(D dto);
	
	D eliminar(Long id);
	
	



}
