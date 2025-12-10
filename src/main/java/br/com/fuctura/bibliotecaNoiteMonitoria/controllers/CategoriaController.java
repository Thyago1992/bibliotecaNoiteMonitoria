package br.com.fuctura.bibliotecaNoiteMonitoria.controllers;

import br.com.fuctura.bibliotecaNoiteMonitoria.dtos.CategoriaDTO;
import br.com.fuctura.bibliotecaNoiteMonitoria.models.Categoria;
import org.apache.catalina.LifecycleState;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoriaController {
    ResponseEntity<CategoriaDTO> findById(Integer id);
    ResponseEntity<List<CategoriaDTO>> findAll();
    ResponseEntity<CategoriaDTO> save(CategoriaDTO categoriaDTO);
    ResponseEntity<CategoriaDTO> update(Integer id, CategoriaDTO categoriaDTO);
    ResponseEntity<Void> delete(Integer id);
}
