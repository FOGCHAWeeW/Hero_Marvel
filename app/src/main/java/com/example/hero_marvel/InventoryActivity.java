package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
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
    private int randomNum;
    private int kolvo;
    private int powerText;
    private int hpText;
    private int zahitaText;
    private int magikText;
    private String weaponeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        beakFight = findViewById(R.id.beakFight);
        powerIn = findViewById(R.id.powerIn);
        hpIn = findViewById(R.id.hpIn);
        zahitaIn = findViewById(R.id.zahitaIn);
        weaponeIn = findViewById(R.id.weaponeIn);
        magikIn = findViewById(R.id.magikIn);
        kol_voVragIn = findViewById(R.id.kol_voVragIn);
        beakOne = findViewById(R.id.beakOne);
        ImageView imageView = findViewById(R.id.heroInventory);
        Intent intent = getIntent();
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
        weaponeIn.setText("Оружие:"+weaponeText);
        magikIn.setText("Магия:"+magikText);
        kol_voVragIn.setText("Кол-во поверженных врагов:"+kolvo+"/9");
        if (x == 1) {
            imageView.setImageResource(R.drawable.usa);
        }
        if (x == 2) {
            imageView.setImageResource(R.drawable.jelezo);
        }
        if (x == 3) {
            imageView.setImageResource(R.drawable.tor);
        }
        if (flag == 1){
            beakFight.setVisibility(View.INVISIBLE);
        }
        if (flag == 2){
            beakOne.setVisibility(View.INVISIBLE);
        }
    }

    public void beakFight(View view) {
        flag = 0;
        Intent intent = new Intent(this, FightActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("randomNum",randomNum);
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
        beakOne.setVisibility(View.VISIBLE);
    }

    public void beakOne(View view) {
        flag = 0;
        Intent intent = new Intent(this, TransferActivity.class);
        intent.putExtra("x",x);
        intent.putExtra("powerText",powerText);
        intent.putExtra("hpText",hpText);
        intent.putExtra("zahitaText",zahitaText);
        intent.putExtra("magikText",magikText);
        intent.putExtra("weaponeText",weaponeText);
        intent.putExtra("kolvo",kolvo);
        startActivity(intent);
        beakFight.setVisibility(View.VISIBLE);
    }
}