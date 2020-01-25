package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.locacaodesalas.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReservaSalaActivity extends AppCompatActivity {
  Button btnReserva;

    public static final String TITULO_APPBAR = "Sua reserva";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_sala);
        setTitle(TITULO_APPBAR);

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
