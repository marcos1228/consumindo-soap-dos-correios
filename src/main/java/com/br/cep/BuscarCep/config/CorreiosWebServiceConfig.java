package com.br.cep.BuscarCep.config;

import com.br.cep.BuscarCep.client.CorreiosClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CorreiosWebServiceConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.br.cep.BuscarCep.bindings");
        return marshaller;
    }

    @Bean
    public CorreiosClient correiosClient(Jaxb2Marshaller marshaller) {
        CorreiosClient client = new CorreiosClient();
        client.setDefaultUri("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
