package com.jose.cliente.mappers;

import org.springframework.stereotype.Component;

import com.jose.cliente.models.repositories.ClienteRepository;
import com.jose.commons.dto.ClienteDTO;
import com.jose.commons.mappers.CommonMapper;
import com.jose.commons.models.entities.Cliente;


@Component
public class ClienteMapper extends CommonMapper<ClienteDTO,Cliente, ClienteRepository>{

	@Override
	public ClienteDTO entityToDTO(Cliente entity) {
		if (entity != null) {
			ClienteDTO dto = new ClienteDTO();
			dto.setId(entity.getId());
			dto.setNombre(entity.getNombre());
			dto.setApellido(entity.getApellido());
			dto.setEmail(entity.getEmail());
			dto.setTelefono(entity.getTelefono());
			dto.setDireccion(entity.getDireccion());
			return dto;
		}
		return null;
	}

	@Override
	public Cliente dtoEntity(ClienteDTO dto) {
			if (dto != null) {
			Cliente entity = new Cliente();
			entity.setId(dto.getId());
			entity.setNombre(dto.getNombre());
			entity.setApellido(dto.getApellido());
			entity.setEmail(dto.getEmail());
			entity.setTelefono(dto.getTelefono());
			entity.setDireccion(dto.getDireccion());
			
			return entity;
		}
		return null;
	}

}
