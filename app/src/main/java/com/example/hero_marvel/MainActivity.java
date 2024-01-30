package com.example.hero_marvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private TextView power;
    private TextView zahita;
    private TextView weapone;
    private TextView magik;
    private int powerText;
    private int zahitaText;
    private int magikText;
    private String weaponeText;
    private int x;
    private int kolvo=0;



    private MusicService musicService;
    private boolean isBound = false;

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName className, IBinder service) {
            MusicService.LocalBinder binder = (MusicService.LocalBinder) service;
            musicService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName arg0) {
            isBound = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        helloText = findViewById(R.id.helloText);
        power = findViewById(R.id.power);
        zahita = findViewById(R.id.zahita);
        weapone = findViewById(R.id.weapone);
        magik = findViewById(R.id.magik);
        Intent intent = new Intent(this, MusicService.class);
        startService(intent);

        // Привязка к службе
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isBound) {
            unbindService(serviceConnection);
            isBound = false;
        }
    }
    public void usa(View view) {
        x=1;
        helloText.setText(R.string.usa);
        power.setText("Сила:200");
        zahita.setText("Защита:100");
        magik.setText("Магия:50");
        weapone.setText("Оружие:Щит");

    }
    public void jelezo(View view) {
        x=2;
        helloText.setText(R.string.jelezo);
        power.setText("Сила:100");
        zahita.setText("Защита:200");
        magik.setText("Магия:50");
        weapone.setText("Оружие:Суперкостюм");
    }
    public void tor(View view) {
        x=3;
        helloText.setText(R.string.tor);
        power.setText("Сила:150");
        zahita.setText("Защита:150");
        magik.setText("Магия:60");
        weapone.setText("Оружие:Мьёльнир");
    }
    public void start(View view) {
        Intent intent = new Intent(this, TransferActivity.class);
        if (x == 1) {
            intent.putExtra("powerText",200);
            intent.putExtra("hpText",500);
            intent.putExtra("zahitaText",100);
            intent.putExtra("magikText",50);
            intent.putExtra("weaponeText","Щит");
            intent.putExtra("kolvo",0);
            intent.putExtra("x",1);
            startActivity(intent);

        }
        if (x == 2) {
            intent.putExtra("powerText",100);
            intent.putExtra("hpText",500);
            intent.putExtra("zahitaText",200);
            intent.putExtra("magikText",50);
            intent.putExtra("weaponeText","Суперкостюм");
            intent.putExtra("kolvo",0);
            intent.putExtra("x",2);
            startActivity(intent);
        }
        if (x == 3) {
            intent.putExtra("powerText",150);
            intent.putExtra("hpText",500);
            intent.putExtra("zahitaText",150);
            intent.putExtra("magikText",60);
            intent.putExtra("weaponeText","Мьёльнир");
            intent.putExtra("kolvo",0);
            intent.putExtra("x",3);
            startActivity(intent);
        }

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }
}