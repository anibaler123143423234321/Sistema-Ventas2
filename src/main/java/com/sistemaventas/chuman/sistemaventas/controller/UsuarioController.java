package com.sistemaventas.chuman.sistemaventas.controller;

import com.sistemaventas.chuman.sistemaventas.entity.Usuario;
import com.sistemaventas.chuman.sistemaventas.service.UsuarioService;
import com.sistemaventas.chuman.sistemaventas.utils.GenericResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @RequestMapping(value="/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse<Usuario> login(@RequestParam("email") String email, @RequestParam("pass") String contrasenia){
        return this.service.login(email, contrasenia);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse save(@RequestBody Usuario u){
        return this.service.guardarUsuario(u);
    }
}