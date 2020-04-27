package com.example.colorchallenger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

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
            }
        }.start();

    }
}
