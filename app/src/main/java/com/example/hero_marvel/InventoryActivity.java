package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class InventoryActivity extends AppCompatActivity {
    private TextView hpIn;
    private TextView powerIn;
    private TextView zahitaIn;
    private TextView weaponeIn;
    private TextView magikIn;
    private TextView kol_voVragIn;
    private int x;
    private int flag;
    private Button beakFight;
    private Button beakOne;
    private Button beakBoss;
    private ImageButton zl1;
    private ImageButton zl2;
    private ImageButton zl3;
    private ImageButton zl4;
    private ImageButton zl5;
    private ImageButton zl6;
    private ImageButton zl7;
    private ImageButton zl8;
    private ImageButton zl9;
    private int Pzl1;
    private int Pzl2;
    private int Pzl3;
    private int Pzl4;
    private int Pzl5;
    private int Pzl6;
    private int Pzl7;
    private int Pzl8;
    private int Pzl9;
    private int randomNum;
    private int kolvo;
    private int powerText;
    private int hpText;
    private int zahitaText;
    private int magikText;
    private String weaponeText;
    private  int hpVrag;
    private int powerVrag;
    private int zahitaVrag;
    private int prov;
    private TextView infInvent;
    private int proverkaInvent;
    private int provBossIn;

    private  int hpBossS;
    private int powerBossS;
    private int zahitaBossS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        beakFight = findViewById(R.id.beakFight);
        powerIn = findViewById(R.id.powerIn);
        hpIn = findViewById(R.id.hpIn);
        zahitaIn = findViewById(R.id.zahitaIn);
        Intent intent = getIntent();
        magikIn = findViewById(R.id.magikIn);
        kol_voVragIn = findViewById(R.id.kol_voVragIn);
        beakOne = findViewById(R.id.beakOne);
        beakBoss = findViewById(R.id.beakBoss);
        infInvent = findViewById(R.id.infInvent);

        hpBossS = intent.getIntExtra("hpBoss",0);
        powerBossS = intent.getIntExtra("powerBoss",0);
        zahitaBossS = intent.getIntExtra("zahitaBoss",0);

        zl1 = findViewById(R.id.zl1);
        zl2 = findViewById(R.id.zl2);
        zl3 = findViewById(R.id.zl3);

        zl4 = findViewById(R.id.zl4);
        zl5 = findViewById(R.id.zl5);
        zl6 = findViewById(R.id.zl6);
        zl7 = findViewById(R.id.zl7);
        zl8 = findViewById(R.id.zl8);
        zl9 = findViewById(R.id.zl9);

        proverkaInvent = intent.getIntExtra("proverkaInvent",0);
        Pzl1 = intent.getIntExtra("Pzl1", 0);
        Pzl2 = intent.getIntExtra("Pzl2", 0);
        Pzl3 = intent.getIntExtra("Pzl3", 0);
        Pzl4 = intent.getIntExtra("Pzl4", 0);
        Pzl5 = intent.getIntExtra("Pzl5", 0);
        Pzl6 = intent.getIntExtra("Pzl6", 0);
        Pzl7 = intent.getIntExtra("Pzl7", 0);
        Pzl8 = intent.getIntExtra("Pzl8", 0);
        Pzl9 = intent.getIntExtra("Pzl9", 0);
        provBossIn = intent.getIntExtra("provBossIn",0);
        powerText = intent.getIntExtra("powerText",0);
        zahitaText = intent.getIntExtra("zahitaText",0);
        magikText = intent.getIntExtra("magikText",0);
        hpText = intent.getIntExtra("hpText",0);
        kolvo = intent.getIntExtra("kolvo",0);
        weaponeText = intent.getStringExtra("weaponeText");
        x = intent.getIntExtra("x", 0);
        randomNum = intent.getIntExtra("randomNum", 0);
        flag = intent.getIntExtra("flag", 0);
        powerIn.setText("Сила:"+powerText);
        hpIn.setText("Здоровье:"+hpText);
        zahitaIn.setText("Защита:"+zahitaText);
        magikIn.setText("Магия:"+magikText);
        kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
        hpVrag = intent.getIntExtra("hpVrag",0);
        powerVrag = intent.getIntExtra("powerVrag",0);
        zahitaVrag = intent.getIntExtra("zahitaVrag",0);
        zl1.setVisibility(View.INVISIBLE);
        zl2.setVisibility(View.INVISIBLE);
        zl3.setVisibility(View.INVISIBLE);
        zl4.setVisibility(View.INVISIBLE);
        zl5.setVisibility(View.INVISIBLE);
        zl6.setVisibility(View.INVISIBLE);
        zl7.setVisibility(View.INVISIBLE);
        zl8.setVisibility(View.INVISIBLE);
        zl9.setVisibility(View.INVISIBLE);
        if (flag == 1){
            beakFight.setVisibility(View.INVISIBLE);
        }
        if (flag == 2){
            beakOne.setVisibility(View.INVISIBLE);
        }
        if (kolvo == 0){
            zl1.setVisibility(View.INVISIBLE);
            zl2.setVisibility(View.INVISIBLE);
            zl3.setVisibility(View.INVISIBLE);
            zl4.setVisibility(View.INVISIBLE);
            zl5.setVisibility(View.INVISIBLE);
            zl6.setVisibility(View.INVISIBLE);
            zl7.setVisibility(View.INVISIBLE);
            zl8.setVisibility(View.INVISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 1){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.INVISIBLE);
            zl3.setVisibility(View.INVISIBLE);
            zl4.setVisibility(View.INVISIBLE);
            zl5.setVisibility(View.INVISIBLE);
            zl6.setVisibility(View.INVISIBLE);
            zl7.setVisibility(View.INVISIBLE);
            zl8.setVisibility(View.INVISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 2){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.VISIBLE);
            zl3.setVisibility(View.INVISIBLE);
            zl4.setVisibility(View.INVISIBLE);
            zl5.setVisibility(View.INVISIBLE);
            zl6.setVisibility(View.INVISIBLE);
            zl7.setVisibility(View.INVISIBLE);
            zl8.setVisibility(View.INVISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 3){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.VISIBLE);
            zl3.setVisibility(View.VISIBLE);
            zl4.setVisibility(View.INVISIBLE);
            zl5.setVisibility(View.INVISIBLE);
            zl6.setVisibility(View.INVISIBLE);
            zl7.setVisibility(View.INVISIBLE);
            zl8.setVisibility(View.INVISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 4){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.VISIBLE);
            zl3.setVisibility(View.VISIBLE);
            zl4.setVisibility(View.VISIBLE);
            zl5.setVisibility(View.INVISIBLE);
            zl6.setVisibility(View.INVISIBLE);
            zl7.setVisibility(View.INVISIBLE);
            zl8.setVisibility(View.INVISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 5){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.VISIBLE);
            zl3.setVisibility(View.VISIBLE);
            zl4.setVisibility(View.VISIBLE);
            zl5.setVisibility(View.VISIBLE);
            zl6.setVisibility(View.INVISIBLE);
            zl7.setVisibility(View.INVISIBLE);
            zl8.setVisibility(View.INVISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 6){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.VISIBLE);
            zl3.setVisibility(View.VISIBLE);
            zl4.setVisibility(View.VISIBLE);
            zl5.setVisibility(View.VISIBLE);
            zl6.setVisibility(View.VISIBLE);
            zl7.setVisibility(View.INVISIBLE);
            zl8.setVisibility(View.INVISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 7){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.VISIBLE);
            zl3.setVisibility(View.VISIBLE);
            zl4.setVisibility(View.VISIBLE);
            zl5.setVisibility(View.VISIBLE);
            zl6.setVisibility(View.VISIBLE);
            zl7.setVisibility(View.VISIBLE);
            zl8.setVisibility(View.INVISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 8){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.VISIBLE);
            zl3.setVisibility(View.VISIBLE);
            zl4.setVisibility(View.VISIBLE);
            zl5.setVisibility(View.VISIBLE);
            zl6.setVisibility(View.VISIBLE);
            zl7.setVisibility(View.VISIBLE);
            zl8.setVisibility(View.VISIBLE);
            zl9.setVisibility(View.INVISIBLE);
        }
        if(kolvo == 9){
            zl1.setVisibility(View.VISIBLE);
            zl2.setVisibility(View.VISIBLE);
            zl3.setVisibility(View.VISIBLE);
            zl4.setVisibility(View.VISIBLE);
            zl5.setVisibility(View.VISIBLE);
            zl6.setVisibility(View.VISIBLE);
            zl7.setVisibility(View.VISIBLE);
            zl8.setVisibility(View.VISIBLE);
            zl9.setVisibility(View.VISIBLE);
        }
        if (Pzl1 == 1){
            zl1.setVisibility(View.INVISIBLE);
        }
        if (Pzl2 == 2){
            zl2.setVisibility(View.INVISIBLE);
        }
        if (Pzl3 == 3){
            zl3.setVisibility(View.INVISIBLE);
        }
        if (Pzl4 == 4){
            zl4.setVisibility(View.INVISIBLE);
        }
        if (Pzl5 == 5){
            zl5.setVisibility(View.INVISIBLE);
        }
        if (Pzl6 == 6){
            zl6.setVisibility(View.INVISIBLE);
        }
        if (Pzl7 == 7){
            zl7.setVisibility(View.INVISIBLE);
        }
        if (Pzl8 == 8){
            zl8.setVisibility(View.INVISIBLE);
        }
        if (Pzl9 == 9){
            zl9.setVisibility(View.INVISIBLE);
        }
        if (provBossIn==1){
            beakOne.setVisibility(View.INVISIBLE);
            beakFight.setVisibility(View.INVISIBLE);
            beakBoss.setVisibility(View.VISIBLE);
        }
        if (provBossIn!=1){
            beakBoss.setVisibility(View.INVISIBLE);
        }

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }

    public void beakFight(View view) {
        flag = 0;
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("randomNum",randomNum);
        intent.putExtra("proverkaInvent",proverkaInvent);
        intent.putExtra("Pzl1",Pzl1);
        intent.putExtra("Pzl2",Pzl2);
        intent.putExtra("Pzl3",Pzl3);
        intent.putExtra("Pzl4",Pzl4);
        intent.putExtra("Pzl5",Pzl5);
        intent.putExtra("Pzl6",Pzl6);
        intent.putExtra("Pzl7",Pzl7);
        intent.putExtra("Pzl8",Pzl8);
        intent.putExtra("Pzl9",Pzl9);
        intent.putExtra("flag",flag);
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
        beakOne.setVisibility(View.VISIBLE);
    }

    public void beakOne(View view) {
        flag = 0;
        Intent intent = new Intent(this, TransferActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("powerText",powerText);
        intent.putExtra("proverkaInvent",proverkaInvent);
        intent.putExtra("hpText",hpText);
        intent.putExtra("Pzl1",Pzl1);
        intent.putExtra("Pzl2",Pzl2);
        intent.putExtra("Pzl3",Pzl3);
        intent.putExtra("Pzl4",Pzl4);
        intent.putExtra("Pzl5",Pzl5);
        intent.putExtra("Pzl6",Pzl6);
        intent.putExtra("Pzl7",Pzl7);
        intent.putExtra("Pzl8",Pzl8);
        intent.putExtra("Pzl9",Pzl9);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("weaponeText",weaponeText);
        intent.putExtra("kolvo",kolvo);
        intent.putExtra("hpVrag",hpVrag);
        intent.putExtra("powerVrag",powerVrag);
        intent.putExtra("zahitaVrag",zahitaVrag);
        startActivity(intent);

        beakFight.setVisibility(View.VISIBLE);
    }

    public void use(View view) {
        if (prov == 1){
            zl1.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl1 = 1;
            hpText+=400;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }if (prov == 2){
            zl2.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl2 = 2;
            magikText+=150;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }if (prov == 3){
            zl3.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl3 = 3;
            zahitaText+=150;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }if (prov == 4){
            zl4.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl4 = 4;
            powerText+=200;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }if (prov == 5){
            zl5.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl5 = 5;
            hpText+=400;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }if (prov == 6){
            zl6.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl6 = 6;
            hpText+=400;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }if (prov == 7){
            zl7.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl7 = 7;
            powerText+=200;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }if (prov == 8){
            zl8.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl8 = 8;
            magikText+=200;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }if (prov == 9){
            zl9.setVisibility(View.INVISIBLE);
            prov=0;
            Pzl9 = 9;
            zahitaText+=200;
            powerIn.setText("Сила:"+powerText);
            hpIn.setText("Здоровье:"+hpText);
            zahitaIn.setText("Защита:"+zahitaText);
            magikIn.setText("Магия:"+magikText);
            kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
            infInvent.setText("Инфо:");
        }

    }
    public void zl1(View view) {
        prov = 1;
        infInvent.setText(R.string.hpZl);
    }
    public void zl2(View view) {
        prov = 2;
        infInvent.setText(R.string.magikZl);

    }
    public void zl3(View view) {
        prov = 3;
        infInvent.setText(R.string.zahitaZl);

    }
    public void zl4(View view) {
        prov = 4;
        infInvent.setText(R.string.powerZl);

    }
    public void zl5(View view) {
        prov = 5;
        infInvent.setText(R.string.hpZl);

    }
    public void zl6(View view) {
        prov = 6;
        infInvent.setText(R.string.hpZl);

    }
    public void zl7(View view) {
        prov = 7;
        infInvent.setText(R.string.powerZl);

    }
    public void zl8(View view) {
        prov = 8;
        infInvent.setText(R.string.magikZl);

    }
    public void zl9(View view) {
        prov = 9;
        infInvent.setText(R.string.zahitaZl);
    }

    public void beakBoss(View view) {
        if (provBossIn==1){
            Intent intent = new Intent(this, BossActivity.class);
            intent.putExtra("Pzl1",Pzl1);
            intent.putExtra("Pzl2",Pzl2);
            intent.putExtra("Pzl3",Pzl3);
            intent.putExtra("Pzl4",Pzl4);
            intent.putExtra("Pzl5",Pzl5);
            intent.putExtra("Pzl6",Pzl6);
            intent.putExtra("Pzl7",Pzl7);
            intent.putExtra("Pzl8",Pzl8);
            intent.putExtra("Pzl9",Pzl9);
            intent.putExtra("x",x);
            intent.putExtra("powerText",powerText);
            intent.putExtra("hpText",hpText);
            intent.putExtra("zahitaText",zahitaText);
            intent.putExtra("magikText",magikText);
            intent.putExtra("kolvo",kolvo);
            intent.putExtra("powerBoss",powerBossS);
            intent.putExtra("hpBoss",hpBossS);
            intent.putExtra("zahitaBoss",zahitaBossS);
            startActivity(intent);
        }
    }
}