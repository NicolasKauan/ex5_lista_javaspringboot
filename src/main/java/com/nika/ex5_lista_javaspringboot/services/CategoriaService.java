package com.nika.ex5_lista_javaspringboot.services;

import com.nika.ex5_lista_javaspringboot.models.Categoria;
import com.nika.ex5_lista_javaspringboot.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}