package com.desafio.bancodigital.agencia.conta.investimento;

import com.desafio.bancodigital.agencia.Agencia;
import com.desafio.bancodigital.cliente.Cliente;

public class ContaPoupanca extends ContaInvestimento {

    private final String NOME_INVESTIMENTO = "Poupanca";
    private final double RENTABILIDADE = 0.01;
    

    public ContaPoupanca(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
        this.setNomeInvestimento(NOME_INVESTIMENTO);
        this.setRentabilidade(RENTABILIDADE);
    }

}

