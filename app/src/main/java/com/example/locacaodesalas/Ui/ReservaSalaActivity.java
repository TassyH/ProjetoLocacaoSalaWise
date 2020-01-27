package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.locacaodesalas.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReservaSalaActivity extends AppCompatActivity {
  Button btnReserva;
  TextView textoData,textoHoraI, textoHoraF;
  TextView edNomelocador, edDescricaoLocacao;
    public static final String TITULO_APPBAR = "Sua reserva";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_sala);
        setTitle(TITULO_APPBAR);

        textoData = (TextView) findViewById(R.id.text_calendario);
        textoHoraI = (TextView) findViewById(R.id.text_horaioInicial);
        textoHoraF = (TextView) findViewById(R.id.text_horaioFinal);
        edDescricaoLocacao = (TextView) findViewById(R.id.visual_descricao_locacao);
        edNomelocador = (TextView) findViewById(R.id.visual_organizador_locacao);

        FloatingActionButton botaoNovoAluno = findViewById(R.id.fab_reserva);
        botaoNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReservaSalaActivity.this, CadastroReservaActivity.class);
                startActivity(intent);
            }
        });

    }
}
