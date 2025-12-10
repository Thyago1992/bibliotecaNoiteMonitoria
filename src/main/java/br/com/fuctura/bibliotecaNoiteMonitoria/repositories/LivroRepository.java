package br.com.fuctura.bibliotecaNoiteMonitoria.repositories;

import br.com.fuctura.bibliotecaNoiteMonitoria.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository <Livro, Integer> {
}
