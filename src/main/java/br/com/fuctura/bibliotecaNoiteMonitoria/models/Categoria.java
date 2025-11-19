package br.com.fuctura.bibliotecaNoiteMonitoria.models;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private Integer id;
    private String nome;
    private String descricao;
    private List<Livro> livros = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(String nome, String descricao, List<Livro> livros) {
        this.nome = nome;
        this.descricao = descricao;
        this.livros = livros;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
