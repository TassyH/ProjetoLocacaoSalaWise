package com.example.locacaodesalas.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Reserva implements Serializable {

    private String nomeOrganizador;
    private String horaIncial;
    private String horaFinal;
    private int id;
    private String descricao;
    private String dataCriacao;
    private String dataAlteracao;

    public Reserva(int id, String nomeOrganizador, String horaFinal, String horaIncial, String descricao, String dataAlteracao, String dataCriacao) {
        this.dataAlteracao = dataAlteracao;
        this.dataCriacao = dataCriacao;
        this.horaIncial = horaIncial;
        this.horaFinal = horaFinal;
        this.descricao = descricao;
        this.nomeOrganizador = nomeOrganizador;
        this.id = id;
    }

    public String getNomeOrganizador() {
        return nomeOrganizador;
    }

    public void setNomeOrganizador(String nomeOrganizador) {
        this.nomeOrganizador = nomeOrganizador;
    }

    public String getHoraIncial() {
        return horaIncial;
    }

    public void setHoraIncial(String horaIncial) {
        this.horaIncial = horaIncial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

<<<<<<< HEAD
    public void setHoraFina(String horaFina) {
        this.horaFinal = horaFina;
    }

    @NonNull
    @Override
    public String toString() {
        return oganizador;

    }

=======
    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }
>>>>>>> 21076e09511d34bdf49e4c81025383071c1c7e0a
}
