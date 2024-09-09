package com.peliculas.spring.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peliculas.spring.peliculas.model.Peliculas;


public interface PeliculasRepository extends JpaRepository<Peliculas, Long>{
    
}