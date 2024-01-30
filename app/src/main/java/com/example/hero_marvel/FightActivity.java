package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FightActivity extends AppCompatActivity {
    private TextView infFight;
    private TextView infAtak;
    private Button choiceButton;
    private Button inventoryFight;
    private Button next;
    private int Pzl1;
    private int Pzl2;
    private int Pzl3;
    private int Pzl4;
    private int Pzl5;
    private int Pzl6;
    private int Pzl7;
    private int Pzl8;
    private int Pzl9;
    private int x;
    private int randomNum;
    private Drawable fonFight;
    private Drawable heroImage;
    private ImageView heroFightImage;
    private ImageView bFightImage;
    private int flag = 2;
    private int kolvo;
    private int powerText;
    private int hpText;
    private int zahitaText;
    private int magikText;
    private String weaponeText;
    private int chInFight;
    private int proverkaInvent;

    private  int hpVrag;//переместить ..........................................
    private int powerVrag;//переместить ..........................................
    private int zahitaVrag;//переместить ..........................................
    private TextView hpHeroText;
    private TextView powerHeroText;
    private TextView zahitaHeroText;
    private TextView hpVragText;
    private TextView powerVragText;
    private TextView zahitaVragText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        heroFightImage = findViewById(R.id.heroFight);
        bFightImage = findViewById(R.id.bFight);
        infFight = findViewById(R.id.infFight);
        next = findViewById(R.id.next);
        choiceButton = findViewById(R.id.choiceButton);
        inventoryFight = findViewById(R.id.inventoryFight);
        infAtak = findViewById(R.id.infAtak);
        heroImage = heroFightImage.getDrawable();

        Intent intent = getIntent();
        x = intent.getIntExtra("x", 0);
        randomNum = intent.getIntExtra("randomNum", 0);
        proverkaInvent = intent.getIntExtra("proverkaInvent",0);
        powerText = intent.getIntExtra("powerText",0);
        zahitaText = intent.getIntExtra("zahitaText",0);
        magikText = intent.getIntExtra("magikText",0);
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
        kolvo = intent.getIntExtra("kolvo",0);
        hpHeroText = findViewById(R.id.hpHeroText);
        powerHeroText = findViewById(R.id.powerHeroText);
        zahitaHeroText = findViewById(R.id.zahitaHeroText);
        hpVragText =findViewById(R.id.hpVragText);
        powerVragText =findViewById(R.id.powerVragText);
        zahitaVragText =findViewById(R.id.zahitaVragText);
        weaponeText = intent.getStringExtra("weaponeText");
        chInFight = intent.getIntExtra("chInFight", 0);
        hpVrag = intent.getIntExtra("hpVrag",0);
        powerVrag = intent.getIntExtra("powerVrag",0);
        zahitaVrag = intent.getIntExtra("zahitaVrag",0);
        if (chInFight !=1){
            next.setVisibility(View.INVISIBLE);
            infAtak.setText("У тебя "+hpText+"hp, у врага "+hpVrag+"hp!");
        }
        if(chInFight == 1){
            hpVrag-=(powerText+magikText);
            hpText-=(powerVrag);
            powerText-=zahitaVrag;
            if (magikText<0){
                magikText=0;
            }
            if (powerText<0){
                powerText=0;
            }
            if (hpVrag>0){
                if (powerVrag<30){
                    powerVrag+=10;
                }
                if (powerText<50){
                    powerText+=30;
                }
                next.setVisibility(View.INVISIBLE);
                choiceButton.setVisibility(View.VISIBLE);
                inventoryFight.setVisibility(View.VISIBLE);
                infFight.setText("Ты атаковал и враг тоже, атакуй ещё раз!");
                infAtak.setText("!Ты нанёс врагу:"+((powerText+magikText)-zahitaVrag)+"hp, а он тебе "+powerVrag+"hp,у тебя "+hpText+"hp, у врага "+hpVrag+"hp!");
                hpHeroText.setText("hp:"+hpText);
                powerHeroText.setText("Урон:"+powerText);
                zahitaHeroText.setText("Защита"+zahitaText);
                hpVragText.setText("hp:"+hpVrag);
                powerVragText.setText("Урон:"+powerVrag);
                zahitaVragText.setText("Защита"+zahitaVrag);
            }
            if (hpVrag<=0){
                next.setVisibility(View.VISIBLE);
                kolvo++;
                infFight.setText("!!!ТЫ ПОБЕДИЛ ЭТОГО ЗЛОДЕЯ, ПОШЛИ ДАЛЬШЕ СПАСАТЬ МИР!!!" +
                        "!!!ТАКЖЕ ПРОВЕРЬ ИНВЕНТАРЬ!!!)))");
                choiceButton.setVisibility(View.INVISIBLE);
                inventoryFight.setVisibility(View.INVISIBLE);
                infAtak.setText("Кажется от в отключке");
                hpHeroText.setText("hp:"+hpText);
                powerHeroText.setText("Урон:"+powerText);
                zahitaHeroText.setText("Защита"+zahitaText);
                hpVragText.setText("hp:0");
                powerVragText.setText("Урон:"+powerVrag);
                zahitaVragText.setText("Защита"+zahitaVrag);
            }
            if (hpText<=0){
                    Intent intent2 = new Intent(this, LossActivity.class);
                    startActivity(intent2);
            }
        }else {
            hpHeroText.setText("hp:" + hpText);
            powerHeroText.setText("Урон:" + powerText);
            zahitaHeroText.setText("Защита" + zahitaText);
            hpVragText.setText("hp:" + hpVrag);
            powerVragText.setText("Урон:" + powerVrag);
            zahitaVragText.setText("Защита" + zahitaVrag);
        }



        if (x == 1) {
            heroFightImage.setImageResource(R.drawable.usa);
        }
        if (x == 2) {
            heroFightImage.setImageResource(R.drawable.jelezo);
        }
        if (x == 3) {
            heroFightImage.setImageResource(R.drawable.tor);
        }
        if (randomNum == 1) {
            fonFight = getResources().getDrawable(R.drawable.l1);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b8);
        }
        if (randomNum == 2) {
            fonFight = getResources().getDrawable(R.drawable.l2);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b6);
        }
        if (randomNum == 3) {
            fonFight = getResources().getDrawable(R.drawable.l3);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b2);
        }
        if (randomNum == 4) {
            fonFight = getResources().getDrawable(R.drawable.l4);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b4);
        }
        if (randomNum == 5) {
            fonFight = getResources().getDrawable(R.drawable.l5);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b10);
        }
        if (randomNum == 6) {
            fonFight = getResources().getDrawable(R.drawable.l6);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b5);
        }
        if (randomNum == 7) {
            fonFight = getResources().getDrawable(R.drawable.l7);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b7);
        }
        if (randomNum == 8) {
            fonFight = getResources().getDrawable(R.drawable.l8);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b1);
        }
        if (randomNum == 9) {
            fonFight = getResources().getDrawable(R.drawable.l9);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b9);
        }


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }

    public void inventory(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        intent.putExtra("flag",flag);
        intent.putExtra("x",x);
        intent.putExtra("randomNum",randomNum);
        intent.putExtra("powerText",powerText);
        intent.putExtra("proverkaInvent",proverkaInvent);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("weaponeText",weaponeText);
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

    public void choice(View view) {
        chInFight = 0;
        Intent intent = new Intent(this, ChoiceActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("chInFight",0);
        intent.putExtra("randomNum",randomNum);
        intent.putExtra("powerText",powerText);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("proverkaInvent",proverkaInvent);
        intent.putExtra("weaponeText",weaponeText);
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

    public void next(View view) {
        chInFight = 0;
        Intent intent = new Intent(this, TransferActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("chInFight",0);
        intent.putExtra("randomNum",randomNum);
        intent.putExtra("powerText",powerText);
        intent.putExtra("proverkaInvent",proverkaInvent);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("weaponeText",weaponeText);
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