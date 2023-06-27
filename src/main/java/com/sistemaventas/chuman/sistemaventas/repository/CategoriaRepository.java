package com.sistemaventas.chuman.sistemaventas.repository;

import com.sistemaventas.chuman.sistemaventas.entity.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
    @Query("SELECT C FROM Categoria C WHERE C.vigencia = true")
    Iterable<Categoria> listarCategoriasActivas();
}
