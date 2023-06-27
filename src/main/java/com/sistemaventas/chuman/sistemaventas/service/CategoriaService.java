package com.sistemaventas.chuman.sistemaventas.service;

import com.sistemaventas.chuman.sistemaventas.repository.CategoriaRepository;
import com.sistemaventas.chuman.sistemaventas.utils.GenericResponse;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static com.sistemaventas.chuman.sistemaventas.utils.Global.*;

@Service
@Transactional
public class CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }
    public GenericResponse listarCategoriasActivas(){
        return new GenericResponse(TIPO_DATA, RPTA_OK, OPERACION_CORRECTA, this.repository.listarCategoriasActivas());
    }
}
