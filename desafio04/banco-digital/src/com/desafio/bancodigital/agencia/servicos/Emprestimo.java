package com.desafio.bancodigital.agencia.servicos;


public class Emprestimo extends Servicos{

    public Emprestimo(String nomeServico) {
        super(1.26, 48, 15800.00, 83000.00, "2039-11-31", "nomeServico");
    }

    public void verExtrato() {
        System.out.println("\n");
        System.out.println("Extrato de Emprestimo");
        informacoesComuns();
        System.out.println("\n");
    }
}
