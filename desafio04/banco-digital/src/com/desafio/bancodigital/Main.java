package com.desafio.bancodigital;

import com.desafio.bancodigital.agencia.Agencia;
import com.desafio.bancodigital.agencia.conta.Conta;
import com.desafio.bancodigital.agencia.conta.ContaCorrente;
import com.desafio.bancodigital.agencia.servicos.Emprestimo;
import com.desafio.bancodigital.agencia.servicos.Consorcio;
import com.desafio.bancodigital.agencia.servicos.Financiamento;
import com.desafio.bancodigital.cliente.PessoaFisica;
import com.desafio.bancodigital.cliente.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		//Criar o banco 
		Banco banco = new Banco(2665,"Banco BPT" );

		//Criar as agencia
		Agencia agencia = new Agencia("0001");
		
		//Adicionar servicos da agencia
		agencia.AddServicos(new Consorcio("Consorcio Casa 01 - 200K"));
		agencia.AddServicos(new Emprestimo("Emprestimo 5k"));
		agencia.AddServicos(new Financiamento("Financiamento Carro 15K"));

		//Adicionar a agencia ao banco
		banco.AddAgencia(agencia);

		//Criar um cliente PF e PJ 
		PessoaFisica clientePF = new PessoaFisica(agencia,"Joao","111.111.111-11","2000-01-02","Rua XPTO 1895");

		PessoaJuridica clientePJ = new PessoaJuridica(agencia,"Casa da antenas LTDA","111.111.111-11","1989-01-02","CASA DA ANTENAS");
		clientePJ.setEndereco("Av. Santos Dummont, 165");


		//Add clientes a agencia 
		agencia.AddCliente(clientePJ);
		agencia.AddCliente(clientePF);

		//criar uma conta para o cliente PF e mostra o numero dela
		Conta contaPF = new ContaCorrente(agencia, clientePF);
		System.out.println("Conta PF criada: " + contaPF.getNumeroConta());

		//criar uma conta para o cliente PJ e mostra o numero dela
		Conta contaPJ = new ContaCorrente(agencia, clientePJ);
		System.out.println("Conta PJ criada: " + contaPJ.getNumeroConta());

		//Adicionar as contas aos clientes

		//Mostra as informacoes da conta PF
		clientePF.getConta().verExtrato();

		//Mostra as informacoes da conta PJ
		clientePJ.getConta().verExtrato();

		//Transacao
		clientePF.getConta().depositar(159.53);
		clientePF.getConta().verExtrato();
		clientePF.getConta().transferir(100.00, contaPJ);

		clientePJ.getConta().transferir(33.81, contaPF);

		clientePF.getConta().verExtrato(); //SALDO ESPERADO 93,34
		clientePJ.getConta().verExtrato(); //SALDO ESPERADO 66,19
		



		
		
	




	}

}
