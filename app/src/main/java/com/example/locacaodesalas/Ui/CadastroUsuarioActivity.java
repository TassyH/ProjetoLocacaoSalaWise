package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.locacaodesalas.R;

import java.util.regex.Pattern;

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

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarEmail(edEmail);
            }
        });


    }

         private boolean validarEmail(EditText edEmail){
             String Email = this.edEmail.getText().toString();

             if (Email.isEmpty()){
                 Toast.makeText(this, "campo nao pode ficar vazio", Toast.LENGTH_SHORT).show();
                 return false;
             }else if (!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
                 Toast.makeText(this, "entre com um email valido", Toast.LENGTH_SHORT).show();
                 return false;
             }else{
                 this.edEmail.setError(null);
                 Toast.makeText(this, "deu certo", Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(CadastroUsuarioActivity.this, LoginUsuarioActivity.class);
                 startActivity(intent);
                 return  true;
             }
         }



}

