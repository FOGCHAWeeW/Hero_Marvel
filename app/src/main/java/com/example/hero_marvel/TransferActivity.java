package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TransferActivity extends AppCompatActivity {
    private TextView power;
    private TextView zahita;
    private TextView weapone;
    private TextView magik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);


    }

    public void go(View view) {
        Intent intent = new Intent(this, FightActivity.class);
        startActivity(intent);
    }

    public void inventory(View view) {
        Intent intent = new Intent(this, InventoryActivity.class);
        startActivity(intent);
    }
}