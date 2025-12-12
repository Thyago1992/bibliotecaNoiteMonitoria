package br.com.fuctura.bibliotecaNoiteMonitoria.repositories;

import br.com.fuctura.bibliotecaNoiteMonitoria.enums.Edicao;
import br.com.fuctura.bibliotecaNoiteMonitoria.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository <Livro, Integer> {
    boolean existsByCategoriaId(Integer categoriaId);
    Optional<Livro> findByNomeAndAutorAndEdicao(String nome, String autor, Edicao edicao);
}
