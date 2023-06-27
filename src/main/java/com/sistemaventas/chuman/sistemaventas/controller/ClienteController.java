package com.sistemaventas.chuman.sistemaventas.controller;


import com.sistemaventas.chuman.sistemaventas.entity.Cliente;
import com.sistemaventas.chuman.sistemaventas.service.ClienteService;
import com.sistemaventas.chuman.sistemaventas.utils.GenericResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse save(@Valid @RequestBody Cliente c){
        return this.service.save(c);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse update(@PathVariable int id, @Valid @RequestBody Cliente c){
        c.setId(id);
        return this.service.save(c);
    }
}
