package com.peliculas.spring.peliculas.service;

import com.peliculas.spring.peliculas.model.Peliculas;
import java.util.List;
import java.util.Optional;

public interface PeliculasService {
    List<Peliculas> getAllPeliculas();
    Optional<Peliculas> getPeliculasById(Long id);
    Peliculas createPeliculas(Peliculas peliculas);
    Peliculas updatPeliculas ( Long id, Peliculas peliculas);
    void deletePeliculas(Long id);
    
}
