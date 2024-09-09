package com.peliculas.spring.peliculas.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.peliculas.spring.peliculas.model.Peliculas;
import com.peliculas.spring.peliculas.service.PeliculasService;


import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/peliculas")

public class PeliculasController {
    @Autowired
    private PeliculasService peliculasService;

    @GetMapping
    public List<Peliculas> getAllPeliculas(){
        return peliculasService.getAllPeliculas();
    }

    @GetMapping("/{id}")
    public Optional<Peliculas> getPeliculasById(@PathVariable Long id){
        return peliculasService.getPeliculasById(id);
    }
    @PostMapping
    public Peliculas createPeliculas(@RequestBody Peliculas peliculas){
        return peliculasService.createPeliculas(peliculas);
    }

    @PutMapping ("/{id}")
    public Peliculas updatePeliculas(@PathVariable Long id, @RequestBody Peliculas peliculas){
        return peliculasService.updatPeliculas(id, peliculas);

    }

    @DeleteMapping ("/{id}")
    public void deletePeliculas(@PathVariable Long id){
        peliculasService.deletePeliculas(id);
    }
         
    
}
