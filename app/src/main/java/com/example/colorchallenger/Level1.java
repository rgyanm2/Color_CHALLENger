package com.example.colorchallenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Level1 extends AppCompatActivity {
    public int counter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        Button levelTwo = findViewById(R.id.button4);
        levelTwo.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Level1.this, Level2.class));
            }
        }));
        textView = findViewById(R.id.textView5);
        new CountDownTimer(20000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(20 - counter));
                counter++;
            }
            public void onFinish() {
                textView.setText("0");
            }
        }.start();
    }
}
