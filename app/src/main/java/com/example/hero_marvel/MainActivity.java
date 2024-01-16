package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private TextView power;
    private TextView zahita;
    private TextView weapone;
    public int powerUsa = 850;
    public int powerJelezo = 710;
    public int powerTor = 830;
    public int zahitaUsa = 710;
    public int zahitaJelezo = 910;
    public int zahitaTor = 830;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloText = findViewById(R.id.helloText);
        power = findViewById(R.id.power);
        zahita = findViewById(R.id.zahita);
        weapone = findViewById(R.id.weapone);

    }
    public void usa(View view) {
        helloText.setText(R.string.usa);
        power.setText("Сила:850/1000");
        zahita.setText("Защита:710/1000");
        weapone.setText("Оружие:Щит");
    }
    public void jelezo(View view) {
        helloText.setText(R.string.jelezo);
        power.setText("Сила:710/1000");
        zahita.setText("Защита:910/1000");
        weapone.setText("Оружие:Суперкостюм");
    }
    public void tor(View view) {
        helloText.setText(R.string.tor);
        power.setText("Сила:830/1000");
        zahita.setText("Защита:830/1000");
        weapone.setText("Оружие:Мьёльнир");
    }
    public void start(View view) {
        Intent intent = new Intent(this, TransferActivity.class);
        startActivity(intent);
    }
}