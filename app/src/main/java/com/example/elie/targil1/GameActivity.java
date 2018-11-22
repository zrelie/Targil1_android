package com.example.elie.targil1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView Y_score;
    private TextView X_score;
    private TextView Draws;
    private TextView Won;
    private Button L_U;
    private Button L_M;
    private Button L_D;
    private Button M_U;
    private Button M_M;
    private Button M_D;
    private Button R_U;
    private Button R_M;
    private  Button R_D;
    private Button PlayAgain;

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
