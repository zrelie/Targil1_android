package com.example.elie.targil1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionsActivity extends AppCompatActivity {

    private Intent I_Game;
    private Button StartPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        I_Game = new Intent(InstructionsActivity.this, GameActivity.class);

        setContentView(R.layout.activity_instructions);

        StartPlay = findViewById(R.id.button5);
        StartPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(I_Game);
            }
        });
    }
}
