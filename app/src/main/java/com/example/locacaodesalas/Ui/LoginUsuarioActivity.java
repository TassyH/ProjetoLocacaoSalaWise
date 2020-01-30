package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.locacaodesalas.R;
import com.example.locacaodesalas.server.Verificador;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoginUsuarioActivity extends AppCompatActivity {
    EditText edEmailLog, edSenha;
    Button btnLogin, btnCadastrar2;

    public static final String TITULO_APPBAR = "login Usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);
        setTitle(TITULO_APPBAR);

        final EditText edEmailLog = (EditText) findViewById(R.id.ed_login_email);
        btnLogin = (Button) findViewById(R.id.btn_login);
        final EditText edsenhalog = findViewById(R.id.ed_login_senha);
        btnCadastrar2 = (Button) findViewById(R.id.btn_cadastro2);

        btnCadastrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginUsuarioActivity.this, CadastroUsuarioActivity.class);
                startActivity(intent);

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    String emailString = edEmailLog.getText().toString().trim();
                    String senhaString = edsenhalog.getText().toString().trim();
                    exibirMensagem(new Verificador().execute(emailString, senhaString).get());
                } catch (Exception e) {
                }
            }
        });
    }

        public void exibirMensagem(String mensagem) {
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
        }


}




       /* btnLogin.setOnClickListener(new View.OnClickListener() {
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

    }*/



