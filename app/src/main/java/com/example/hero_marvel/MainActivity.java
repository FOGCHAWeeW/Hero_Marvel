package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private TextView power;
    private TextView zahita;
    private TextView weapone;
    private TextView magik;
    private int powerText;
    private int zahitaText;
    private int magikText;
    private String weaponeText;
    private int x;
    private int kolvo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        helloText = findViewById(R.id.helloText);
        power = findViewById(R.id.power);
        zahita = findViewById(R.id.zahita);
        weapone = findViewById(R.id.weapone);
        magik = findViewById(R.id.magik);

    }
    public void usa(View view) {
        x=1;
        helloText.setText(R.string.usa);
        power.setText("Сила:80");
        zahita.setText("Защита:60");
        magik.setText("Магия:20");
        weapone.setText("Оружие:Щит");

    }
    public void jelezo(View view) {
        x=2;
        helloText.setText(R.string.jelezo);
        power.setText("Сила:60");
        zahita.setText("Защита:80");
        magik.setText("Магия:30");
        weapone.setText("Оружие:Суперкостюм");
    }
    public void tor(View view) {
        x=3;
        helloText.setText(R.string.tor);
        power.setText("Сила:50");
        zahita.setText("Защита:60");
        magik.setText("Магия:70");
        weapone.setText("Оружие:Мьёльнир");
    }
    public void start(View view) {
        Intent intent = new Intent(this, TransferActivity.class);
        if (x == 1) {
            intent.putExtra("powerText",80);
            intent.putExtra("hpText",100);
            intent.putExtra("zahitaText",60);
            intent.putExtra("magikText",20);
            intent.putExtra("weaponeText","Щит");
            intent.putExtra("kolvo",0);
            intent.putExtra("x",1);
            startActivity(intent);

        }
        if (x == 2) {
            intent.putExtra("powerText",60);
            intent.putExtra("hpText",100);
            intent.putExtra("zahitaText",80);
            intent.putExtra("magikText",30);
            intent.putExtra("weaponeText","Суперкостюм");
            intent.putExtra("kolvo",0);
            intent.putExtra("x",2);
            startActivity(intent);
        }
        if (x == 3) {
            intent.putExtra("powerText",60);
            intent.putExtra("hpText",100);
            intent.putExtra("zahitaText",70);
            intent.putExtra("magikText",70);
            intent.putExtra("weaponeText","Мьёльнир");
            intent.putExtra("kolvo",0);
            intent.putExtra("x",3);
            startActivity(intent);
        }

    }
}