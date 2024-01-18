package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class TransferActivity extends AppCompatActivity {
    private TextView hpTr;
    private TextView powerTr;
    private TextView zahitaTr;
    private TextView weaponeTr;
    private TextView magikTr;
    private TextView kol_voVragTr;
    private int kolvo;
    private int powerText;
    private int hpText;
    private int zahitaText;
    private int magikText;
    private int x;
    private int flag = 1;
    private String weaponeText;
    private int randomNum = (int) (Math.random() * 9) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        Intent intent = getIntent();
        powerTr = findViewById(R.id.powerTr);
        zahitaTr = findViewById(R.id.zahitaTr);
        weaponeTr = findViewById(R.id.weaponeTr);
        magikTr = findViewById(R.id.magikTr);
        hpTr = findViewById(R.id.hpTr);
        kol_voVragTr = findViewById(R.id.Kol_voVragTr);
        kolvo = intent.getIntExtra("kolvo", 0);
        x = intent.getIntExtra("x", 0);
        if (kolvo == 0){
            powerText = intent.getIntExtra("powerText",0);
            zahitaText =intent.getIntExtra("zahitaText",0);
            magikText = intent.getIntExtra("magikText",0);
            hpText = intent.getIntExtra("hpText",0);
            weaponeText = intent.getStringExtra("weaponeText");
            powerTr.setText("Сила:"+powerText+"/1000");
            hpTr.setText("Здоровье:"+hpText);
            zahitaTr.setText("Защита:"+zahitaText+"/1000");
            weaponeTr.setText("Оружие:"+weaponeText);
            magikTr.setText("Магия:"+magikText+"/10");
            kol_voVragTr.setText("Кол-во поверженных врагов:"+kolvo+"/10");
        }
    }

    public void go(View view) {
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("randomNum",randomNum);
        startActivity(intent);
    }

    public void inventory(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("flag",flag);
        startActivity(intent);
    }
}