package br.com.fuctura.bibliotecaNoiteMonitoria.exceptions;

public class ObjectNotFoundException extends RuntimeException{
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
