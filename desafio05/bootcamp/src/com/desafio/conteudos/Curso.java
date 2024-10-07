package com.desafio.conteudos;
public class Curso extends Conteudo{
    private final Double XP_DEFAULT = 40d;
    private String nivel;

    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        super.setXP(XP_DEFAULT * cargaHoraria);
        super.setCargaHoraria(cargaHoraria);
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", XP Gerado=" + XP +
                ", CargaHoraria=" + getCargaHoraria() +
                ", nivel='" + nivel + '\'' +
                '}';
    }




}
