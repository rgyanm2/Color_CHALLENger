package com.example.colorchallenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Level4 extends AppCompatActivity {
    public int counter;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        textView = findViewById(R.id.textView31);
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(20 - counter));
                counter++;
            }
            public void onFinish() {
                startActivity(new Intent(Level4.this, GameOver.class));
            }
        }.start();
        String scr = String.valueOf(MainActivity.score);
        TextView score4 = findViewById(R.id.textView22);
        score4.setText(scr);
        ImageButton correctSquare = findViewById(R.id.imageButton10);
        correctSquare.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, Level5.class);
                startActivity(intent);
                MainActivity.score++;
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare1 = findViewById(R.id.imageButton41);
        wrongSquare1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare2 = findViewById(R.id.imageButton28);
        wrongSquare2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare3 = findViewById(R.id.imageButton31);
        wrongSquare3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare4 = findViewById(R.id.imageButton30);
        wrongSquare4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare5 = findViewById(R.id.imageButton14);
        wrongSquare5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare6 = findViewById(R.id.imageButton15);
        wrongSquare6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare7 = findViewById(R.id.imageButton13);
        wrongSquare7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare8 = findViewById(R.id.imageButton29);
        wrongSquare8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare9 = findViewById(R.id.imageButton32);
        wrongSquare9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare10 = findViewById(R.id.imageButton27);
        wrongSquare10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare11 = findViewById(R.id.imageButton40);
        wrongSquare11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare12 = findViewById(R.id.imageButton39);
        wrongSquare12.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare13 = findViewById(R.id.imageButton34);
        wrongSquare13.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare14 = findViewById(R.id.imageButton16);
        wrongSquare14.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));ImageButton wrongSquare15 = findViewById(R.id.imageButton42);
        wrongSquare15.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare16 = findViewById(R.id.imageButton12);
        wrongSquare16.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare17 = findViewById(R.id.imageButton26);
        wrongSquare17.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare18 = findViewById(R.id.imageButton33);
        wrongSquare18.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare19 = findViewById(R.id.imageButton37);
        wrongSquare19.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare20 = findViewById(R.id.imageButton35);
        wrongSquare20.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare21 = findViewById(R.id.imageButton11);
        wrongSquare21.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare22 = findViewById(R.id.imageButton38);
        wrongSquare22.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare23 = findViewById(R.id.imageButton36);
        wrongSquare23.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare24 = findViewById(R.id.imageButton9);
        wrongSquare24.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level4.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
    }
}
