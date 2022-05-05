package com.example.operaciones2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class IMC extends AppCompatActivity {
    TextView txtDiagnostico, txtRecomendaciones;
    Button btnRecomend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        btnRecomend = (Button) findViewById(R.id.btnRecocmendaciones);
        txtDiagnostico = (TextView) findViewById(R.id.tvdiagnostico);
        txtRecomendaciones = (TextView) findViewById(R.id.tvRecomendaciones);
        Diagnostico();

        btnRecomend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recomendaciones();
            }
        });
    }
    Double IMC=Salud.getInstance().CalcularIMC();
    private void Diagnostico(){
        if(IMC < 16){
            txtDiagnostico.setText("Usted tiene BAJO PESO MUY GRAVE, con un IMC de: "+IMC);
        }else if(IMC>=16 & IMC<16.99){
            txtDiagnostico.setText("Usted tiene BAJO PESO GRAVE, con un IMC de: "+IMC);
        }else if(IMC>=17 & IMC<18.49){
            txtDiagnostico.setText("Usted tiene BAJO PESO con un IMC de: "+IMC);
        }else if(IMC>=18.50 & IMC<24.99){
            txtDiagnostico.setText("Usted tiene PESO NORMAL con un IMC de: "+IMC);
        }else if(IMC>=25 & IMC<29.99){
            txtDiagnostico.setText("Usted tiene SOBREPESO con un IMC de: "+IMC);
        }else if(IMC>=30 & IMC<34.99){
            txtDiagnostico.setText("Usted tiene OBESIDAD - GRADO 1, con un IMC de: "+IMC);
        }else if(IMC>=35 & IMC<39.99){
            txtDiagnostico.setText("Usted tiene OBESIDAD - GRADO 2, con un IMC de: "+IMC);
        }else if(IMC > 40){
            txtDiagnostico.setText("Usted tiene OBESIDAD - GRADO 3 (OBESIDAD MORBIDA), con un IMC de: "+IMC);
        }
    }
    private void Recomendaciones(){
        if(IMC < 16){
            txtRecomendaciones.setText("Debido a su BAJO PESO MUY GRAVE, le damos las siguientes recomendaciones:*\n" +
                    "- Coma mucho mas de lo normal.\n" +
                    "- Coma de 5 a 6 veces por día.\n" +
                    "- Consuma alimentos ricos en proteínas, carbohidratos y grasas.\n" +
                    "- Es recomendable que aplique suplementación basada en proteína.\n" +
                    "- Visite y solicite asesoría a un nutricionista con urgencia.");
        }else if(IMC>=16 & IMC<16.99){
            txtRecomendaciones.setText("Debido a su BAJO PESO GRAVE, le damos las siguientes recomendaciones:*\n" +
                    "- Coma mas de lo normal.\n" +
                    "- Consuma alimentos ricos en proteínas, carbohidratos y grasas.\n" +
                    "- Coma de 4 a 5 veces por día.\n" +
                    "- Visite y solicite asesoría a un nutricionista.");
        }else if(IMC>=17 & IMC<18.49){
            txtRecomendaciones.setText("Debido a su BAJO PESO, le damos las siguientes recomendaciones:*\n" +
                    "- Coma mas de lo normal.\n" +
                    "- Consuma alimentos ricos en proteínas, carbohidratos y grasas.\n" +
                    "- Consuma golosinas de vez en cuando.\n" +
                    "- Coma de 4 a 5 veces por día.");
        }else if(IMC>=18.50 & IMC<24.99){
            txtRecomendaciones.setText("FELICITACIONES!!! Usted tiene PESO NORMAL, le damos las siguientes recomendaciones:*\n" +
                    "- Siga con la alimentación que lleva usualmente.\n" +
                    "- Consuma alimentos que contegan proteínas, carbohidratos y grasas.\n" +
                    "- Realice ejercicios de vez en cuando.");
        }else if(IMC>=25 & IMC<29.99){
            txtRecomendaciones.setText("Debido a su SOBREPESO, le damos las siguientes recomendaciones:*\n" +
                    "- Coma un poco menos de lo usual.\n" +
                    "- Consuma alimentos bajos en grasas y carbohidratos.\n" +
                    "- Haga ejercicios cardiovasculares y de fuerza por al menos 30 minutos interdiario.\n" +
                    "- Beba abundate agua.");
        }else if(IMC>=30 & IMC<34.99){
            txtRecomendaciones.setText("Debido a su OBESIDAD - GRADO 1, le damos las siguientes recomendaciones:*\n" +
                    "- Coma menos de lo usual.\n" +
                    "- Consuma alimentos bajos en grasas y carbohidratos.\n" +
                    "- Haga ejercicios cardiovasculares y de fuerza por al menos 30 minutos diarios.\n" +
                    "- Beba al menos 1.5 litros de agua diariamente.");
        }else if(IMC>=35 & IMC<39.99){
            txtRecomendaciones.setText("Debido a su OBESIDAD - GRADO 2, le damos las siguientes recomendaciones:*\n" +
                    "- Coma mucho menos de lo usual.\n" +
                    "- Elimine de su dieta los alimentos que contenga alto porcentaje de grasas y carbohidratos.\n" +
                    "- Haga ejercicios cardiovasculares y de fuerza por al menos 45 minutos diarios.\n" +
                    "- Salga a caminar por al menos 2 horas.\n" +
                    "- Beba al menos 2 litros de agua diariamente.");
        }else if(IMC>40){
            txtRecomendaciones.setText("Debido a su OBESIDAD - GRADO 3 (OBESIDAD MORBIDA), le damos las siguientes recomendaciones:*\n" +
                    "- Coma solo 2 veces al día.\n" +
                    "- Elimine de su dieta los alimentos que contengan grasas y carbohidratos.\n" +
                    "- Elimine de su dieta los alimentos que contengan azucar.\n" +
                    "- Haga ejercicios cardiovasculares y de fuerza por al menos 1 hora y media.\n" +
                    "- Salga a caminar por al menos 2 horas.\n" +
                    "- Beba al menos 3 litros de agua diariamente.\n" +
                    "- Visite con urgencia a un nutricionista y un cardiologo");
        }
    }
}