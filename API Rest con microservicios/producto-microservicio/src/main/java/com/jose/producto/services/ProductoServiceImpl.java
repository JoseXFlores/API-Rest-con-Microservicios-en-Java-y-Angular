package com.jose.producto.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.jose.commons.dto.ProductoDTO;

import com.jose.commons.models.entities.Producto;
import com.jose.commons.servicies.CommonServiceImpl;
import com.jose.producto.mappers.ProductoMapper;
import com.jose.producto.models.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl  extends
CommonServiceImpl<ProductoDTO,Producto,ProductoMapper,ProductoRepository> implements ProductoService{

	@Override
	@Transactional(readOnly =true)
	public List<ProductoDTO> listar() {
		List<ProductoDTO> dtos = new ArrayList<>();
		repository.findAll().forEach(producto -> {
			dtos.add(mapper.entityToDTO(producto));
		});
		return dtos;
	}

	@Override
	@Transactional(readOnly =true)
	public Optional<ProductoDTO> obtenerPorId(Long id) {
		Optional<Producto> producto =repository.findById(id);
		if(producto.isPresent()) {
			return Optional.of(mapper.entityToDTO(producto.get()));
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public ProductoDTO editar(ProductoDTO dto, Long id) {
		Optional<Producto> producto =repository.findById(id);
		if(producto.isPresent()) {
			Producto productoDb = mapper.dtoEntity(dto);
			productoDb.setId(id);
			repository.save(productoDb);
			return mapper.entityToDTO(productoDb);
		}
		return null;
	}

	@Override
	@Transactional
	public ProductoDTO insertar(ProductoDTO dto) {
		Producto producto = mapper.dtoEntity(dto);
		repository.save(producto);
		return mapper.entityToDTO(producto);
	}

	@Override 
	@Transactional
	public ProductoDTO eliminar(Long id) {
		Optional<Producto> producto =repository.findById(id);
		if(producto.isPresent()) {
			repository.deleteById(id);
			return mapper.entityToDTO(producto.get());
		}
		return null;
	}
}
