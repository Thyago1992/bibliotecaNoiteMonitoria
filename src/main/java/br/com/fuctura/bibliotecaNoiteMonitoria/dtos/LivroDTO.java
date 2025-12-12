package br.com.fuctura.bibliotecaNoiteMonitoria.dtos;

import br.com.fuctura.bibliotecaNoiteMonitoria.enums.Edicao;
import br.com.fuctura.bibliotecaNoiteMonitoria.models.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO {

    private Integer id;
    private String nome;
    private String autor;
    private String texto;
    private Categoria categoria;
    private Edicao edicao;

}