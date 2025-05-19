package com.jose.vuelo.servicies;

import java.util.List;
import java.util.Optional;


import com.jose.commons.dto.VueloDTOGet;
import com.jose.commons.dto.VueloDTOPost;
import com.jose.commons.servicies.CommonService;

public interface VueloService extends CommonService<VueloDTOPost> {
	
	List<VueloDTOGet> listarGet();
	
	Optional<VueloDTOGet> obtenerPorIdGet(Long id);
}
