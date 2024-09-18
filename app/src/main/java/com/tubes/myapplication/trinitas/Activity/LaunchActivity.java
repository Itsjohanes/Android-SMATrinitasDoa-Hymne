package com.tubes.myapplication.trinitas.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.tubes.myapplication.R;
import com.tubes.myapplication.databinding.ActivityMainBinding;

public class LaunchActivity extends AppCompatActivity {
    Button btnHymne, btnDoa;
    private static SharedPreferences preferences;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        btnHymne = findViewById(R.id.btn_hymne);
        btnDoa = findViewById(R.id.btn_doa);
        btnHymne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              // Perintah Intent Explicit pindah halaman ke activity_detail
             startActivity(new Intent(LaunchActivity.this, HymneTrinitas.class));
            }
        });

        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Perintah Intent Explicit pindah halaman ke activity_detail
                startActivity(new Intent(LaunchActivity.this, Doa.class));
            }
        });
    }


}
