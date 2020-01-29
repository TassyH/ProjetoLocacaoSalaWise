package com.example.locacaodesalas.Model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nome_user;
    private String email;
    private int id_user;

    public Usuario(String nome_user, String email, int id_user){
        this.email = email;
        this.id_user = id_user;
        this.nome_user = nome_user;

    }

    public String getNome() {
        return nome_user;
    }

    public void setNome(String nome) {
        this.nome_user = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }



}
