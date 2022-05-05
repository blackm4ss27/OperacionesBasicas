package com.example.operaciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Operaciones extends AppCompatActivity {

    Button btnSuma, btnResta, btnProducto, btnDiv, btnPotencia, btnRaiz, btnPorcentaje, btnFactorial, btnLimpiar, btnSalir;
    EditText txtNum1, txtNum2;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        txtNum1 = (EditText) findViewById(R.id.numero1);
        txtNum2 = (EditText) findViewById(R.id.numero2);
        btnSuma = (Button) findViewById(R.id.btnsuma);
        btnResta = (Button) findViewById(R.id.btnresta);
        btnProducto = (Button) findViewById(R.id.btnproducto);
        btnDiv = (Button) findViewById(R.id.btndiv);
        btnPotencia = (Button) findViewById(R.id.btnpotencia);
        btnRaiz = (Button) findViewById(R.id.btnraiz);
        btnPorcentaje = (Button) findViewById(R.id.btnporcentaje);
        btnFactorial = (Button) findViewById(R.id.btnfactorial);
        txtResultado = (TextView) findViewById(R.id.resultado);
        btnLimpiar = (Button) findViewById(R.id.btnlimpiar);
        btnSalir = (Button) findViewById(R.id.btnsalir);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 + numero2;
                txtResultado.setText("La suma es: " +resultado);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 - numero2;
                txtResultado.setText("La resta es: " +resultado);
            }
        });

        btnProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 * numero2;
                txtResultado.setText("El producto es: " +resultado);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double resultado = numero1 / numero2;
                txtResultado.setText("La división es: " +resultado);
            }
        });

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double numero2 = Double.parseDouble(txtNum2.getText().toString());
                double aux = 1;
                if (numero2==0){
                    double resultado = 1;
                }
                else{
                    while (numero2 > 0){
                        aux = aux * numero1;
                        numero2--;
                    }
                }
                double resultado = aux;
                txtResultado.setText("La potencia es: " +resultado);
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double resultado = Math.sqrt(numero1);
                txtResultado.setText("La raíz cuadrada es: " +resultado);
            }
        });

        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                double resultado = numero1 / 100;
                txtResultado.setText("El porcentaje es: " +resultado);
            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero1 = Double.parseDouble(txtNum1.getText().toString());
                int cont = 1;
                double aux = 1;
                while (cont <= numero1){
                    aux = aux * cont;
                    cont++;
                }
                double resultado = aux;
                txtResultado.setText("El factorial es: " +resultado);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtResultado.setText("");
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}