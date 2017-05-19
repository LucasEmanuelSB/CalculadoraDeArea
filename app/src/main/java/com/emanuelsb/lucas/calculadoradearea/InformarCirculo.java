package com.emanuelsb.lucas.calculadoradearea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InformarCirculo extends AppCompatActivity {

    private EditText EDRadio;

    private Button avancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informar_circulo);

        EDRadio = (EditText)findViewById(R.id.EDRadio);
        avancar = (Button)findViewById(R.id.avancar);

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(EDRadio.getText().toString().length() > 0){

                    Intent areaCirculo = new Intent(getApplicationContext(), AreaCirculo.class);

                    areaCirculo.putExtra("raio",Double.parseDouble(EDRadio.getText().toString()));

                    startActivity(areaCirculo);

                } else {
                    Toast.makeText(getApplicationContext(), "Por favor, insira o raio para o calculo", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
