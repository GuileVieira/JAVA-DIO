package com.desafio.conteudos;

public class Mentoria extends Conteudo {

    private final Double XP = 50d;
    private String NomeMentor;

    public Mentoria(String titulo, String descricao, Integer CargaHoraria) {   
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        super.setXP(XP);
        super.setCargaHoraria(CargaHoraria);
    }

    public String getNomeMentor() {
        return NomeMentor;
    }

    public void setNomeMentor(String nomeMentor) {
        NomeMentor = nomeMentor;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "NomeMentor='" + NomeMentor + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", XP Total=" + getXP() +
                ", CargaHoraria=" + getCargaHoraria() +
                '}';
    }
    


}