package com.sistemaventas.chuman.sistemaventas.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import com.sistemaventas.chuman.sistemaventas.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>, JpaSpecificationExecutor<Usuario> {
  @Query("SELECT U FROM Usuario U WHERE U.email=:correo AND U.clave=:password")
  Optional<Usuario> login(String correo, String password);
}
