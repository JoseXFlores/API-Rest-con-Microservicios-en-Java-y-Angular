package com.jose.cliente.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jose.cliente.mappers.ClienteMapper;
import com.jose.cliente.models.repositories.ClienteRepository;
import com.jose.commons.dto.ClienteDTO;
import com.jose.commons.models.entities.Cliente;
import com.jose.commons.servicies.CommonServiceImpl;

@Service
public class ClienteServiceImpl  extends
CommonServiceImpl<ClienteDTO,Cliente,ClienteMapper,ClienteRepository> implements ClienteService{

	@Override
	@Transactional(readOnly =true)
	public List<ClienteDTO> listar() {
		List<ClienteDTO> dtos = new ArrayList<>();
		repository.findAll().forEach(cliente -> {
			dtos.add(mapper.entityToDTO(cliente));
		});
		return dtos;
	}

	@Override
	@Transactional(readOnly =true)
	public Optional<ClienteDTO> obtenerPorId(Long id) {
		Optional<Cliente> cliente =repository.findById(id);
		if(cliente.isPresent()) {
			return Optional.of(mapper.entityToDTO(cliente.get()));
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public ClienteDTO editar(ClienteDTO dto, Long id) {
		Optional<Cliente> cliente =repository.findById(id);
		if(cliente.isPresent()) {
			Cliente clienteDB = mapper.dtoEntity(dto);
			clienteDB.setId(id);
			repository.save(clienteDB);
			return mapper.entityToDTO(clienteDB);
		}
		return null;
	}

	@Override
	@Transactional
	public ClienteDTO insertar(ClienteDTO dto) {
		Cliente cliente = mapper.dtoEntity(dto);
		repository.save(cliente);
		return mapper.entityToDTO(cliente);
	}

	@Override 
	@Transactional
	public ClienteDTO eliminar(Long id) {
		Optional<Cliente> cliente =repository.findById(id);
		if(cliente.isPresent()) {
			repository.deleteById(id);
			return mapper.entityToDTO(cliente.get());
		}
		return null;
	}
}
