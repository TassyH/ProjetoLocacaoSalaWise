package com.example.locacaodesalas.Dao;

import com.example.locacaodesalas.Model.Sala;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaDAO {
    public List<Sala> lista() {
        List<Sala> salas = new ArrayList<>(Arrays.asList(
                new Sala(1 , "Conselho Jedi", "img_conselho_jedi", "sala ativa", "1o andar", true, "12 pessoas",true, "sala pipipopo"),
                new Sala(2 , "Tabula redonda", "img_tabula_redonda", "sala ativa", "1o andar", true, "13 pesssoas",true,"sala popopipip"),
                new Sala(3,"Olimpo", "img_olimpo", "sala ativa", "1o andar", true, "13 pesssoas",true, "sala de conversa"),
                new Sala(4,"A sala de vidro", "img_virdo", "sala ativa", "1o andar", true, "13 pesssoas",true, "sala para apresentacao")));
        return salas;
    }
}
