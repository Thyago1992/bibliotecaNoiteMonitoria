package br.com.fuctura.bibliotecaNoiteMonitoria.services;

import br.com.fuctura.bibliotecaNoiteMonitoria.exceptions.ObjectNotFoundException;
import br.com.fuctura.bibliotecaNoiteMonitoria.models.Categoria;
import br.com.fuctura.bibliotecaNoiteMonitoria.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(() -> new ObjectNotFoundException("Categoria não encontrada"));
    }

    public List<Categoria> findAll() {
        List<Categoria> list = categoriaRepository.findAll();
        if(list.isEmpty()){
            throw new ObjectNotFoundException("Nenhuma categoria encontrada.");
        }
        return list;
    }

    public Categoria save(Categoria categoria) {
        buscarPorNome(categoria);
        return categoriaRepository.save(categoria);
    }

    public Categoria update(Categoria categoria) {
        findById(categoria.getId());
        buscarPorNome(categoria);
        return categoriaRepository.save(categoria);

    }

    public void delete(Integer id) {
        categoriaRepository.deleteById(id);
    }

    private void buscarPorNome(Categoria categoria){
        Optional<Categoria> cat = categoriaRepository.findByNomeIgnoreCaseContaining(categoria.getNome());
        if (cat.isPresent()){
            if(cat.get().getId() != categoria.getId()){
                throw new IllegalArgumentException("Categoria com esse nome já existe.");
            }
        }
    }
}