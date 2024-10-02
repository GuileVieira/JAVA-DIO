package com.desafio.bancodigital.agencia.conta;

import com.desafio.bancodigital.agencia.Agencia;
import com.desafio.bancodigital.cliente.Cliente;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
    }
    
    @Override
    public void verExtrato() {
        System.out.println("\n");
        System.out.println("=== Extrato Conta Corrente ===");
        super.InformarcoesComuns();
        System.out.println("\n");
    }

}
