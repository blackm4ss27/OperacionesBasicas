package com.example.operaciones2;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Salud extends AppCompatActivity {

    EditText etPeso, etAltura, etNombre;
    Button btnaceptar, btndiagnostico;
    TextView txtResultado;
    RadioButton rbVaron, rbMujer;
    private static Salud instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);
        instance = this;
        etPeso = (EditText) findViewById(R.id.etPeso);
        etAltura = (EditText) findViewById(R.id.etAltura);
        etNombre=(EditText) findViewById(R.id.etNombre);
        btnaceptar = (Button) findViewById(R.id.btnAceptar);
        btndiagnostico = (Button) findViewById(R.id.btnDiagnostico);
        txtResultado = (TextView) findViewById(R.id.tvResultadosalud);
        rbVaron=(RadioButton) findViewById(R.id.rVaron);
        rbMujer=(RadioButton) findViewById(R.id.rMujer);


        btnaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre= etNombre.getText().toString();
                if (rbMujer.isChecked()==true)
                    txtResultado.setText("Hola "+nombre+", usted es MUJER y el resultado de su IMC es de: "+CalcularIMC());
                else if(rbVaron.isChecked()==true)
                    txtResultado.setText("Hola "+nombre+", usted es VARON y el resultado de su IMC es de: "+CalcularIMC());
                else
                    txtResultado.setText("No ha elegido ningún género");
            }
        });
        btndiagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Diagnostico();
            }
        });
    }

    public void Diagnostico(){
        Intent vdiagnostico = new Intent(Salud.this, IMC.class);
        startActivity(vdiagnostico);
    }
    public static Salud getInstance() {
        return instance;
    }

    public Double CalcularIMC() {
        Double altura = Double.valueOf(etAltura.getText().toString());
        Double peso = Double.valueOf(etPeso.getText().toString());
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }
}