package com.example.lat2_akb11_10116488_mamunbasyari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    //<!--Nama : Ma'mun Basayri
    //Kelas : AKB-11
    //NIM : 10116488 -->


    public void send(View view) {
        Intent send = new Intent(VerifyActivity.this, HomeActivity.class);
        startActivity(send);
    }
}
