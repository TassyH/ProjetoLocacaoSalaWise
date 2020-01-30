package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.locacaodesalas.Model.Usuario;
import com.example.locacaodesalas.R;
import com.example.locacaodesalas.server.Verificador;
import com.example.locacaodesalas.server.VerificadorCadastro;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import android.util.Base64;
import java.util.regex.Pattern;

public class CadastroUsuarioActivity extends AppCompatActivity {
    EditText edNome, edEmail, edSenha;
    Button btnCadastrar, btnCadastrar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inicializacaoDosCampos();
        setContentView(R.layout.activity_cadastro_usuario);

        final EditText edNome = (EditText) findViewById(R.id.ed_cadastro_nome);
        btnCadastrar = (Button) findViewById(R.id.btn_cadastrar);
        final EditText edSenha = findViewById(R.id.ed_cadastro_senha);
        final EditText edEmail = findViewById(R.id.ed_cadastro_email);



        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText edSenha = findViewById(R.id.ed_cadastro_senha);
                final EditText edEmail = findViewById(R.id.ed_cadastro_email);
                final EditText edNome = (EditText) findViewById(R.id.ed_cadastro_nome);

                String emailString = edEmail.getText().toString().trim();
                String senhaString = edSenha.getText().toString().trim();
                String nomeString = edNome.getText().toString().trim();

                JSONObject usuarioJson = new JSONObject();


                try {
                    usuarioJson.put("email", emailString);
                    usuarioJson.put("nome", nomeString);
                    usuarioJson.put("senha", senhaString);

                    String novoUsuarioDecode;
                    String userCod = new String(Base64.encodeToString(usuarioJson.toString().getBytes("UTF-8"), Base64.NO_WRAP));
                    System.out.println(usuarioJson.toString());

                    exibirMensagem(new VerificadorCadastro().execute(userCod).get());

                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (Exception e){

                }

                Intent intent = new Intent(CadastroUsuarioActivity.this, LoginUsuarioActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void exibirMensagem(String mensagem)
    {
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
    }
}

