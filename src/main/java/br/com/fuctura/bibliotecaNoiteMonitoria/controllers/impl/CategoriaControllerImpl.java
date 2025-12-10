package br.com.fuctura.bibliotecaNoiteMonitoria.controllers.impl;

import br.com.fuctura.bibliotecaNoiteMonitoria.controllers.CategoriaController;
import br.com.fuctura.bibliotecaNoiteMonitoria.dtos.CategoriaDTO;
import br.com.fuctura.bibliotecaNoiteMonitoria.models.Categoria;
import br.com.fuctura.bibliotecaNoiteMonitoria.services.CategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categoria")
public class CategoriaControllerImpl implements CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDTO> findById(@PathVariable Integer id) {
        Categoria categoria = categoriaService.findById(id);
        return ResponseEntity.ok().body(modelMapper.map(categoria, CategoriaDTO.class));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> findAll() {
        List<Categoria> list = categoriaService.findAll();
        return ResponseEntity.ok().body(list.stream().map(obj -> modelMapper.map(obj, CategoriaDTO.class))
                .collect(Collectors.toList()));

//        List<CategoriaDTO> listDTO = new ArrayList<>();
//        for(Categoria obj : list) {
//            catDTO.add(modelMapper.map(obj, CategoriaDTO.class));
//        }
//
//        return ResponseEntity.ok().body(listDTO);
    }

    @Override
    @PostMapping
    public ResponseEntity<CategoriaDTO> save(@RequestBody CategoriaDTO categoriaDTO) {
        Categoria categoria = modelMapper.map(categoriaDTO, Categoria.class);
        Categoria novaCategoria = categoriaService.save(categoria);
        return ResponseEntity.ok().body(modelMapper.map(novaCategoria, CategoriaDTO.class));
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<CategoriaDTO> update(@PathVariable Integer id, @RequestBody CategoriaDTO categoriaDTO) {
        categoriaDTO.setId(id);
        Categoria categoria = modelMapper.map(categoriaDTO, Categoria.class);
        Categoria cat = categoriaService.update(categoria);
        return ResponseEntity.ok().body(modelMapper.map(cat, CategoriaDTO.class));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
