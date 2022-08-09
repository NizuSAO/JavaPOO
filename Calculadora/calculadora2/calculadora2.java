package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button suma;
    private Button resta;
    private Button division;
    private Button multiplicacion;
    private EditText numero1;
    private EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.editTextNumber);
        numero2 = findViewById(R.id.editTextNumber2);

        suma = findViewById(R.id.boton_suma);
        resta = findViewById(R.id.boton_menos);
        division = findViewById(R.id.boton_division);
        multiplicacion = findViewById(R.id.boton_multiplicar);

        suma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                int x1 = Integer.parseInt(numero1.getText().toString());
                int x2 = Integer.parseInt(numero2.getText().toString());
                int sum = x1+x2;

                textView.setText(sum);

            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                int x1 = Integer.parseInt(numero1.getText().toString());
                int x2 = Integer.parseInt(numero2.getText().toString());
                int res = x1-x2;

                textView.setText(res);
            }

        });

        multiplicacion.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                int x1 = Integer.parseInt(numero1.getText().toString());
                int x2 = Integer.parseInt(numero2.getText().toString());
                int mul = x1*x2;

                textView.setText(mul);
            }
        });

        division.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                int x1 = Integer.parseInt(numero1.getText().toString());
                int x2 = Integer.parseInt(numero2.getText().toString());
                int div = x1/x2;

                textView.setText(div);
            }
        });



    }
}
