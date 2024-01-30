package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class TransferActivity extends AppCompatActivity {
    private TextView hpTr;
    private TextView powerTr;
    private TextView zahitaTr;
    private TextView weaponeTr;
    private TextView magikTr;
    private TextView kol_voVragTr;
    private Button go;
    private int kolvo;
    private int powerText;
    private int hpText;
    private int zahitaText;
    private int magikText;
    private int x;
    private int flag = 1;
    private String weaponeText;
    private int randomNum = (int) (Math.random() * 9) + 1;
    private  int hpVrag;
    private int powerVrag;
    private int zahitaVrag;
    private int proverkaInvent;
    private int Pzl1;
    private int Pzl2;
    private int Pzl3;
    private int Pzl4;
    private int Pzl5;
    private int Pzl6;
    private int Pzl7;
    private int Pzl8;
    private int Pzl9;
    private  int hpBoss;
    private int powerBoss;
    private int zahitaBoss;

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
        go = findViewById(R.id.go);
        hpTr = findViewById(R.id.hpTr);
        kol_voVragTr = findViewById(R.id.Kol_voVragTr);
        kolvo = intent.getIntExtra("kolvo", 0);
        x = intent.getIntExtra("x", 0);
        powerText = intent.getIntExtra("powerText",0);
        zahitaText =intent.getIntExtra("zahitaText",0);
        magikText = intent.getIntExtra("magikText",0);
        Pzl1 = intent.getIntExtra("Pzl1", 0);
        Pzl2 = intent.getIntExtra("Pzl2", 0);
        Pzl3 = intent.getIntExtra("Pzl3", 0);
        Pzl4 = intent.getIntExtra("Pzl4", 0);
        Pzl5 = intent.getIntExtra("Pzl5", 0);
        Pzl6 = intent.getIntExtra("Pzl6", 0);
        Pzl7 = intent.getIntExtra("Pzl7", 0);
        Pzl8 = intent.getIntExtra("Pzl8", 0);
        Pzl9 = intent.getIntExtra("Pzl9", 0);
        hpText = intent.getIntExtra("hpText",0);
        weaponeText = intent.getStringExtra("weaponeText");
        hpVrag = intent.getIntExtra("hpVrag",0);
        powerVrag = intent.getIntExtra("powerVrag",0);
        zahitaVrag = intent.getIntExtra("zahitaVrag",0);
        proverkaInvent = intent.getIntExtra("proverkaInvent",0);
        powerTr.setText("Сила:"+powerText);
        hpTr.setText("Здоровье:"+hpText);
        zahitaTr.setText("Защита:"+zahitaText);
        weaponeTr.setText("Оружие:"+weaponeText);
        magikTr.setText("Магия:"+magikText);
        kol_voVragTr.setText("Кол-во поверженных врагов:"+kolvo+"/9");
        if (kolvo == 9){
            go.setText("!BOSS!");
        }

    }

    public void go(View view) {
        if (kolvo == 0){
            hpVrag=60;
            powerVrag=50;
            zahitaVrag=30;
        }
        if (kolvo == 1){
            hpVrag=200;
            powerVrag=50;
            zahitaVrag=60;
        }
        if (kolvo == 2){
            hpVrag=400;
            powerVrag=50;
            zahitaVrag=50;
        }
        if (kolvo == 3){
            hpVrag=500;
            powerVrag=50;
            zahitaVrag=50;
        }
        if (kolvo == 4){
            hpVrag=700;
            powerVrag=50;
            zahitaVrag=40;
        }
        if (kolvo == 5){
            hpVrag=800;
            powerVrag=50;
            zahitaVrag=30;
        }
        if (kolvo == 6){
            hpVrag=900;
            powerVrag=50;
            zahitaVrag=10;
        }
        if (kolvo == 7){
            hpVrag=1000;
            powerVrag=50;
            zahitaVrag=10;
        }
        if (kolvo == 8){
            hpVrag=1100;
            powerVrag=50;
            zahitaVrag=100;
        }
        if (kolvo == 9){

            Intent intent23 = new Intent(this, BossActivity.class);
            intent23.putExtra("x",x);
            intent23.putExtra("Pzl1",Pzl1);
            intent23.putExtra("Pzl2",Pzl2);
            intent23.putExtra("Pzl3",Pzl3);
            intent23.putExtra("Pzl4",Pzl4);
            intent23.putExtra("Pzl5",Pzl5);
            intent23.putExtra("Pzl6",Pzl6);
            intent23.putExtra("Pzl7",Pzl7);
            intent23.putExtra("Pzl8",Pzl8);
            intent23.putExtra("Pzl9",Pzl9);
            intent23.putExtra("powerText",powerText);

            intent23.putExtra("powerBoss",100);
            intent23.putExtra("hpBoss",4000);
            intent23.putExtra("zahitaBoss",100);

            intent23.putExtra("hpText",hpText);
            intent23.putExtra("zahitaText",zahitaText);
            intent23.putExtra("kolvo",kolvo);
            intent23.putExtra("magikText",magikText);
            intent23.putExtra("weaponeText",weaponeText);
            startActivity(intent23);
        }else{
            Intent intent = new Intent(this, FightActivity.class);
            intent.putExtra("x",x);
            intent.putExtra("randomNum",randomNum);
            intent.putExtra("powerText",powerText);
            intent.putExtra("hpText",hpText);
            intent.putExtra("zahitaText",zahitaText);
            intent.putExtra("magikText",magikText);
            intent.putExtra("weaponeText",weaponeText);
            intent.putExtra("proverkaInvent",proverkaInvent);
            intent.putExtra("kolvo",kolvo);
            intent.putExtra("hpVrag",hpVrag);
            intent.putExtra("powerVrag",powerVrag);
            intent.putExtra("zahitaVrag",zahitaVrag);
            intent.putExtra("Pzl1",Pzl1);
            intent.putExtra("Pzl2",Pzl2);
            intent.putExtra("Pzl3",Pzl3);
            intent.putExtra("Pzl4",Pzl4);
            intent.putExtra("Pzl5",Pzl5);
            intent.putExtra("Pzl6",Pzl6);
            intent.putExtra("Pzl7",Pzl7);
            intent.putExtra("Pzl8",Pzl8);
            intent.putExtra("Pzl9",Pzl9);
            startActivity(intent);
        }


    }

    public void inventory(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("flag",flag);
        intent.putExtra("proverkaInvent",proverkaInvent);
        intent.putExtra("powerText",powerText);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("weaponeText",weaponeText);
        intent.putExtra("kolvo",kolvo);
        intent.putExtra("Pzl1",Pzl1);
        intent.putExtra("Pzl2",Pzl2);
        intent.putExtra("Pzl3",Pzl3);
        intent.putExtra("Pzl4",Pzl4);
        intent.putExtra("Pzl5",Pzl5);
        intent.putExtra("Pzl6",Pzl6);
        intent.putExtra("Pzl7",Pzl7);
        intent.putExtra("Pzl8",Pzl8);
        intent.putExtra("Pzl9",Pzl9);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }

}