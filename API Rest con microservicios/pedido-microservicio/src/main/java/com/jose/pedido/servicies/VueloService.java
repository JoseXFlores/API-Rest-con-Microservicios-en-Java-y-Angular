package com.jose.pedido.servicies;

import java.util.List;
import java.util.Optional;


import com.jose.commons.dto.PedidoDTOGet;
import com.jose.commons.dto.PedidoDTOPost;
import com.jose.commons.servicies.CommonService;

public interface VueloService extends CommonService<PedidoDTOPost> {
	
	List<PedidoDTOGet> listarGet();
	
	Optional<PedidoDTOGet> obtenerPorIdGet(Long id);
}
