package com.example.elie.targil1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Intent I_Instruction;
    Intent I_Game;
    Button StartPlay;
    Button Instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        I_Instruction = new Intent(MainActivity.this, InstructionsActivity.class);
        I_Game = new Intent(MainActivity.this, GameActivity.class);

        setContentView(R.layout.activity_main);

        StartPlay = findViewById(R.id.button);
        Instructions = findViewById(R.id.button2);

        StartPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(I_Game);
            }
        });

        Instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(I_Instruction);
            }
        });
    }
}
