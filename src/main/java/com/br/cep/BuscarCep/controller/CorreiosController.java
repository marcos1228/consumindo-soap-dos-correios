package com.br.cep.BuscarCep.controller;

import com.br.cep.BuscarCep.bindings.ConsultaCEPResponse;
import com.br.cep.BuscarCep.client.CorreiosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorreiosController {

    @Autowired
    private CorreiosClient correiosClient;

    @GetMapping("{cep}")
    public ConsultaCEPResponse buscarDetalhes(@PathVariable String cep) {
        return this.correiosClient.buscarDetalhesCep(cep);
    }

}
