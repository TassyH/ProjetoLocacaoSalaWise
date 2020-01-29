package com.example.locacaodesalas.Model;

import java.io.Serializable;

public class Sala implements Serializable {
    private final String nome;
    private final String imagem;
    private final String localizacao;
    private final int id_sala;
    private final boolean possuiMidia;
    private double area;

    public String getNome() {
        return nome;
    }

    public String getImagem() {
        return imagem;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getId_sala() {
        return id_sala;
    }

    public boolean isPossuiMidia() {
        return possuiMidia;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isRefrigeracao() {
        return refrigeracao;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidadePessoasSentadas() {
        return quantidadePessoasSentadas;
    }

    public void setQuantidadePessoasSentadas(String quantidadePessoasSentadas) {
        this.quantidadePessoasSentadas = quantidadePessoasSentadas;
    }

    private final boolean refrigeracao;
    private final boolean estado;
    String descricao;
    private String quantidadePessoasSentadas;


    public Sala(int id_sala, String nome, String imagem, Boolean estado, String localizacao, boolean refrigeracao, String quantidadePessoasSentadas, boolean possuiMidia) {
        this.nome = nome;
        this.estado = estado;
        this.imagem = imagem;
        this.localizacao = localizacao;
        this.id_sala = id_sala;
        this.quantidadePessoasSentadas = quantidadePessoasSentadas;
        this.possuiMidia = possuiMidia;
        this.refrigeracao = refrigeracao;

    }




}
