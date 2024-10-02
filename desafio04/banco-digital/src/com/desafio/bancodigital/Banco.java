package com.desafio.bancodigital;

import java.util.HashSet;
import java.util.Set;

import com.desafio.bancodigital.agencia.Agencia;

public class Banco {
    private int id_banco;
    private String nomeBanco;
    private Set<Agencia> agencias = new HashSet<>();

    public Banco(int id_banco, String nomeBanco) {
    this.id_banco = id_banco;
    this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public int getid_banco() {
        return id_banco;
    }

    public void setid_banco(int id_banco) {
        this.id_banco = id_banco;
    }

    public Set<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(Set<Agencia> agencias) {
        this.agencias = agencias;
    }

    public void AddAgencia(Agencia agencia) {
    this.agencias.add(agencia);
    }

}
