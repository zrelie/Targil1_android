package com.example.elie.targil1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView Y_score;
    TextView X_score;
    TextView Draws;
    TextView Won;
    Button L_U;
    Button L_M;
    Button L_D;
    Button M_U;
    Button M_M;
    Button M_D;
    Button R_U;
    Button R_M;
    Button R_D;
    Button PlayAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Y_score= findViewById(R.id.TextView8);
        X_score= findViewById(R.id.TextView10);
        Draws= findViewById(R.id.TextView9);
        Won= findViewById(R.id.TextView6);
        L_U= findViewById(R.id.button19);
        L_M= findViewById(R.id.button22);
        L_D= findViewById(R.id.button25);
        M_U= findViewById(R.id.button18);
        M_M= findViewById(R.id.button21);
        M_D= findViewById(R.id.button24);
        R_U= findViewById(R.id.button17);
        R_M= findViewById(R.id.button20);
        R_D= findViewById(R.id.button23);
        PlayAgain= findViewById(R.id.button4);





    }
}
