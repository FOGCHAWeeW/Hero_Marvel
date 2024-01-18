package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InventoryActivity extends AppCompatActivity {
    private int x;
    private int flag;
    private Button beakFight;
    private Button beakOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        beakFight = findViewById(R.id.beakFight);
        beakOne = findViewById(R.id.beakOne);
        ImageView imageView = findViewById(R.id.heroInventory);
        Intent intent = getIntent();
        x = intent.getIntExtra("x", 0);
        flag = intent.getIntExtra("flag", 0);
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
        startActivity(intent);
        beakOne.setVisibility(View.VISIBLE);
    }

    public void beakOne(View view) {

        flag = 0;
        Intent intent = new Intent(this, TransferActivity.class);
        startActivity(intent);
        beakFight.setVisibility(View.VISIBLE);
    }
}