package com.nika.ex5_lista_javaspringboot.repositories;

import com.nika.ex5_lista_javaspringboot.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}