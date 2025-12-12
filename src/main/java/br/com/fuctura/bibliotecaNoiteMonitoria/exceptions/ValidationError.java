package br.com.fuctura.bibliotecaNoiteMonitoria.exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    List<FieldMessage> erros = new ArrayList<>();

    public ValidationError(LocalDateTime timestamp, Integer status, String message, String path) {
        super(timestamp, status, message, path);
    }

    public List<FieldMessage> getErros() {
        return erros;
    }

    public void addErros(String field, String defaulMessage) {
        this.erros.add(new FieldMessage(field, defaulMessage));
    }
}
