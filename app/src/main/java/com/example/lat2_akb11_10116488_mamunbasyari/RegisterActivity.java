package com.example.lat2_akb11_10116488_mamunbasyari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    //<!--Nama : Ma'mun Basayri
    //Kelas : AKB-11
    //NIM : 10116488 -->


    public void Regis(View view) {
        Intent regis = new Intent(RegisterActivity.this, AlmostThereActivity.class);
                startActivity(regis);
    }

    public void Register(View view) {
        Intent register = new Intent(RegisterActivity.this, AlmostThereActivity.class);
        startActivity(register);
    }
}
