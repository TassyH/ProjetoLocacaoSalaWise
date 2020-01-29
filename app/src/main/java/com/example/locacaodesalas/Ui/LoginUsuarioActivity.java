package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        btnLogin = (Button) findViewById(R.id.btn_login);
        btnCadastrar2 = (Button) findViewById(R.id.btn_cadastro2);
        edEmailLog = (EditText) findViewById(R.id.ed_login_email);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarEmaillog(edEmailLog);
            }
        });

        btnCadastrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginUsuarioActivity.this, CadastroUsuarioActivity.class);
                startActivity(intent);
            }
        });

    }

    private boolean validarEmaillog(EditText edEmailLog){
        String email = this.edEmailLog.getText().toString();

        if (email.isEmpty()){
            Toast.makeText(this, "campo nao pode ficar vazio", Toast.LENGTH_SHORT).show();
            return false;
        }else{
            this.edEmailLog.setError(null);
            Toast.makeText(this, "logado", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginUsuarioActivity.this, ListaSalasActivity.class);
            startActivity(intent);
            return  true;
        }
    }


}
