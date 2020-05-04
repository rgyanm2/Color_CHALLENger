package com.example.colorchallenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Level5 extends AppCompatActivity {
    public int counter;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        textView = findViewById(R.id.textView30);
        new CountDownTimer(20000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(20 - counter));
                counter++;
            }
            public void onFinish() {
                startActivity(new Intent(Level5.this, GameOver.class));
            }
        }.start();
        String scr = String.valueOf(MainActivity.score);
        TextView score5 = findViewById(R.id.textView20);
        score5.setText(scr);
        ImageButton correctSquare = findViewById(R.id.imageButton26);
        correctSquare.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                MainActivity.score++;
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare1 = findViewById(R.id.imageButton10);
        wrongSquare1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare2 = findViewById(R.id.imageButton11);
        wrongSquare2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare3 = findViewById(R.id.imageButton12);
        wrongSquare3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare4 = findViewById(R.id.imageButton13);
        wrongSquare4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare5 = findViewById(R.id.imageButton17);
        wrongSquare5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare6 = findViewById(R.id.imageButton18);
        wrongSquare6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare7 = findViewById(R.id.imageButton19);
        wrongSquare7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare8 = findViewById(R.id.imageButton29);
        wrongSquare8.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare9 = findViewById(R.id.imageButton28);
        wrongSquare9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare10 = findViewById(R.id.imageButton20);
        wrongSquare10.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare11 = findViewById(R.id.imageButton27);
        wrongSquare11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare12 = findViewById(R.id.imageButton32);
        wrongSquare12.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare13 = findViewById(R.id.imageButton36);
        wrongSquare13.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare14 = findViewById(R.id.imageButton41);
        wrongSquare14.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));ImageButton wrongSquare15 = findViewById(R.id.imageButton39);
        wrongSquare15.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare16 = findViewById(R.id.imageButton34);
        wrongSquare16.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare17 = findViewById(R.id.imageButton37);
        wrongSquare17.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare18 = findViewById(R.id.imageButton30);
        wrongSquare18.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare19 = findViewById(R.id.imageButton38);
        wrongSquare19.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare20 = findViewById(R.id.imageButton33);
        wrongSquare20.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare21 = findViewById(R.id.imageButton35);
        wrongSquare21.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare22 = findViewById(R.id.imageButton31);
        wrongSquare22.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare23 = findViewById(R.id.imageButton40);
        wrongSquare23.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare24 = findViewById(R.id.imageButton44);
        wrongSquare24.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare25 = findViewById(R.id.imageButton60);
        wrongSquare25.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare26 = findViewById(R.id.imageButton65);
        wrongSquare26.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare27 = findViewById(R.id.imageButton63);
        wrongSquare27.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare28 = findViewById(R.id.imageButton46);
        wrongSquare28.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare29 = findViewById(R.id.imageButton61);
        wrongSquare29.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare30 = findViewById(R.id.imageButton42);
        wrongSquare30.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare31 = findViewById(R.id.imageButton62);
        wrongSquare31.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare32 = findViewById(R.id.imageButton64);
        wrongSquare32.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare33 = findViewById(R.id.imageButton45);
        wrongSquare33.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare34 = findViewById(R.id.imageButton59);
        wrongSquare34.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare35 = findViewById(R.id.imageButton43);
        wrongSquare35.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level5.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
    }
}
