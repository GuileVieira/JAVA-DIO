package com.desafio.banco.agencia.servicos;

import java.util.Date;

public class Consorcio extends Servicos{


    private final String NOME_SERVICO = "Consorcio Casa 01 - 200K";
    private final double TAXA = 0.25;
    private final int PARCELAS = 180;
    private final double VALOR_INICIAL = 200000.00
    private final double VALOR_FINAL = 380000.00
    private  final Date DATA_FIM = new Date(2039, 12, 31);
    


    
    public void Consorcio(double valorInicio, double valorFinal, Date dataFim) {
        super(this.TAXA, this.PARCELAS, this.VALOR_INICIAL, this.VALOR_FINAL, this.DATA_FIM);
    }

    public void verExtrato() {
        System.out.println("\n");
        System.out.println("Extrato de Consorcio");
        informacoesComuns();
        System.out.println("\n");
    }
}
