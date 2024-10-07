package com.desafio.conteudos;

import com.desafio.dev.Dev;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;

import java.time.LocalDate;
public class Bootcamp {
    public String nome;
    public String descricao;
    public Set<Dev> devsInscritos = new LinkedHashSet<>();
    public Set<Conteudo> conteudos = new LinkedHashSet<>();
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);



    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Bootcamp() {
    }

    public void inscreverDev(Dev dev){
        this.devsInscritos.add(dev);
    }

    public void adicionarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }


    //METODO HASHCODE E EQUALS PARA VERIFICAR SE OS OBJETOS SAO IGUAIS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, devsInscritos, conteudos, dataInicial, dataFinal);
    }

    //METODO TOSTRING PARA IMPRIMIR OS OBJETOS

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", devsInscritos=" + devsInscritos +
                ", conteudos=" + conteudos +
                ", Inicio em: " + dataInicial + " e termino em: " + dataFinal +  
                '}';
    }

    

}
