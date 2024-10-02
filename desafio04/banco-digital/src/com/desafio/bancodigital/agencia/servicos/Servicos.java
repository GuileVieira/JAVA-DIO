package com.desafio.bancodigital.agencia.servicos;


public abstract class Servicos {
    private String nomeServico;
    private double juros;
    private int parcelas;
    private double valorInicio;
    private double valorFinal;
    private String dataFim;

    public Servicos(double juros, int parcelas, double valorInicio, double valorFinal, String dataFim, String nomeServico) {
        this.nomeServico = nomeServico;
        this.juros = juros;
        this.parcelas = parcelas;
        this.valorInicio = valorInicio;
        this.valorFinal = valorFinal;
        this.dataFim = dataFim;
    }

    protected void informacoesComuns() {
        System.out.println("Nome do Serviço: " + this.getNomeServico());
        System.out.println("Juros: " + this.getJuros());
        System.out.println("Parcelas: " + this.getParcelas());
        System.out.println("Valor Inicial: " + this.getValorInicio());
        System.out.println("Valor Final: " + this.getValorFinal());
        System.out.println("Data de Fim: " + this.getDataFim());
    }


    public String getNomeServico() {
        return nomeServico;
    }
    public double getJuros() {
        return juros;
    }
    public int getParcelas() {
        return parcelas;
    }

    public double getValorInicio() {
        return valorInicio;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    public String getDataFim() {
        return dataFim;
    }
    public void setJuros(double juros) {
        this.juros = juros;
    }
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    public void setValorInicio(double valorInicio) {
        this.valorInicio = valorInicio;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    
    protected abstract void verExtrato();

}
