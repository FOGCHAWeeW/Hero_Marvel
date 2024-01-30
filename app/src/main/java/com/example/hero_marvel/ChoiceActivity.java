package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class ChoiceActivity extends AppCompatActivity {
    private TextView wInf;
    private TextView zInf;
    private int choiceWeapone;
    private int choiceZahita;
    private int kolvo;
    private int powerText;
    private int hpText;
    private int zahitaText;
    private int magikText;
    private String weaponeText;
    private int x;
    private int chInFight;
    private int chInZ;
    private int randomNum;
    private  int hpVrag;
    private int powerVrag;
    private int zahitaVrag;
    private int Pzl1;
    private int Pzl2;
    private int Pzl3;
    private int Pzl4;
    private int Pzl5;
    private int Pzl6;
    private int Pzl7;
    private int Pzl8;
    private int Pzl9;
    private int provBossIn;
    private  int hpBossS;
    private int powerBossS;
    private int zahitaBossS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        wInf = findViewById(R.id.wInf);
        zInf = findViewById(R.id.zInf);
        Intent intent = getIntent();
        x = intent.getIntExtra("x", 0);
        chInFight = intent.getIntExtra("chInFight", 0);
        randomNum = intent.getIntExtra("randomNum", 0);
        powerText = intent.getIntExtra("powerText",0);
        zahitaText = intent.getIntExtra("zahitaText",0);
        magikText = intent.getIntExtra("magikText",0);
        provBossIn = intent.getIntExtra("provBossIn",0);

        hpBossS = intent.getIntExtra("hpBoss", 0);
        powerBossS = intent.getIntExtra("powerBoss",0);
        zahitaBossS = intent.getIntExtra("zahitaBoss",0);

        hpText = intent.getIntExtra("hpText",0);
        kolvo = intent.getIntExtra("kolvo",0);
        Pzl1 = intent.getIntExtra("Pzl1", 0);
        Pzl2 = intent.getIntExtra("Pzl2", 0);
        Pzl3 = intent.getIntExtra("Pzl3", 0);
        Pzl4 = intent.getIntExtra("Pzl4", 0);
        Pzl5 = intent.getIntExtra("Pzl5", 0);
        Pzl6 = intent.getIntExtra("Pzl6", 0);
        Pzl7 = intent.getIntExtra("Pzl7", 0);
        Pzl8 = intent.getIntExtra("Pzl8", 0);
        Pzl9 = intent.getIntExtra("Pzl9", 0);
        hpVrag = intent.getIntExtra("hpVrag",0);
        powerVrag = intent.getIntExtra("powerVrag",0);
        zahitaVrag = intent.getIntExtra("zahitaVrag",0);
        weaponeText = intent.getStringExtra("weaponeText");



    }

    public void beak(View view) {
        if (chInFight == 1 && chInZ == 1) {
            if(provBossIn == 1){
                if (choiceZahita==1){
                    zahitaText+=100;
                }
                if (choiceZahita==2){
                    zahitaText+=200;
                    powerText-=50;
                }
                if (choiceZahita==3){
                    zahitaText+=200;
                    powerText-=50;
                }
                if (choiceZahita==4){
                    zahitaText+=300;
                    hpText-=100;
                }
                if (choiceWeapone==1){
                    powerText+=100;
                }
                if (choiceWeapone==2){
                    powerText+=100;
                }
                if (choiceWeapone==3){
                    powerText+=200;
                    zahitaText-=50;
                }
                if (choiceWeapone==4) {
                    powerText+=300;
                    hpText-=100;
                }
                if (hpText<400){
                    powerVrag-=300;
                    zahitaVrag-=300;
                }
            }
            if (choiceZahita==1){
                zahitaText+=10;
            }
            if (choiceZahita==2){
                zahitaText+=20;
                powerText-=10;
            }
            if (choiceZahita==3){
                zahitaText+=20;
                powerText-=10;
            }
            if (choiceZahita==4){
                zahitaText+=30;
                hpText-=10;
            }
            if (choiceWeapone==1){
                powerText+=10;
            }
            if (choiceWeapone==2){
                powerText+=10;
            }
            if (choiceWeapone==3){
                powerText+=20;
                zahitaText-=10;
            }
            if (choiceWeapone==4) {
                powerText+=30;
                hpText-=10;
            }
            if (hpText<400){
                powerVrag-=30;
                zahitaVrag-=30;
            }
        }

            if (provBossIn == 1){

                Intent intent = new Intent(this, BossActivity.class);
                intent.putExtra("provBossIn",provBossIn);
                intent.putExtra("x",x);
                intent.putExtra("powerText",powerText);
                intent.putExtra("chInFight",chInFight);
                intent.putExtra("hpText",hpText);
                intent.putExtra("zahitaText",zahitaText);
                intent.putExtra("magikText",magikText);
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
                intent.putExtra("powerBoss",powerBossS);
                intent.putExtra("hpBoss",hpBossS);
                intent.putExtra("zahitaBoss",zahitaBossS);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, FightActivity.class);
                intent.putExtra("x", x);
                intent.putExtra("chInFight",chInFight);
                intent.putExtra("randomNum", randomNum);
                intent.putExtra("powerText", powerText);
                intent.putExtra("hpText", hpText);
                intent.putExtra("zahitaText", zahitaText);
                intent.putExtra("magikText", magikText);
                intent.putExtra("weaponeText", weaponeText);
                intent.putExtra("kolvo", kolvo);
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
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }

    public void w1(View view) {
        if (provBossIn==1){
            wInf.setText(R.string.w1b);
        }else {
            wInf.setText(R.string.w1);
        }
        choiceWeapone = 1;
        chInFight = 1;

    }

    public void w2(View view) {
        choiceWeapone = 2;
        chInFight = 1;
        if (provBossIn==1){
            wInf.setText(R.string.w2b);
        }else {
            wInf.setText(R.string.w2);
        }
    }

    public void w3(View view) {
        choiceWeapone = 3;
        chInFight = 1;
        if (provBossIn==1){
            wInf.setText(R.string.w3b);
        }else {
            wInf.setText(R.string.w3);
        }
    }

    public void w4(View view) {
        choiceWeapone = 4;
        chInFight = 1;
        if (provBossIn==1){
            wInf.setText(R.string.w4b);
        }else {
            wInf.setText(R.string.w4);
        }
    }

    public void z1(View view) {
        choiceZahita = 1;
        chInZ = 1;
        if (provBossIn==1){
            zInf.setText(R.string.z1b);
        }else {
            zInf.setText(R.string.z1);
        }
    }

    public void z2(View view) {
        choiceZahita = 2;
        chInZ = 1;
        if (provBossIn==1){
            zInf.setText(R.string.z2b);
        }else {
            zInf.setText(R.string.z2);
        }
    }

    public void z3(View view) {
        choiceZahita = 3;
        chInZ = 1;
        if (provBossIn==1){
            zInf.setText(R.string.z3b);
        }else {
            zInf.setText(R.string.z3);
        }
    }

    public void z4(View view) {
        choiceZahita = 4;
        chInZ = 1;
        if (provBossIn==1){
            zInf.setText(R.string.z4b);
        }else {
            zInf.setText(R.string.z4);
        }
    }
}