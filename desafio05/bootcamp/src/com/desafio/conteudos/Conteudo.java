package com.desafio.conteudos;
public abstract class Conteudo {
    protected String titulo;
    protected String descricao;
    protected Double XP;
    protected Integer CargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getXP() {
        return XP;
    }

    protected void setXP(Double XP) {
        this.XP = XP;
    }
    

    public Integer getCargaHoraria() {
        return CargaHoraria;
    }

    protected void setCargaHoraria(Integer cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }
    

    

}
