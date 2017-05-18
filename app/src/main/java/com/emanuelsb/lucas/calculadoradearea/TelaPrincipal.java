package com.emanuelsb.lucas.calculadoradearea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.view.*;
import android.widget.*;

public class TelaPrincipal extends AppCompatActivity {

    private RadioButton quadrado;

    private RadioButton triangulo;

    private RadioButton circulo;

    private Button avancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        quadrado = (RadioButton)findViewById(R.id.quadrado);
        triangulo = (RadioButton)findViewById(R.id.triangulo);
        circulo = (RadioButton)findViewById(R.id.circulo);
        avancar = (Button)findViewById(R.id.avancar);

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(quadrado.isChecked()){
                    startActivity(new Intent(getApplicationContext(), InformarQuadrado.class));
                } else if(triangulo.isChecked()){
                    startActivity(new Intent(getApplicationContext(), InformarTriangulo.class));
                } else if(circulo.isChecked()){
                    startActivity(new Intent(getApplicationContext(), InformarCirculo.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Nenhuma forma geométrica foi selecionada", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
