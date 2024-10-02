package com.desafio.bancodigital.agencia.conta.investimento;

import com.desafio.bancodigital.agencia.Agencia;
import com.desafio.bancodigital.agencia.conta.Conta;
import com.desafio.bancodigital.cliente.Cliente;

public class ContaInvestimento extends Conta{
    private String nomeInvestimento;
    private double rentabilidade;


    protected ContaInvestimento(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
    }


    public String getNomeInvestimento() {
        return nomeInvestimento;
    }


    protected void setNomeInvestimento(String nomeInvestimento) {
        this.nomeInvestimento = nomeInvestimento;
    }



    public double getRentabilidade() {
        return rentabilidade;
    }


    protected void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
    @Override
    public void verExtrato() {
        System.out.println("\n");
        System.out.println("=== Extrato Conta "+this.getNomeInvestimento() +" ===");
        super.InformarcoesComuns();
        System.out.println("\n");
    }
    
    
}
