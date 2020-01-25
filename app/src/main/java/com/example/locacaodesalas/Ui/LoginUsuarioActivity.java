package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.locacaodesalas.R;

public class LoginUsuarioActivity extends AppCompatActivity {
    EditText edEmailLog, edSenha;
    Button btnLogin, btnCadastrar2;

    public static final String TITULO_APPBAR = "login Usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);
        setTitle(TITULO_APPBAR);

        edEmailLog = (EditText) findViewById(R.id.ed_cadastro_email);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnCadastrar2 = (Button) findViewById(R.id.btn_cadastro2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginUsuarioActivity.this, ListaSalasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnCadastrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginUsuarioActivity.this, CadastroUsuarioActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
