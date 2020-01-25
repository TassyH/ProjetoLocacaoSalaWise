package com.example.locacaodesalas;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class CalendarioFragment extends DialogFragment {
    @Nullable
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        return  new DatePickerDialog(getActivity(), (DatePickerDialog.OnDateSetListener) getActivity(), ano, mes, dia);

    }

}
