package com.desafio.dev;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Optional;

import com.desafio.conteudos.Bootcamp;
import com.desafio.conteudos.Conteudo;
public class Dev {
    private String nome;
    private Double XP;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
        this.XP = 0d;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.getConteudos().forEach(conteudo -> this.conteudosInscritos.add(conteudo));
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.XP += conteudo.get().getXP();
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Voce nao esta matriculado em nenhum conteudo");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getXP() {
        return XP;
    }

    public void setXP(Double xP) {
        XP = xP;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    
   public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", XP=" + XP +
                ", conteudosInscritos=" + conteudosInscritos +
                '}';
    }


    
    


}
