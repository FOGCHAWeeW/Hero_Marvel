package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class TransferActivity extends AppCompatActivity {
    private TextView powerTr;
    private TextView zahitaTr;
    private TextView weaponeTr;
    private TextView magikTr;
    private TextView kol_voVragTr;
    private int kolvo;
    private int powerText;
    private int zahitaText;
    private int magikText;
    private String weaponeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        Intent intent = getIntent();
        powerTr = findViewById(R.id.powerTr);
        zahitaTr = findViewById(R.id.zahitaTr);
        weaponeTr = findViewById(R.id.weaponeTr);
        magikTr = findViewById(R.id.magikTr);
        kol_voVragTr = findViewById(R.id.Kol_voVragTr);
        kolvo = Integer.parseInt(Objects.requireNonNull(intent.getStringExtra("kolvo")));
        if (kolvo == 0){
            powerText = Integer.parseInt(Objects.requireNonNull(intent.getStringExtra("powerText")));
            zahitaText = Integer.parseInt(Objects.requireNonNull(intent.getStringExtra("zahitaText")));
            magikText = Integer.parseInt(Objects.requireNonNull(intent.getStringExtra("magikText")));
            weaponeText = intent.getStringExtra("weaponeText");
            powerTr.setText("Сила:"+powerText+"/1000");
            zahitaTr.setText("Защита:"+zahitaText+"/1000");
            weaponeTr.setText("Оружие:"+weaponeText);
            magikTr.setText("Магия:"+magikText+"/10");
            kol_voVragTr.setText("Кол-во поверженных врагов:"+kolvo);


        }
    }

    public void go(View view) {
        Intent intent = new Intent(this, FightActivity.class);
        startActivity(intent);
    }

    public void inventory(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        startActivity(intent);
    }
}