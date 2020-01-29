package com.example.locacaodesalas.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.locacaodesalas.Model.Reserva;
import com.example.locacaodesalas.Model.Sala;
import com.example.locacaodesalas.R;
import com.example.locacaodesalas.Ui.ReservaSalaActivity;

import java.util.ArrayList;
import java.util.List;


public class ListaReservaAdpter extends BaseAdapter {
    private final List<Reserva> reservas= new ArrayList<>();
    private final Context context;


     public ListaReservaAdpter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return reservas.size();
        }

        @Override
        public Object getItem(int posicao) {//item que eu quero pegar com base na mina posicao
            return reservas.get(posicao);
        }

        @Override
        public long getItemId(int posicao) {
            return reservas.get(posicao).getId();
        }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent) {
        View viewCriada = criaView(parent);
        Reserva reservaDevolvida = reservas.get(posicao);
        vincula(viewCriada, reservaDevolvida);
        return viewCriada;

    }

    private void vincula (View view, Reserva reserva){
        TextView nomeLocador = view.findViewById(R.id.ed_nome_organizador);
        nomeLocador.setText(reserva.getOganizador());

        TextView descricaLocacao = view.findViewById(R.id.ed_descricao);
        descricaLocacao.setText(reserva.getDescricao());

        TextView dataLocacao = view.findViewById(R.id.text_calendario);
        dataLocacao.setText(reserva.getDataCriacao());

        TextView horaIncialLocacao = view.findViewById(R.id.text_horaioInicial);
        horaIncialLocacao.setText(reserva.getHoraInicial());

        TextView horaFinalLocacao = view.findViewById(R.id.text_horaioFinal);
        horaFinalLocacao.setText(reserva.getHoraFina());
    }

    private View criaView (ViewGroup viewGroup){
        return LayoutInflater
                .from(context)
                .inflate(R.layout.item_lista_reserva, viewGroup, false);
    }

    public void atualiza(List<Reserva> reservas) {
        this.reservas.clear();
        this.reservas.addAll(reservas);
        notifyDataSetChanged();
    }
}
