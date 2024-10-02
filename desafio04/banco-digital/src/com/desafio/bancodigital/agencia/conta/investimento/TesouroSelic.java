package com.desafio.bancodigital.agencia.conta.investimento;

import com.desafio.bancodigital.agencia.Agencia;
import com.desafio.bancodigital.cliente.Cliente;

public class TesouroSelic extends ContaInvestimento{
    private final String NOME_INVESTIMENTO = "Tesouro Selic";
    private final double RENTABILIDADE = 0.97;

       public TesouroSelic(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
        this.setNomeInvestimento(NOME_INVESTIMENTO);
        this.setRentabilidade(RENTABILIDADE);
    }
}
