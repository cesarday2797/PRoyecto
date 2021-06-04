package com.example.lalaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class HomePageActivity extends AppCompatActivity {

    private Button eID;
    private Button eAyuda;
    private Button ePromo;
    private Button eVenta;
    private Button eStock;
    private Button eAgenda;
    private Button eGPS;
    private Button eQR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Toolbar toolbar = findViewById(R.id.toolbarr);
        setSupportActionBar(toolbar);

        eID = findViewById(R.id.btnPerfil);
        eAyuda = findViewById(R.id.btnAyuda);
        ePromo = findViewById(R.id.btnPromo);
        eVenta = findViewById(R.id.btnVentas);
        eStock = findViewById(R.id.btnStock);
        eAgenda = findViewById(R.id.btnAgenda);
        eGPS = findViewById(R.id.btnGPS);
        eQR = findViewById(R.id.btnQR);

        eID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePageActivity.this, ActivityPerfil.class);
                startActivity(intent);
            }
        });

        eAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePageActivity.this, ActivityAyuda.class);
                startActivity(intent);
            }
        });

        ePromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePageActivity.this, ActivityPromo.class);
                startActivity(intent);
            }
        });

        eVenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePageActivity.this, ActivityVentas.class);
                startActivity(intent);
            }
        });

        eStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePageActivity.this, ActivityStock.class);
                startActivity(intent);
            }
        });

        eAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePageActivity.this, ActivityAgenda.class);
                startActivity(intent);
            }
        });

        eGPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePageActivity.this, ActivityGPS.class);
                startActivity(intent);
            }
        });

        eQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePageActivity.this, ActivityQR.class);
                startActivity(intent);
            }
        });
    }
}