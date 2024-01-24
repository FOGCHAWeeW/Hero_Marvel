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

    private  int hpVrag;//переместить ..........................................
    private int powerVrag;//переместить ..........................................
    private int zahitaVrag;//переместить ..........................................
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
        powerText = intent.getIntExtra("powerText",0);
        zahitaText = intent.getIntExtra("zahitaText",0);
        magikText = intent.getIntExtra("magikText",0);
        hpText = intent.getIntExtra("hpText",0);
        kolvo = intent.getIntExtra("kolvo",0);
        weaponeText = intent.getStringExtra("weaponeText");
        chInFight = intent.getIntExtra("chInFight", 0);
        hpVrag = intent.getIntExtra("hpVrag",0);
        powerVrag = intent.getIntExtra("powerVrag",0);
        zahitaVrag = intent.getIntExtra("zahitaVrag",0);


        if (chInFight !=1){
            next.setVisibility(View.INVISIBLE);
        }
        if(chInFight == 1){
            if (hpVrag>0){
                next.setVisibility(View.INVISIBLE);
                choiceButton.setVisibility(View.VISIBLE);
                inventoryFight.setVisibility(View.VISIBLE);
                infFight.setText("Ты атаковал и враг тоже, атакуй ещё раз!");
                infAtak.setText("!Ты нанёс врагу:"+powerText+"hp, а он тебе "+powerVrag+"hp,у тебя "+hpText+"hp, у врага "+hpVrag+"hp!");
            }
            if (hpVrag<=0){
                next.setVisibility(View.VISIBLE);
                infFight.setText("!!!ТЫ ПОБЕДИЛ ЭТОГО ЗЛОДЕЯ, ПОШЛИ ДАЛЬШЕ СПАСАТЬ МИР!!!");
                choiceButton.setVisibility(View.INVISIBLE);
                inventoryFight.setVisibility(View.INVISIBLE);
                //hpVrag=0;
                infAtak.setText("!Ты нанёс врагу:"+powerText+"hp, а он тебе "+powerVrag+"hp,у тебя "+hpText+"hp, у врага 0hp!");
            }
            if (hpText<=0){
                    Intent intent2 = new Intent(this, LossActivity.class);
                    startActivity(intent2);
            }
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

    public void inventory(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        intent.putExtra("flag",flag);
        intent.putExtra("x",x);
        intent.putExtra("randomNum",randomNum);
        intent.putExtra("powerText",powerText);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("weaponeText",weaponeText);
        intent.putExtra("kolvo",kolvo);
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
        intent.putExtra("weaponeText",weaponeText);
        intent.putExtra("kolvo",kolvo);
        intent.putExtra("hpVrag",hpVrag);
        intent.putExtra("powerVrag",powerVrag);
        intent.putExtra("zahitaVrag",zahitaVrag);
        startActivity(intent);
    }

    public void next(View view) {
        chInFight = 0;
        Intent intent = new Intent(this, TransferActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("chInFight",0);
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
}