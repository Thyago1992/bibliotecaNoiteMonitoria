package br.com.fuctura.bibliotecaNoiteMonitoria.dtos;

import br.com.fuctura.bibliotecaNoiteMonitoria.enums.Edicao;
import br.com.fuctura.bibliotecaNoiteMonitoria.models.Categoria;

public class LivroDTO {
    private Integer id;
    private String nome;
    private String autor;
    private String texto;
    private Categoria categoria;
    private Edicao edicao;

    public LivroDTO() {
    }

    public LivroDTO(Integer id, String nome, String autor, String texto, Edicao edicao, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.texto = texto;
        this.categoria = categoria;
        this.edicao = edicao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Edicao getEdicao() {
        return edicao;
    }

    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }
}
