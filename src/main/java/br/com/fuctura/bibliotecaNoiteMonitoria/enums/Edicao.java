package br.com.fuctura.bibliotecaNoiteMonitoria.enums;

public enum Edicao {
    PRIMEIRA(0),
    SEGUNDA(1),
    TERCEIRA(2);

    private final Integer numero;

    Edicao(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

}
