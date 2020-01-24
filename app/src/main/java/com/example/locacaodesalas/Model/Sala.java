package com.example.locacaodesalas.Model;

import java.io.Serializable;

public class Sala implements Serializable {
    private final String nome;
    private final String imagem;
    private final String estado;
    private final String localozacao;
    private final int id;
    private final boolean possuiMidia;
    private double area;
    private final boolean refrigeracao;

    public Sala(int id, String nome, String imagem, String estado, String localizacao, boolean refrigeracao, String quantidadePessoasSentadas, boolean possuiMidia) {
        this.nome = nome;
        this.estado = estado;
        this.imagem = imagem;
        this.localozacao = localizacao;
        this.id = id;
        this.quantidadePessoasSentadas = quantidadePessoasSentadas;
        this.possuiMidia = possuiMidia;
        this.refrigeracao = refrigeracao;

    }

    public boolean isRefrigeracao() {
        return refrigeracao;
    }

    public String getQuantidadePessoasSentadas() {
        return quantidadePessoasSentadas;
    }

    public void setQuantidadePessoasSentadas(String quantidadePessoasSentadas) {
        this.quantidadePessoasSentadas = quantidadePessoasSentadas;
    }

    private String quantidadePessoasSentadas;



    public String getImagem() {
        return imagem;
    }

    public String getEstado() {
        return estado;
    }

    public String getLocalozacao() {
        return localozacao;
    }
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public boolean isPossuiMidia() {
        return possuiMidia;
    }

    public double getArea() {
        return area;
    }



}