package br.com.fuctura.bibliotecaNoiteMonitoria.controllers.impl;

import br.com.fuctura.bibliotecaNoiteMonitoria.controllers.LivroController;
import br.com.fuctura.bibliotecaNoiteMonitoria.dtos.LivroDTO;
import br.com.fuctura.bibliotecaNoiteMonitoria.models.Livro;
import br.com.fuctura.bibliotecaNoiteMonitoria.repositories.CategoriaRepository;
import br.com.fuctura.bibliotecaNoiteMonitoria.services.LivroService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/livro")
public class LivroControllerImpl implements LivroController {

    @Autowired
    LivroService livroService;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<LivroDTO> findById(@PathVariable Integer id) {
        Livro livro = livroService.findById(id);
        return ResponseEntity.ok().body(modelMapper.map(livro, LivroDTO.class));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<LivroDTO>> findAll() {
        List<Livro> list = livroService.findAll();
        return ResponseEntity.ok().body(list.stream().map(obj -> modelMapper.map(obj, LivroDTO.class))
                .collect(Collectors.toList()));

//        List<LivroDTO> listDTO = new ArrayList<>();
//        for(Categoria obj : list) {
//            livroDTO.add(modelMapper.map(obj, LivroDTO.class));
//        }
//
//        return ResponseEntity.ok().body(listDTO);
    }

    @Override
    @PostMapping
    public ResponseEntity<LivroDTO> save(@RequestBody LivroDTO livroDTO) {
        Livro livro = modelMapper.map(livroDTO, Livro.class);
        Livro novoLivro = livroService.save(livro);
        return ResponseEntity.ok().body(modelMapper.map(novoLivro, LivroDTO.class));
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<LivroDTO> update(@PathVariable Integer id, @RequestBody LivroDTO livroDTO) {
        livroDTO.setId(id);
        Livro livro = modelMapper.map(livroDTO, Livro.class);
        Livro l = livroService.update(id, livro);
        return ResponseEntity.ok().body(modelMapper.map(l, LivroDTO.class));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        livroService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
