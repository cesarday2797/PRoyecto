package com.example.lalaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPerfil extends AppCompatActivity {

    private Button eBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        eBack = findViewById(R.id.btnBack);

        eBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPerfil.this, HomePageActivity.class);
                startActivity(intent);
            }
        });
    }
}