package com.example.lalaproyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Llamada extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    private EditText mEditeTexNumber;
    private Button eBack;
    private Button eCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada);

        mEditeTexNumber = findViewById(R.id.etNumber);
        eBack = findViewById(R.id.btnBackCall);
        eCall = findViewById(R.id.btnCall);

        eCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                makePhoneCall();
            }
        });

        eBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Llamada.this, ActivityAyuda.class);
                startActivity(intent);
            }
        });
    }

    private void makePhoneCall(){
        String number = mEditeTexNumber.getText().toString();
        if(number.trim().length() > 0){

            if(ContextCompat.checkSelfPermission(Llamada.this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){

                ActivityCompat.requestPermissions(Llamada.this,
                        new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);


            } else{
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }else{
            Toast.makeText(Llamada.this, "Ingrese un n??mero de tel??fono", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == REQUEST_CALL){
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                makePhoneCall();
            }else{
                Toast.makeText(this, "Permiso DENEGADO", Toast.LENGTH_SHORT).show();
            }
        }
    }
}