package com.example.locacaodesalas.Dao;

import com.example.locacaodesalas.Model.Sala;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaDAO {
    public List<Sala> lista() {
        List<Sala> salas = new ArrayList<>(Arrays.asList(
                new Sala(1 , "Conselho Jedi", "img_conselho_jedi", true, "1o andar", true, "12 pessoas",true),
                new Sala(2 , "Tabula redonda", "img_tabula_redonda", true, "1o andar", true, "13 pesssoas",true),
                new Sala(3,"Olimpo", "img_olimpo", true, "1o andar", true, "13 pesssoas",true),
                new Sala(4,"A sala de vidro", "img_virdo", true, "1o andar", true, "13 pesssoas",true)));
        return salas;
    }
}
