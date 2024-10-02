package com.desafio.bancodigital.agencia.conta;

import com.desafio.bancodigital.agencia.Agencia;
import com.desafio.bancodigital.cliente.Cliente;

public abstract class Conta {

    private Agencia agencia;
    protected Cliente cliente;
    private int numeroConta;
    protected double saldo;

    public Conta(Agencia agencia, Cliente cliente) {
        this.agencia = agencia;
        this.gerarNumeroConta();
        this.saldo = 0.0;
        this.cliente = cliente;
        cliente.setConta(this);
    }

    private void gerarNumeroConta() {
        //gerar numero de 6 digitos aleatorios
        java.util.Random random = new java.util.Random();
        this.numeroConta = 100000 + random.nextInt(900000);
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected Agencia getAgencia() {
        return agencia;
    }

    protected Cliente getCliente() {
        return cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    protected double getSaldo() {
        return saldo;
    }
    
    public  void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void InformarcoesComuns(){
        System.out.println("Numero da Conta: " + this.getNumeroConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Agencia: " + this.getAgencia().getId_agencia());
        System.out.println("Nome: " + this.getCliente().getNome());
        System.out.println("Endereco: " + this.getCliente().getEndereco());
    }

    public abstract void verExtrato();
    



    
}
