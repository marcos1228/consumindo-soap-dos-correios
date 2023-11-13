package com.br.cep.BuscarCep.client;

import com.br.cep.BuscarCep.bindings.ConsultaCEP;
import com.br.cep.BuscarCep.bindings.ConsultaCEPResponse;
import com.br.cep.BuscarCep.bindings.ObjectFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class CorreiosClient extends WebServiceGatewaySupport {

    public ConsultaCEPResponse buscarDetalhesCep(String cep) {
        ObjectFactory objectFactory = new ObjectFactory();
        ConsultaCEP consultaCEP = objectFactory.createConsultaCEP();
        consultaCEP.setCep(cep);
        JAXBElement<ConsultaCEP> jaxbRequest = objectFactory.createConsultaCEP(consultaCEP);

        JAXBElement<ConsultaCEPResponse> jaxbResponse = (JAXBElement<ConsultaCEPResponse>) getWebServiceTemplate().marshalSendAndReceive(jaxbRequest);
        return jaxbResponse.getValue();
    }
}
