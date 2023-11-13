package com.br.cep.BuscarCep.utils;

import com.br.cep.BuscarCep.exception.PostalCodeInvalidException;

public class Utils {
    private Utils() {
    }

    public static final void validatePostalCode(String postalCode) {
        if (postalCode.length() > 8 || postalCode.length() < 8) {
            throw new PostalCodeInvalidException("CEP informado é invalido");
        } else {
            char[] codes = postalCode.toCharArray();
            for (int i = 0; i < codes.length; i++) {
                if (!Character.isDigit(codes[i])) {
                    throw new PostalCodeInvalidException("CEP informado é invalido");
                }
            }
        }
    }
}
