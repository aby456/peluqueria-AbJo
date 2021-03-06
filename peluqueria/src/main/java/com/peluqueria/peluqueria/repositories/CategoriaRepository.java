package com.peluqueria.peluqueria.repositories;

import com.peluqueria.peluqueria.models.Categoria;
import com.peluqueria.peluqueria.models.Servicio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    public List<Categoria> findByServicio(Servicio servicio);
}
