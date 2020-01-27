package com.example.locacaodesalas.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.locacaodesalas.Model.Reserva;
import com.example.locacaodesalas.Model.Sala;
import com.example.locacaodesalas.R;

import java.util.List;

public class ListaReservaAdpter extends BaseAdapter {
    private final List<Reserva> reservas;
    private Context context;

    public ListaReservaAdpter(List<Reserva> reservas, Context context){
        this.reservas = reservas;
        this.context = context;
    }


    @Override
    public int getCount() {
        return reservas.size();
    }

    @Override
    public Object getItem(int position) {
        return reservas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_lista_reserva, parent, false);

        Reserva reserva = reservas.get(posicao);

        TextView nomeLocador = viewCriada.findViewById(R.id.ed_nome_organizador);
        String nome = nomeLocador.toString();
        nomeLocador.setText(nome);
        return viewCriada;
    }
}
