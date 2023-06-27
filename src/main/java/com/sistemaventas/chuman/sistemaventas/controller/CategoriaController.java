package com.sistemaventas.chuman.sistemaventas.controller;

import com.sistemaventas.chuman.sistemaventas.service.CategoriaService;
import com.sistemaventas.chuman.sistemaventas.utils.GenericResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categoria")
public class CategoriaController {
    private final CategoriaService service;


    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse listarCategoriasActivas(){
        return this.service.listarCategoriasActivas();
    }
}
