package br.com.fuctura.bibliotecaNoiteMonitoria.controllers;

import br.com.fuctura.bibliotecaNoiteMonitoria.dtos.LivroDTO;
import br.com.fuctura.bibliotecaNoiteMonitoria.models.Livro;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LivroController {
    ResponseEntity<LivroDTO> findById(Integer id);
    ResponseEntity<List<LivroDTO>> findAll();
    ResponseEntity<LivroDTO> save(LivroDTO livroDTO);
    ResponseEntity<LivroDTO> update(Integer id, LivroDTO livroDTO);
    ResponseEntity<Void> delete(Integer id);

}
