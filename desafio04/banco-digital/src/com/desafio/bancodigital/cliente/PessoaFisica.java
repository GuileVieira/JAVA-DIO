package com.desafio.bancodigital.cliente;



import com.desafio.bancodigital.agencia.Agencia;

public class PessoaFisica extends Cliente{
    
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(Agencia agencia, String nome, String cpf, String dataNascimento, String endereco) {
        //super();
        this.setAgencia(agencia);
        this.setNome(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.setEndereco(endereco);
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    
}
