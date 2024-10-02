package com.desafio.bancodigital.agencia;

import java.util.HashSet;
import java.util.Set;

import com.desafio.bancodigital.agencia.servicos.Servicos;
import com.desafio.bancodigital.cliente.Cliente;
public class Agencia {
    private String id_agencia;
    private Set<Cliente> clientes = new HashSet<>();
    private Set<Servicos> servicos = new HashSet<>();

    public Agencia(String id_agencia) {
        this.id_agencia = id_agencia;
    }

    public String getId_agencia() {
        return id_agencia;
    }
    public void setId_agencia(String id_agencia) {
        this.id_agencia = id_agencia;
    }
    public Set<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
    public Set<Servicos> getServicos() {
        return servicos;
    }
    public void setServicos(Set<Servicos> servicos) {
        this.servicos = servicos;
    }

    public void AddCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void AddServicos(Servicos servico) {
        this.servicos.add(servico);
    }



}
