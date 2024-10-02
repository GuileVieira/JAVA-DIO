package com.desafio.bancodigital.agencia.servicos;

public class Consorcio extends Servicos{
    public Consorcio(String nomeServico) {
        super(1.26, 48, 15800.00, 83000.00, "2039-11-31", nomeServico);
    }

    public void verExtrato() {
        System.out.println("\n");
        System.out.println("Extrato de Consorcio");
        informacoesComuns();
        System.out.println("\n");
    }
}
