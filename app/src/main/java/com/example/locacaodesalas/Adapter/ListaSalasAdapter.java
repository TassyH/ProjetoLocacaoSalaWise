package com.example.locacaodesalas.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.locacaodesalas.Model.Sala;
import com.example.locacaodesalas.R;
import java.util.List;


public class ListaSalasAdapter extends BaseAdapter {

    private final List<Sala> salas;
    private Context context;

    public ListaSalasAdapter(List<Sala> salas, Context context){
        this.salas = salas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return salas.size();
    }

    @Override
    public Sala getItem(int posicao) {
        return salas.get(posicao);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.lista_salas, parent, false);

        Sala sala = salas.get(posicao);

        TextView nomeSala = viewCriada.findViewById(R.id.item_nome_sala);
        nomeSala.setText(sala.getNome());
        

        return viewCriada;
    }

}
