package com.example.lalaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eID;
    private EditText ePasswprd;
    private Button eLogin;
    private TextView eIntentosInfo;

    private String IDVendedor = "ZuritaC340551";
    private String IDPassward = "123456";

    boolean isValid = false;
    private int count = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eID = findViewById(R.id.etIDUser);
        ePasswprd = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eIntentosInfo = findViewById(R.id.tvIntentosInfo);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputID = eID.getText().toString();
                String inputPassword = ePasswprd.getText().toString();

                if(inputID.isEmpty() || inputPassword.isEmpty()){

                    Toast.makeText(MainActivity.this, "INGRESE LOS DATOS QUE SE LE PIDEN", Toast.LENGTH_SHORT).show();
                }

                else{
                    isValid = validate(inputID, inputPassword);

                    if(!isValid){
                        count--;
                        Toast.makeText(MainActivity.this, "ID  O CONTRASEÑA INCORRECTA", Toast.LENGTH_SHORT).show();

                        eIntentosInfo.setText("NÚMERO DE INTENTOS: "+count); //imprime ese mensaje y pone el contador actual

                        if(count == 0){
                            eLogin.setEnabled(false);
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "INICIO DE SESIÓN CORRECTO", Toast.LENGTH_SHORT).show();
                        count=5;

                        //Es la actividad que sigue y el como llamarla
                        Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                        startActivity(intent);
                    }
                }

            }
        });
    }

    private boolean validate(String id, String password){
        //funcion para verificar que los datos son correctos
        if(id.equals(IDVendedor) && password.equals(IDPassward)){
            return true;
        }
        return false;
    }
}