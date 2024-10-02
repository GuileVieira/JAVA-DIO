package com.desafio.bancodigital.cliente;

import com.desafio.bancodigital.agencia.Agencia;
import com.desafio.bancodigital.agencia.conta.Conta;

public abstract class Cliente {
    protected Agencia agencia;
    protected Conta conta;
    protected String nome;
    protected String endereco;

    
    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }  

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
