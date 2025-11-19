package br.com.fuctura.bibliotecaNoiteMonitoria.enums;

public enum Edicao {
    PRIMEIRA(1, "Primeira Edição"),
    SEGUNDA(2, "Segunda Edição"),
    TERCEIRA(3, "Terceira Edição");

    private final Integer numero;
    private final String descricao;

    Edicao(Integer numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }
}
