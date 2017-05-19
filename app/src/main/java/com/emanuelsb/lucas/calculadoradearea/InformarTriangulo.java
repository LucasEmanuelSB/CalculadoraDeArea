package com.emanuelsb.lucas.calculadoradearea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InformarTriangulo extends AppCompatActivity {

    private EditText EDBase;

    private EditText EDAltura;

    private Button avancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informar_triangulo);
        EDBase = (EditText)findViewById(R.id.EDBase);
        EDAltura = (EditText)findViewById(R.id.EDAltura);
        avancar = (Button)findViewById(R.id.avancar);

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(EDBase.getText().toString().length() == 0){
                    Toast.makeText(getApplicationContext(), "Por favor, insira a base para o calculo", Toast.LENGTH_SHORT).show();
                } else if(EDAltura.getText().toString().length() == 0){
                    Toast.makeText(getApplicationContext(), "Por favor, insira a altura para o calculo", Toast.LENGTH_SHORT).show();
                } else{

                    Intent areaTriangulo = new Intent(getApplicationContext(), AreaTriangulo.class);

                    areaTriangulo.putExtra("base",Double.parseDouble(EDBase.getText().toString()));
                    areaTriangulo.putExtra("altura",Double.parseDouble(EDAltura.getText().toString()));

                    startActivity(areaTriangulo);
                }
            }
        });
    }
}