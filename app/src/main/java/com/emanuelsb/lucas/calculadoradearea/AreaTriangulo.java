package com.emanuelsb.lucas.calculadoradearea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AreaTriangulo extends AppCompatActivity {

    private TextView valorArea;

    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_triangulo);

        valorArea = (TextView) findViewById(R.id.valorArea);
        voltar = (Button) findViewById(R.id.voltar);

        Bundle mochila = getIntent().getExtras();

        Double base = mochila.getDouble("base");
        Double altura = mochila.getDouble("altura");

        Double area = (base * altura)/2;

        valorArea.setText(area.toString()+" und²");

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TelaPrincipal.class));
            }
        });
    }
}