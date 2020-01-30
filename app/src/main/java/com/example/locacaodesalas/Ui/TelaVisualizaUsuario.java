package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.locacaodesalas.R;

public class TelaVisualizaUsuario extends AppCompatActivity {

    TextView tvNome, tvEmail, tvSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_visualiza_usuario);

        final TextView tvNome =  findViewById(R.id.tv_user_nome);
        final TextView tvSenha = findViewById(R.id.tv_user_senha);
        final TextView tvEmail = findViewById(R.id.tv_user_email);


    }
}
