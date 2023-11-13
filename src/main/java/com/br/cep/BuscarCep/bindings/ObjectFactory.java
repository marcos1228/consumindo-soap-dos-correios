//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.11.23 às 11:12:36 PM BRT 
//


package com.br.cep.BuscarCep.bindings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.consumidorsoap.bindings package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultaCEP_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEP");
    private final static QName _ConsultaCEPResponse_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "consultaCEPResponse");
    private final static QName _SigepClienteException_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "SigepClienteException");
    private final static QName _AutenticacaoException_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AutenticacaoException");
    private final static QName _Exception_QNAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.consumidorsoap.bindings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaCEPResponse }
     * 
     */
    public ConsultaCEPResponse createConsultaCEPResponse() {
        return new ConsultaCEPResponse();
    }


    /**
     * Create an instance of {@link java.lang.Exception }
     * 
     */
    public java.lang.Exception createException() {
        return new java.lang.Exception();
    }


    /**
     * Create an instance of {@link UnidadePostagemERP }
     * 
     */
    public UnidadePostagemERP createUnidadePostagemERP() {
        return new UnidadePostagemERP();
    }

    /**
     * Create an instance of {@link EnderecoERP }
     * 
     */
    public EnderecoERP createEnderecoERP() {
        return new EnderecoERP();
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCEPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "consultaCEPResponse")
    public JAXBElement<ConsultaCEPResponse> createConsultaCEPResponse(ConsultaCEPResponse value) {
        return new JAXBElement<ConsultaCEPResponse>(_ConsultaCEPResponse_QNAME, ConsultaCEPResponse.class, null, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "SigepClienteException")
    public JAXBElement<String> createSigepClienteException(String value) {
        return new JAXBElement<String>(_SigepClienteException_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "AutenticacaoException")
    public JAXBElement<String> createAutenticacaoException(String value) {
        return new JAXBElement<String>(_AutenticacaoException_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "Exception")
    public JAXBElement<java.lang.Exception> createException(java.lang.Exception value) {
        return new JAXBElement<java.lang.Exception>(_Exception_QNAME, java.lang.Exception.class, null, value);
    }

    /**
     * Create an instance of {@link ConsultaCEP }
     *
     */
    public ConsultaCEP createConsultaCEP() {
        return new ConsultaCEP();
    }

    @XmlElementDecl(namespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/", name = "consultaCEP")
    public JAXBElement<ConsultaCEP> createConsultaCEP(ConsultaCEP value) {
        return new JAXBElement<ConsultaCEP>(_ConsultaCEP_QNAME, ConsultaCEP.class, null, value);
    }

}