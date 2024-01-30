package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class BossActivity extends AppCompatActivity {
    private int Pzl1;
    private int Pzl2;
    private int Pzl3;
    private int chInFight;
    private int Pzl4;
    private int Pzl5;
    private int Pzl6;
    private int Pzl7;
    private int Pzl8;
    private int Pzl9;
    private int x;
    private int kolvo;
    private int powerText;
    private int hpText;
    private int zahitaText;
    private int magikText;
    private int provBossIn = 1;
    private ImageView heroFightImage;
    private Drawable heroImage;
    private TextView heroHpBoss;
    private TextView heroPowerBoss;
    private TextView heroZahitaBoss;
    private TextView hpBoss;
    private TextView powerBoss;
    private TextView zahitaBoss;
    private  int hpBossS;
    private int powerBossS;
    private int zahitaBossS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        heroFightImage = findViewById(R.id.heroFightBoss);
        heroHpBoss = findViewById(R.id.heroHpBoss);
        heroPowerBoss = findViewById(R.id.heroPowerBoss);
        heroZahitaBoss = findViewById(R.id.heroZahitaBoss);
        hpBoss = findViewById(R.id.hpBoss);
        powerBoss = findViewById(R.id.powerBoss);
        zahitaBoss = findViewById(R.id.zahitaBoss);
        Intent intent = getIntent();
        x = intent.getIntExtra("x", 0);
        powerText = intent.getIntExtra("powerText",0);
        zahitaText = intent.getIntExtra("zahitaText",0);
        magikText = intent.getIntExtra("magikText",0);

        hpBossS = intent.getIntExtra("hpBoss",0);
        powerBossS = intent.getIntExtra("powerBoss",0);
        zahitaBossS = intent.getIntExtra("zahitaBoss",0);

        hpText = intent.getIntExtra("hpText",0);
        Pzl1 = intent.getIntExtra("Pzl1", 0);
        Pzl2 = intent.getIntExtra("Pzl2", 0);
        Pzl3 = intent.getIntExtra("Pzl3", 0);
        Pzl4 = intent.getIntExtra("Pzl4", 0);
        Pzl5 = intent.getIntExtra("Pzl5", 0);
        Pzl6 = intent.getIntExtra("Pzl6", 0);
        Pzl7 = intent.getIntExtra("Pzl7", 0);
        Pzl8 = intent.getIntExtra("Pzl8", 0);
        Pzl9 = intent.getIntExtra("Pzl9", 0);
        chInFight = intent.getIntExtra("chInFight", 0);
        kolvo = intent.getIntExtra("kolvo",0);
        heroImage = heroFightImage.getDrawable();
        if (x == 1) {
            heroFightImage.setImageResource(R.drawable.usa);
        }
        if (x == 2) {
            heroFightImage.setImageResource(R.drawable.jelezo);
        }
        if (x == 3) {
            heroFightImage.setImageResource(R.drawable.tor);
        }
        heroHpBoss.setText("hp:"+hpText);
        heroPowerBoss .setText("Урон:"+powerText);
        heroZahitaBoss.setText("Защита"+zahitaText);
        hpBoss.setText("hp:"+hpBossS);
        powerBoss.setText("Урон:"+powerBossS);
        zahitaBoss.setText("Защита"+zahitaBossS);
        if(chInFight == 1){
            powerText-=zahitaBossS;
            hpBossS-=(powerText+magikText);
            hpText-=(powerBossS);
            if (magikText<0){
                magikText=0;
            }
            if (powerText<0){
                powerText=0;
            }
            if (hpBossS>0){
                if (powerBossS<50){
                    powerBossS+=50;
                }
                if (powerText<200){
                    powerText+=200;
                }
                heroHpBoss.setText("hp:"+hpText);
                heroPowerBoss .setText("Урон:"+powerBossS);
                heroZahitaBoss.setText("Защита"+zahitaText);
                hpBoss.setText("hp:"+hpBossS);
                powerBoss.setText("Урон:"+powerBossS);
                zahitaBoss.setText("Защита"+zahitaBossS);
            }
            if (hpBossS<=0){
                Intent intent1 = new Intent(this, WinActivity.class);
                startActivity(intent1);
            }
            if (hpText<=0){
                Intent intent2 = new Intent(this, LossActivity.class);
                startActivity(intent2);
            }
        }



    }

    public void invent(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        intent.putExtra("provBossIn",provBossIn);
        intent.putExtra("x",x);
        intent.putExtra("powerText",powerText);
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
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }

    public void fight(View view) {
        chInFight = 0;
        Intent intent = new Intent(this, ChoiceActivity.class);
        intent.putExtra("provBossIn",provBossIn);
        intent.putExtra("x",x);
        intent.putExtra("powerText",powerText);
        intent.putExtra("chInFight",0);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("kolvo",kolvo);
        intent.putExtra("powerBoss",powerBossS);
        intent.putExtra("hpBoss",hpBossS);
        intent.putExtra("zahitaBoss",zahitaBossS);
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