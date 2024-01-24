package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

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
    private int randomNum = (int) (Math.random() * 9) + kolvo;
    private  int hpVrag;
    private int powerVrag;
    private int zahitaVrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Intent intent = getIntent();
        powerTr = findViewById(R.id.powerTr);
        zahitaTr = findViewById(R.id.zahitaTr);
        weaponeTr = findViewById(R.id.weaponeTr);
        magikTr = findViewById(R.id.magikIn);
        hpTr = findViewById(R.id.hpTr);
        kol_voVragTr = findViewById(R.id.Kol_voVragTr);
        kolvo = intent.getIntExtra("kolvo", 0);
        x = intent.getIntExtra("x", 0);
        powerText = intent.getIntExtra("powerText",0);
        zahitaText =intent.getIntExtra("zahitaText",0);
        magikText = intent.getIntExtra("magikText",0);
        hpText = intent.getIntExtra("hpText",0);
        weaponeText = intent.getStringExtra("weaponeText");
        hpVrag = intent.getIntExtra("hpVrag",0);
        powerVrag = intent.getIntExtra("powerVrag",0);
        zahitaVrag = intent.getIntExtra("zahitaVrag",0);
        powerTr.setText("Сила:"+powerText);
        hpTr.setText("Здоровье:"+hpText);
        zahitaTr.setText("Защита:"+zahitaText);
        weaponeTr.setText("Оружие:"+weaponeText);
        magikTr.setText("Магия:"+magikText);
        kol_voVragTr.setText("Кол-во поверженных врагов:"+kolvo+"/9");

    }

    public void go(View view) {
        kolvo++;
        if (kolvo == 1){
            hpVrag=60;
            powerVrag=30;
            zahitaVrag=30;
        }
        if (kolvo == 2){
            hpText=200;
            hpVrag=60;
            powerVrag=60;
            zahitaVrag=60;
        }
        if (kolvo == 3){
            hpText=250;
            hpVrag=100;
            powerVrag=80;
            zahitaVrag=100;
        }
        if (kolvo == 4){
            hpText=300;
            hpVrag=100;
            powerVrag=100;
            zahitaVrag=100;
        }
        if (kolvo == 5){
            hpText=300;
            hpVrag=100;
            powerVrag=150;
            zahitaVrag=100;
        }
        if (kolvo == 6){
            hpText=350;
            hpVrag=100;
            powerVrag=200;
            zahitaVrag=100;
        }
        if (kolvo == 7){
            hpText=400;
            hpVrag=100;
            powerVrag=200;
            zahitaVrag=200;
        }
        if (kolvo == 8){
            hpText=500;
            hpVrag=100;
            powerVrag=300;
            zahitaVrag=100;
        }
        if (kolvo == 9){
            hpText=500;
            hpVrag=100;
            powerVrag=350;
            zahitaVrag=200;
        }
        if (kolvo ==10){
            //BOSSSSSSS!!!
        }
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("randomNum",randomNum);
        intent.putExtra("powerText",powerText);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("weaponeText",weaponeText);
        intent.putExtra("kolvo",kolvo);
        intent.putExtra("hpVrag",hpVrag);
        intent.putExtra("powerVrag",powerVrag);
        intent.putExtra("zahitaVrag",zahitaVrag);
        startActivity(intent);
    }

    public void inventory(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("flag",flag);
        intent.putExtra("powerText",powerText);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("weaponeText",weaponeText);
        intent.putExtra("kolvo",kolvo);
        startActivity(intent);
    }
}