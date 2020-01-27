package com.example.locacaodesalas.Dao;

import com.example.locacaodesalas.Model.Reserva;
import com.example.locacaodesalas.R;

import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    private final static List<Reserva> reservas = new ArrayList<>();
    private static int contadorDeIds = 1;

      public void salva (Reserva reserva){
          reserva.setId(contadorDeIds);
          reservas.add(reserva);
          atualizaIds();
      }

      private void atualizaIds() {
          contadorDeIds++;
      }

      public List<Reserva> todos(){
          return new ArrayList<>(reservas);
      }


}
