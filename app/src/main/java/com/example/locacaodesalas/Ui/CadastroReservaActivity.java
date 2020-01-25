package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.locacaodesalas.CalendarioFragment;
import com.example.locacaodesalas.R;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CadastroReservaActivity extends AppCompatActivity {
    public static final String TITULO_APPBAR = "Realizar reservas";
    ImageButton btndata, btnhoraI, btnhoraF;
    TextView textoData, textoHoraI, textoHoraF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_reserva);
        setTitle(TITULO_APPBAR);


        btndata = (ImageButton) findViewById(R.id.btn_select_data);
        btnhoraI = (ImageButton) findViewById(R.id.btn_select_horaIcial);
        btnhoraF = (ImageButton) findViewById(R.id.btn_select_horaFinal);
        textoData = (TextView) findViewById(R.id.text_calendario);
        textoHoraI = (TextView) findViewById(R.id.text_horaioInicial);
        textoHoraF = (TextView) findViewById(R.id.text_horaioFinal);


        btndata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnhoraI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
            }
        });

    }
}