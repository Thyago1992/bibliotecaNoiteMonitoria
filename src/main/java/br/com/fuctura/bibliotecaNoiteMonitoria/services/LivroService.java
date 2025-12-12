package br.com.fuctura.bibliotecaNoiteMonitoria.services;

import br.com.fuctura.bibliotecaNoiteMonitoria.exceptions.ObjectNotFoundException;
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

    @Autowired
    private CategoriaService categoriaService;

    public Livro findById(Integer id) {
        Optional<Livro> livro = livroRepository.findById(id);
        return livro.orElseThrow(() -> new ObjectNotFoundException("Livro não encontrado"));
    }

    public List<Livro> findAll() {
        List<Livro> list = livroRepository.findAll();
        if(list.isEmpty()){
            throw new ObjectNotFoundException("Nenhum livro encontrado.");
        }
        return list;
    }

    public Livro save(Livro livro) {
        validarLivroDuplicado(livro);
        return livroRepository.save(livro);
    }

    public Livro update(Livro livro) {
        findById(livro.getId());
        validarLivroDuplicado(livro);
        return livroRepository.save(livro);
    }

    public void delete(Integer id) {
        findById(id);
        livroRepository.deleteById(id);
    }

    private void validarLivroDuplicado(Livro livro) {
        livroRepository.findByNomeAndAutorAndEdicao(
                livro.getNome(),
                livro.getAutor(),
                livro.getEdicao()
        ).ifPresent(livroExistente -> {
            // Se o ID do livro for null (novo) OU for diferente do existente
            if (livro.getId() == null || !livroExistente.getId().equals(livro.getId())) {
                throw new IllegalArgumentException(
                        "Já existe um livro com este nome, autor e edição cadastrados"
                );
            }
        });
    }

}
