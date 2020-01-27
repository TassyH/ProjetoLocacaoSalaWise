package com.example.locacaodesalas.Model;

import android.widget.ScrollView;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Reserva implements Serializable {
    private String oganizador;
    private String descricao;
    private String dataCriacao;
    private String dataAlteracao;
    private String horaInicial;
    private String horaFinal;
    private int id = 0;

    public Reserva(String organizador, String descricao, String dataCriacao, String dataAlteracao, String horaFinal, String horaInicial){// construtor

        this.oganizador = organizador;
        this.descricao = descricao;
        this.dataAlteracao = dataAlteracao;
        this.dataCriacao = dataCriacao;
        this.horaInicial = horaInicial;
        this.horaFinal= horaFinal;
    }

    public Reserva() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOganizador() {
        return oganizador;
    }

    public void setOganizador(String oganizador) {
        this.oganizador = oganizador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFina() {
        return horaFinal;
    }

    public void setHoraFina(String horaFina) {
        this.horaFinal = horaFina;
    }

    @NonNull
    @Override
    public String toString() {
        return oganizador;

    }

    public boolean temIdValido() {
        return id > 0;
    }
}
