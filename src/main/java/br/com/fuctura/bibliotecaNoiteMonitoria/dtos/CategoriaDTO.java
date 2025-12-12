package br.com.fuctura.bibliotecaNoiteMonitoria.dtos;

import br.com.fuctura.bibliotecaNoiteMonitoria.models.Livro;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDTO {

    private Integer id;
    @NotNull(message = "O campo nome da categoria é obrigatório")
    @Length(min = 5, max = 15, message = "O nome da categoria deve ter entre 5 e 15 caracteres")
    private String nome;

    @NotNull(message = "O campo descrição da categoria é obrigatória")
    @Length(min = 5, max = 25, message = "A descrição da categoria deve ter entre 5 e 25 caracteres")
    private String descricao;
    private List<Livro> livros = new ArrayList<>();

}