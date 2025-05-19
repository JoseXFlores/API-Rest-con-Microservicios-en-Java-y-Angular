package com.jose.producto.mappers;


import org.springframework.stereotype.Component;

import com.jose.commons.dto.ProductoDTO;
import com.jose.commons.mappers.CommonMapper;
import com.jose.commons.models.entities.Producto;
import com.jose.producto.models.repositories.ProductoRepository;


@Component
public class ProductoMapper extends CommonMapper<ProductoDTO,Producto, ProductoRepository>{

	@Override
	public ProductoDTO entityToDTO(Producto entity) {
		if (entity != null) {
			ProductoDTO dto = new ProductoDTO();
			dto.setId(entity.getId());
			dto.setNombre(entity.getNombre());
			dto.setDescripcion(entity.getDescripcion());
			dto.setPrecio(entity.getPrecio());
			dto.setStock(entity.getStock());
			return dto;
		}
		return null;
	}

	@Override
	public Producto dtoEntity(ProductoDTO dto) {
			if (dto != null) {
			Producto entity = new Producto();
			entity.setId(dto.getId());
			entity.setNombre(dto.getNombre());
			entity.setDescripcion(dto.getDescripcion());
			entity.setPrecio(dto.getPrecio());
			entity.setStock(dto.getStock());
			

			return entity;
		}
		return null;
	}

}
