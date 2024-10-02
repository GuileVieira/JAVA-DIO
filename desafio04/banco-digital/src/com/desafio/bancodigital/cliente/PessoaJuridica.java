package com.desafio.bancodigital.cliente;

import com.desafio.bancodigital.agencia.Agencia;

public class PessoaJuridica extends Cliente {

    private String cnpj;
    private String dataAbertura;
    private String razaoSocial;
    
    public PessoaJuridica(Agencia agencia, String nome, String cnpj, String dataAbertura, String razaoSocial) {
        this.agencia = agencia;
        this.nome = nome;
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
    public String getDataAbertura() {
        return dataAbertura;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    
} 