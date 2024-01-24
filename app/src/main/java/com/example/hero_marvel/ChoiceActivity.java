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
    private int randomNum;
    private  int hpVrag;
    private int powerVrag;
    private int zahitaVrag;
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
        hpText = intent.getIntExtra("hpText",0);
        kolvo = intent.getIntExtra("kolvo",0);
        hpVrag = intent.getIntExtra("hpVrag",0);
        powerVrag = intent.getIntExtra("powerVrag",0);
        zahitaVrag = intent.getIntExtra("zahitaVrag",0);
        weaponeText = intent.getStringExtra("weaponeText");

    }

    public void beak(View view) {
        if (chInFight == 1) {

            if (choiceZahita==1){
                zahitaText = zahitaText+10;
            }
            if (choiceZahita==2){
                zahitaText = zahitaText+15;
                magikText = magikText-10;
            }
            if (choiceZahita==3){
                zahitaText = zahitaText+15;
                powerText = powerText-10;
            }
            if (choiceZahita==4){
                zahitaText = zahitaText+20;
                hpText = hpText-10;
            }
            if (choiceWeapone==1){
                powerText = powerText+10;
                hpText+=zahitaText;
                hpVrag+=zahitaVrag;
                hpVrag-=(powerText+magikText);
                hpText-=powerVrag;
            }
            if (choiceWeapone==2){
                magikText = magikText+10;
                hpText+=zahitaText;
                hpVrag+=zahitaVrag;
                hpVrag-=(powerText+magikText);
                hpText-=powerVrag;
            }
            if (choiceWeapone==3){
                powerText = powerText+15;
                magikText = magikText-10;
                hpText+=zahitaText;
                hpVrag+=zahitaVrag;
                hpVrag-=(powerText+magikText);
                hpText-=powerVrag;
            }
            if (choiceWeapone==4){
                powerText = powerText-20;
                magikText = magikText+20;
                hpText+=zahitaText;
                hpVrag+=zahitaVrag;
                hpVrag-=(powerText+magikText);
                hpText-=powerVrag;
            }
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
            startActivity(intent);
        }
    }

    public void w1(View view) {
        choiceWeapone = 1;
        chInFight = 1;
        wInf.setText(R.string.w1);
    }

    public void w2(View view) {
        choiceWeapone = 2;
        chInFight = 1;
        wInf.setText(R.string.w2);
    }

    public void w3(View view) {
        choiceWeapone = 3;
        chInFight = 1;
        wInf.setText(R.string.w3);
    }

    public void w4(View view) {
        choiceWeapone = 4;
        chInFight = 1;
        wInf.setText(R.string.w4);
    }

    public void z1(View view) {
        choiceZahita = 1;
        chInFight = 1;

        zInf.setText(R.string.z1);
    }

    public void z2(View view) {
        choiceZahita = 2;
        chInFight = 1;

        zInf.setText(R.string.z2);
    }

    public void z3(View view) {
        choiceZahita = 3;
        chInFight = 1;

        zInf.setText(R.string.z3);
    }

    public void z4(View view) {
        choiceZahita = 4;
        chInFight = 1;

        zInf.setText(R.string.z3);
    }
}