package com.example.locacaodesalas.Model;

import java.io.Serializable;

public class Usuario implements Serializable {
<<<<<<< HEAD
    private String nomeUsuario;
    private String id_user;
    private String email;

    private Usuario(String nomeUsuario, String id_user, String email){
        this.email = email;
        this.id_user = id_user;
        this.nomeUsuario = nomeUsuario;

    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
=======

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
>>>>>>> 21076e09511d34bdf49e4c81025383071c1c7e0a
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

<<<<<<< HEAD
=======
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }



>>>>>>> 21076e09511d34bdf49e4c81025383071c1c7e0a
}
