package com.jose.producto.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.jose.commons.models.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
