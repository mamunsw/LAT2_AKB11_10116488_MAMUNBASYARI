package com.example.lat2_akb11_10116488_mamunbasyari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //<!--Nama : Ma'mun Basayri
    //Kelas : AKB-11
    //NIM : 10116488 -->


    public void login(View view) {
        Intent login = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(login);
    }

    public void Register(View view) {

        Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(register);
    }
}
