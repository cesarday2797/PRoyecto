package com.example.lalaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAyuda extends AppCompatActivity {

    private Button eBack;
    private Button eGrua;
    private Button eMecanico;
    private Button eAC;
    private Button eLlanta;
    private Button eElectrico;
    private Button eOtro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);

        eBack = findViewById(R.id.btnBackAyuda);
        eGrua = findViewById(R.id.btnGrua);
        eMecanico = findViewById(R.id.btnMecanico);
        eAC = findViewById(R.id.btnAC);
        eLlanta = findViewById(R.id.btnLlanta);
        eElectrico = findViewById(R.id.btnElectrico);
        eOtro = findViewById(R.id.btnOtro);

        eBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityAyuda.this, HomePageActivity.class);
                startActivity(intent);
            }
        });

        eGrua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityAyuda.this, Llamada.class);
                startActivity(intent);
            }
        });

        eMecanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityAyuda.this, Llamada.class);
                startActivity(intent);
            }
        });

        eAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityAyuda.this, Llamada.class);
                startActivity(intent);
            }
        });

        eLlanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityAyuda.this, Llamada.class);
                startActivity(intent);
            }
        });

        eElectrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityAyuda.this, Llamada.class);
                startActivity(intent);
            }
        });

        eOtro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityAyuda.this, Llamada.class);
                startActivity(intent);
            }
        });
    }
}