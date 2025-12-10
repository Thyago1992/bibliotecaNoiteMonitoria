package br.com.fuctura.bibliotecaNoiteMonitoria.services;

import br.com.fuctura.bibliotecaNoiteMonitoria.models.Livro;
import br.com.fuctura.bibliotecaNoiteMonitoria.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro findById(Integer id) {
        Optional<Livro> livro = livroRepository.findById(id);
        return livro.get();
    }

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro update(Integer id, Livro livro) {
        livro.setId(id);
        return livroRepository.save(livro);
    }

    public void delete(Integer id) {
        livroRepository.deleteById(id);
    }

}
