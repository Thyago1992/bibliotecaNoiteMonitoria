package br.com.fuctura.bibliotecaNoiteMonitoria.models;

import br.com.fuctura.bibliotecaNoiteMonitoria.enums.Edicao;

public class Livro {
    private Integer id;
    private String nome;
    private String autor;
    private String texto;
    private Categoria categoria;
    private Edicao edicao;

    public Livro() {
    }

    public Livro(String nome, String autor, String texto, Categoria categoria, Edicao edicao) {
        this.nome = nome;
        this.autor = autor;
        this.texto = texto;
        this.categoria = categoria;
        this.edicao = edicao;
    }

    public Integer getId() {
        return id;
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
