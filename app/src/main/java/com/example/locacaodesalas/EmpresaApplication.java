package com.example.locacaodesalas;

import android.app.Application;

public class EmpresaApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        criarEmpresaDeTeste();

    }

    private void criarEmpresaDeTeste() {
      //  Empresa(new Empresa("dominio.com"));
    }

}
