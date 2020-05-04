package com.example.colorchallenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        String scr = String.valueOf(MainActivity.score);
        TextView finalScore2 = findViewById(R.id.textView33);
        finalScore2.setText(scr);
        Button playAgain = findViewById(R.id.button5);
        playAgain.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.score = 0;
                startActivity(new Intent(GameOver.this, MainActivity.class));
            }
        }));
    }
}
