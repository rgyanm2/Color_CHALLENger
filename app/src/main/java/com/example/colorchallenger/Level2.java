package com.example.colorchallenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Level2 extends AppCompatActivity {
    public int counter;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        textView = findViewById(R.id.textView15);
        new CountDownTimer(20000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(20 - counter));
                counter++;
            }
            public void onFinish() {
                startActivity(new Intent(Level2.this, GameOver.class));
            }
        }.start();
        String scr = String.valueOf(MainActivity.score);
        TextView score2 = findViewById(R.id.textView10);
        score2.setText(scr);
        ImageButton correctSquare = findViewById(R.id.imageButton25);
        correctSquare.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, Level3.class);
                startActivity(intent);
                MainActivity.score++;
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare1 = findViewById(R.id.imageButton5);
        wrongSquare1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare2 = findViewById(R.id.imageButton21);
        wrongSquare2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare3 = findViewById(R.id.imageButton23);
        wrongSquare3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare4 = findViewById(R.id.imageButton6);
        wrongSquare4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare5 = findViewById(R.id.imageButton7);
        wrongSquare5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare6 = findViewById(R.id.imageButton8);
        wrongSquare6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare7 = findViewById(R.id.imageButton22);
        wrongSquare7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare8 = findViewById(R.id.imageButton24);
        wrongSquare8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level2.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));

    }
}
