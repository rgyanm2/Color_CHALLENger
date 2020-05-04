package com.example.colorchallenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.logging.Level;


public class Level1 extends AppCompatActivity {
    public int counter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        textView = findViewById(R.id.textView5);
        new CountDownTimer(20000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(20 - counter));
                counter++;
            }
            public void onFinish() {
                textView.setText("0");
                startActivity(new Intent(Level1.this, GameOver.class));
            }
        }.start();
        String scr = String.valueOf(MainActivity.score);
        TextView score1 = findViewById(R.id.textView14);
        score1.setText(scr);
        ImageButton correctSquare = findViewById(R.id.imageButton3);
        correctSquare.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, Level2.class);
                startActivity(intent);
                MainActivity.score++;
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();
            }
        }));
        ImageButton wrongSquare1 = findViewById(R.id.imageButton);
        wrongSquare1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare2 = findViewById(R.id.imageButton2);
        wrongSquare2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
        ImageButton wrongSquare3 = findViewById(R.id.imageButton4);
        wrongSquare3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, GameOver.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in_fade, R.anim.out_fade);
                finish();

            }
        }));
    }
}
