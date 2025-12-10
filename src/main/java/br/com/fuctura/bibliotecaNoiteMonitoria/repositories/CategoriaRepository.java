package br.com.fuctura.bibliotecaNoiteMonitoria.repositories;

import br.com.fuctura.bibliotecaNoiteMonitoria.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer>  {

    Optional<Categoria> findByNomeIgnoreCaseContaining(String nome);

}
