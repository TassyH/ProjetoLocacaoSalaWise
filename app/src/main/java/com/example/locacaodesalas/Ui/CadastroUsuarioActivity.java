package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.locacaodesalas.R;

public class CadastroUsuarioActivity extends AppCompatActivity {
    EditText edNome, edEmail, edSenha;
    Button btnCadastrar, btnCadastrar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inicializacaoDosCampos();
        setContentView(R.layout.activity_cadastro_usuario);
        edNome = (EditText) findViewById(R.id.ed_cadastro_nome);
        edEmail = (EditText) findViewById(R.id.ed_cadastro_email);
        btnCadastrar = (Button) findViewById(R.id.btn_cadastrar);
        btnCadastrar2 = (Button) findViewById(R.id.btn_cadastro2);

        String Nome = edNome.getText().toString();
        String Email = edEmail.getText().toString();


    }


}

