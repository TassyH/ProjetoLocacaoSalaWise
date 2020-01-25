package com.example.locacaodesalas.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
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
                showDateDialog(btndata);

            }
        });

        btnhoraI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimeDialog(btnhoraI);;
            }
        });

        btnhoraI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHorarioDialogo(btnhoraF);;
            }
        });

    }


/////////////////////////////////////////////////////////////////


    private void showTimeDialog ( final ImageButton btnhoraI){
        final Calendar calendario = Calendar.getInstance();

        TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                calendario.set(Calendar.HOUR_OF_DAY, hourOfDay);
                calendario.set(Calendar.MINUTE, minute);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                textoHoraI.setText(simpleDateFormat.format(calendario.getTime()));
            }
        };

        new TimePickerDialog(CadastroReservaActivity.this, timeSetListener, calendario.get(Calendar.HOUR_OF_DAY), calendario.get(Calendar.MINUTE), false).show();
    }

    private void showHorarioDialogo ( final ImageButton btnhoraF){
        final Calendar calendar = Calendar.getInstance();

        TimePickerDialog.OnTimeSetListener horaSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int horaDoDia, int minuto) {
                calendar.set(Calendar.HOUR_OF_DAY, horaDoDia);
                calendar.set(Calendar.MINUTE, minuto);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                textoHoraF.setText(simpleDateFormat.format(calendar.getTime()));
            }
        };

        new TimePickerDialog(CadastroReservaActivity.this, horaSetListener, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), false).show();
    }

        private void showDateDialog ( final ImageButton btndata){
            final Calendar calendario = Calendar.getInstance();
            DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    calendario.set(Calendar.YEAR, year);
                    calendario.set(Calendar.MONTH, month);
                    calendario.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
                    textoData.setText(simpleDateFormat.format(calendario.getTime()));

                }
            };

            new DatePickerDialog(CadastroReservaActivity.this, dateSetListener, calendario.get(Calendar.YEAR), calendario.get(Calendar.MONTH), calendario.get(Calendar.DAY_OF_MONTH)).show();
        }



}

