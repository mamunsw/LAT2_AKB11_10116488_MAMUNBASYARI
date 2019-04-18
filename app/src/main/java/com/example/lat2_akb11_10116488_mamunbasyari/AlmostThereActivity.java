package com.example.lat2_akb11_10116488_mamunbasyari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }

    //<!--Nama : Ma'mun Basayri
    //Kelas : AKB-11
    //NIM : 10116488 -->

    public void Verify(View view) {
        Intent almost = new Intent(AlmostThereActivity.this, VerifyActivity.class);
        startActivity(almost);
    }
}
