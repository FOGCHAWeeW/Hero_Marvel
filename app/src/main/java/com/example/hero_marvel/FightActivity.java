package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FightActivity extends AppCompatActivity {

    private int x;
    private int randomNum;
    private Drawable fonFight;
    private Drawable heroImage;
    private ImageView heroFightImage;
    private ImageView bFightImage;
    private int flag = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        Intent intent = getIntent();
        x = intent.getIntExtra("x", 0);
        randomNum = intent.getIntExtra("randomNum", 0);
        heroFightImage = findViewById(R.id.heroFight);
        heroImage = heroFightImage.getDrawable();
        bFightImage = findViewById(R.id.bFight);
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
            bFightImage.setImageResource(R.drawable.b1);
        }
        if (randomNum == 2) {
            fonFight = getResources().getDrawable(R.drawable.l2);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b2);
        }
        if (randomNum == 3) {
            fonFight = getResources().getDrawable(R.drawable.l3);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b3);
        }
        if (randomNum == 4) {
            fonFight = getResources().getDrawable(R.drawable.l4);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b4);
        }
        if (randomNum == 5) {
            fonFight = getResources().getDrawable(R.drawable.l2);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b5);
        }
        if (randomNum == 6) {
            fonFight = getResources().getDrawable(R.drawable.l2);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b6);
        }
        if (randomNum == 7) {
            fonFight = getResources().getDrawable(R.drawable.l4);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b7);
        }
        if (randomNum == 8) {
            fonFight = getResources().getDrawable(R.drawable.l2);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b8);
        }
        if (randomNum == 9) {
            fonFight = getResources().getDrawable(R.drawable.l2);
            View rootView = getWindow().getDecorView().getRootView();
            rootView.setBackground(fonFight);
            bFightImage.setImageResource(R.drawable.b9);
        }

    }

    public void inventory(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        intent.putExtra("flag",flag);
        intent.putExtra("heroImage", (CharSequence) heroImage);
        startActivity(intent);
    }
}