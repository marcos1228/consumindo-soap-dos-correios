package com.br.cep.BuscarCep.exception;

public class PostalCodeInvalidException extends RuntimeException{
    public PostalCodeInvalidException(String cepInformadoÉInvalido) {
        super(cepInformadoÉInvalido);
    }
}
