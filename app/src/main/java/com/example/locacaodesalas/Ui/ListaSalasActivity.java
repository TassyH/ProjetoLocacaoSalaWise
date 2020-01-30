package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.locacaodesalas.Adapter.ListaReservaAdpter;
import com.example.locacaodesalas.Adapter.ListaSalasAdapter;
import com.example.locacaodesalas.Dao.ReservaDAO;
import com.example.locacaodesalas.Dao.SalaDAO;
import com.example.locacaodesalas.Model.Reserva;
import com.example.locacaodesalas.Model.Sala;
import com.example.locacaodesalas.R;

import java.util.List;

public class ListaSalasActivity extends AppCompatActivity {
    public static final String TITULO_APPBAR = "Salas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_salas);
        setTitle(TITULO_APPBAR);
        configuraLista();
        ListView listaDeSalas = findViewById(R.id.listview_de_salas);

        listaDeSalas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListaSalasActivity.this, ReservaSalaActivity.class);
                startActivity(intent);
            }
        });

    }

    private void configuraLista() {
        ListView listaDeSalas = findViewById(R.id.listview_de_salas);
        List<Sala> salas = new SalaDAO().lista();
        listaDeSalas.setAdapter(new ListaSalasAdapter(salas, this));
    }
}
