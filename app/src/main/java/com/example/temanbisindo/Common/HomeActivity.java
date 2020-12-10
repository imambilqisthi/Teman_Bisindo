package com.example.temanbisindo.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.temanbisindo.R;

public class HomeActivity extends AppCompatActivity {
    CardView CVHuruf,CVSpechToText,CvTentang,CvAngka,CVbulanhari,CVKataTanya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CVHuruf = findViewById(R.id.Huruf);
        CVSpechToText= findViewById(R.id.SpechToText);
        CvTentang = findViewById(R.id.Tentang);
        CvAngka = findViewById(R.id.Angka);
        CVbulanhari = findViewById(R.id.BulanHari);
        CVKataTanya = findViewById(R.id.KataTanya);
        CVHuruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HurufActivity.class);
                startActivity(intent);
            }
        });
        CVSpechToText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SpeechtoTextActivity.class);
                startActivity(intent);
            }
        });
        CvTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TentangActivity.class);
                startActivity(intent);
            }
        });
        CvAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AngkaActivity.class);
                startActivity(intent);
            }
        });
        CVbulanhari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, BulanhariActivity.class);
                startActivity(intent);
            }
        });
        CVKataTanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, KatatanyaActivity.class);
                startActivity(intent);
            }
        });
    }
}