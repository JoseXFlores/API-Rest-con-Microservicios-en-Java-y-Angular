package com.jose.aerolinea.mappers;


import org.springframework.stereotype.Component;

import com.jose.aerolinea.models.repositories.AerolineaRepository;
import com.jose.commons.dto.AerolineaDTO;
import com.jose.commons.mappers.CommonMapper;
import com.jose.commons.models.entities.Aerolinea;


@Component
public class AerolineaMapper extends CommonMapper<AerolineaDTO,Aerolinea, AerolineaRepository>{

	@Override
	public AerolineaDTO entityToDTO(Aerolinea entity) {
		if (entity != null) {
			AerolineaDTO dto = new AerolineaDTO();
			dto.setId(entity.getId());
			dto.setNombre(entity.getNombre());
			dto.setIata(entity.getIata());
			dto.setEstatus(entity.getEstatus());
			dto.setPais(entity.getPais());
			dto.setFechaFundacion(entity.getFechaFundacion());
			return dto;
		}
		return null;
	}

	@Override
	public Aerolinea dtoEntity(AerolineaDTO dto) {
			if (dto != null) {
			Aerolinea entity = new Aerolinea();
			entity.setId(dto.getId());
			entity.setNombre(dto.getNombre());
			entity.setIata(dto.getIata());
			entity.setEstatus(dto.getEstatus());
			entity.setPais(dto.getPais());
			entity.setFechaFundacion(dto.getFechaFundacion());
			return entity;
		}
		return null;
	}

}
