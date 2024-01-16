package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloText = findViewById(R.id.helloText);
        power = findViewById(R.id.power);
        zahita = findViewById(R.id.zahita);
        weapone = findViewById(R.id.weapone);
        magik = findViewById(R.id.magik);

    }
    public void usa(View view) {
        x=1;
        helloText.setText(R.string.usa);
        power.setText("Сила:910/1000");
        zahita.setText("Защита:710/1000");
        magik.setText("Магия:2/10");
        weapone.setText("Оружие:Щит");

    }
    public void jelezo(View view) {
        x=2;
        helloText.setText(R.string.jelezo);
        power.setText("Сила:710/1000");
        zahita.setText("Защита:910/1000");
        magik.setText("Магия:3/10");
        weapone.setText("Оружие:Суперкостюм");
    }
    public void tor(View view) {
        x=3;
        powerText = 830;
        zahitaText = 830;
        magikText = 7;
        helloText.setText(R.string.tor);
        power.setText("Сила:830/1000");
        zahita.setText("Защита:830/1000");
        magik.setText("Магия:7/10");
        weapone.setText("Оружие:Мьёльнир");
    }
    public void start(View view) {
        Intent intent = new Intent(this, TransferActivity.class);
        if (x == 1) {
            intent.putExtra("powerText",910);
            intent.putExtra("zahitaText",710);
            intent.putExtra("magikText",2);
        }
        if (x == 2) {
            intent.putExtra("powerText",710);
            intent.putExtra("zahitaText",910);
            intent.putExtra("magikText",3);
        }
        if (x == 3) {
            intent.putExtra("powerText",830);
            intent.putExtra("zahitaText",830);
            intent.putExtra("magikText",7);
        }
        startActivity(intent);
    }
}