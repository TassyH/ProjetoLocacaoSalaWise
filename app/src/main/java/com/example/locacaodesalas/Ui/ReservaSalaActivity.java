package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.locacaodesalas.Adapter.ListaReservaAdpter;
import com.example.locacaodesalas.Dao.ReservaDAO;
import com.example.locacaodesalas.Model.Reserva;
import com.example.locacaodesalas.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import static com.example.locacaodesalas.Ui.ContentsVariavel.CHAVE_RESERVA;

public class ReservaSalaActivity extends AppCompatActivity {
  Button btnReserva;
  TextView textoData,textoHoraI, textoHoraF;
  TextView edNomelocador, edDescricaoLocacao;
  private final ReservaDAO dao = new ReservaDAO();

  private ListaReservaAdpter adapter;
    public static final String TITULO_APPBAR = "Sua reserva";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_sala);
        setTitle(TITULO_APPBAR);
        configuraFabNovaReseva();


        textoData = (TextView) findViewById(R.id.text_calendario);
        textoHoraI = (TextView) findViewById(R.id.text_horaioInicial);
        textoHoraF = (TextView) findViewById(R.id.text_horaioFinal);
        edDescricaoLocacao = (TextView) findViewById(R.id.visual_descricao_locacao);
        edNomelocador = (TextView) findViewById(R.id.visual_organizador_locacao);

        ListView listaDeReservas = findViewById(R.id.listview_reservas_sala);
        adapter = new ListaReservaAdpter(this);
        listaDeReservas.setAdapter(adapter);
        configuraListenerDeCliquePorItem(listaDeReservas);

    }

    private void configuraFabNovaReseva(){
        FloatingActionButton botaoNovaReserva = findViewById(R.id.fab_reserva);
        botaoNovaReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreFormularioInserirReserva();
            }
        });

    }

    private void abreFormularioInserirReserva(){
        Intent intent = new Intent(ReservaSalaActivity.this, CadastroReservaActivity.class);
        startActivity(intent);
    }

    private void configuraListenerDeCliquePorItem(ListView listaDeReservas) {
        listaDeReservas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicao, long id) {
                Reserva reservaEscolhida = (Reserva) adapterView.getItemAtPosition(posicao);
                abreFormularioModoEditaReserva(reservaEscolhida);
            }
        });
    }

    private void abreFormularioModoEditaReserva(Reserva reserva) {
        Intent vaiParaFormularioActivity =
                new Intent(ReservaSalaActivity.this, CadastroReservaActivity.class);
        vaiParaFormularioActivity.putExtra(CHAVE_RESERVA, reserva);
        startActivity(vaiParaFormularioActivity);
    }

    @Override
    protected void onResume() {
        super.onResume();
        atualizaReserva();
    }

    private void atualizaReserva() {
        adapter.atualiza(dao.todos());
    }




}

