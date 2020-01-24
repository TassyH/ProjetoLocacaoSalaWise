package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.locacaodesalas.R;

public class ReservaSalaActivity extends AppCompatActivity {
  Button btnReserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_sala);

        btnReserva = (Button) findViewById(R.id.btn_reserva);

        btnReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReservaSalaActivity.this, CadastroReservaActivity.class);
                startActivity(intent);
            }
        });
    }
}
