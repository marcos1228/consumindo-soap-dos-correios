package com.br.cep.BuscarCep.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiException {
    private String message;
    @JsonProperty("status_code")
    private String statusCode;

    public ApiException(String message, String statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
