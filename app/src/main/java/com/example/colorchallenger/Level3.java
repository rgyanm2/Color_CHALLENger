package com.example.colorchallenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Level3 extends AppCompatActivity {
    public int counter;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        textView = findViewById(R.id.textView25);
        new CountDownTimer(20000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(20 - counter));
                counter++;
            }
            public void onFinish() {
                startActivity(new Intent(Level3.this, GameOver.class));
            }
        }.start();
        String scr = String.valueOf(MainActivity.score);
        TextView score3 = findViewById(R.id.textView18);
        score3.setText(scr);
        ImageButton correctSquare = findViewById(R.id.imageButton16);
        correctSquare.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, Level4.class);
                startActivity(intent);
                MainActivity.score++;
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare1 = findViewById(R.id.imageButton9);
        wrongSquare1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare2 = findViewById(R.id.imageButton14);
        wrongSquare2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare3 = findViewById(R.id.imageButton15);
        wrongSquare3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare4 = findViewById(R.id.imageButton47);
        wrongSquare4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare5 = findViewById(R.id.imageButton48);
        wrongSquare5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare6 = findViewById(R.id.imageButton49);
        wrongSquare6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare7 = findViewById(R.id.imageButton50);
        wrongSquare7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare8 = findViewById(R.id.imageButton51);
        wrongSquare8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare9 = findViewById(R.id.imageButton52);
        wrongSquare9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare10 = findViewById(R.id.imageButton53);
        wrongSquare10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare11 = findViewById(R.id.imageButton54);
        wrongSquare11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare12 = findViewById(R.id.imageButton55);
        wrongSquare12.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare13 = findViewById(R.id.imageButton56);
        wrongSquare13.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare14 = findViewById(R.id.imageButton57);
        wrongSquare14.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare15 = findViewById(R.id.imageButton58);
        wrongSquare15.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();
            }
        }));
    }
}
