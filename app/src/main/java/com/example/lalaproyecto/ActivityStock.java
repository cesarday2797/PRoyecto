package com.example.lalaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ActivityStock extends AppCompatActivity {

    private Button eBebidas;
    private Button eCremas;
    private Button eLeches;
    private Button eMM;
    private Button eQuesos;
    private Button eYoghurts;
    private Button eYoghurtsB;
    private Button ePostres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

    eBebidas = findViewById(R.id.btnBebidas);
    eCremas = findViewById(R.id.btnCremas);
    eLeches = findViewById(R.id.btnLeches);
    eMM = findViewById(R.id.btnMantequillas);
    eQuesos = findViewById(R.id.btnQuesos);
    eYoghurts = findViewById(R.id.btnYoghurts);
    eYoghurtsB = findViewById(R.id.btnYoghurtsB);
    ePostres = findViewById(R.id.btnPostres);

        eBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStock.this, ActivityPBebidas.class);
                startActivity(intent);
            }
        });

        eCremas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStock.this, Activity_P_Cremas.class);
                startActivity(intent);
            }
        });

        eLeches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStock.this, Activity_P_Leches.class);
                startActivity(intent);
            }
        });

        eMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStock.this, Activity_P_MM.class);
                startActivity(intent);
            }
        });

        eQuesos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStock.this, Activity_P_Quesos.class);
                startActivity(intent);
            }
        });

        eYoghurts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStock.this, Activity_P_Yoghurts.class);
                startActivity(intent);
            }
        });

        eYoghurtsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStock.this, Activity_P_YoghursB.class);
                startActivity(intent);
            }
        });

        ePostres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityStock.this, Activity_P_Postres.class);
                startActivity(intent);
            }
        });



    }


}