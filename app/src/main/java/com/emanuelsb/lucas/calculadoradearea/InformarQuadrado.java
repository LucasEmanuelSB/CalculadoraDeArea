package com.emanuelsb.lucas.calculadoradearea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InformarQuadrado extends AppCompatActivity {

    private EditText EDBase;

    private EditText EDAltura;

    private Button avancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informar_quadrado);

        EDBase = (EditText)findViewById(R.id.EDbase);
        EDAltura = (EditText)findViewById(R.id.EDaltura);
        avancar = (Button)findViewById(R.id.avancar);

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent areaCirculo = new Intent(getApplicationContext(), AreaCirculo.class);

                areaCirculo.putExtra("base",Double.parseDouble(EDBase.getText().toString()));
                areaCirculo.putExtra("altura",Double.parseDouble(EDAltura.getText().toString()));

                startActivity(areaCirculo);
            }
        });
    }
}
