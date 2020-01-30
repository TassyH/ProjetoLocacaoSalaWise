package com.example.locacaodesalas.Model;

import java.io.Serializable;

public class Usuario implements Serializable {
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
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
