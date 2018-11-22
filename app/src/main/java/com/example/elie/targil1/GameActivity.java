package com.example.elie.targil1;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class GameActivity extends AppCompatActivity implements  MediaPlayer.OnCompletionListener{

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
    private GameBoard theGame;
    private MediaPlayer mediaPlayer;
    private int current_player;

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


        L_U.setEnabled(true);
        L_M.setEnabled(true);
        L_D.setEnabled(true);
        M_U.setEnabled(true);
        M_M.setEnabled(true);
        M_D.setEnabled(true);
        R_U.setEnabled(true);
        R_M.setEnabled(true);
        R_D.setEnabled(true);

        L_U.setText("");
        L_M.setText("");
        L_D.setText("");
        M_U.setText("");
        M_M.setText("");
        M_D.setText("");
        R_U.setText("");
        R_M.setText("");
        R_D.setText("");

        PlayAgain.setEnabled(false);

        theGame = new GameBoard();

        mediaPlayer = MediaPlayer.create(this, R.raw.applause);

        current_player = 1;

        Won.setText("X Turn");

        L_U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    L_U.setText("X");
                else
                    L_U.setText("O");
                clicked("L_U", current_player);
            }
        });

        L_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    L_M.setText("X");
                else
                    L_M.setText("O");
                clicked("L_M", current_player);
            }
        });

        L_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    L_D.setText("X");
                else
                    L_D.setText("O");
                clicked("L_D", current_player);
            }
        });

        M_U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    M_U.setText("X");
                else
                    M_U.setText("O");
                clicked("M_U", current_player);
            }
        });

        M_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    M_M.setText("X");
                else
                    M_M.setText("O");
                clicked("M_M", current_player);
            }
        });

        M_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    M_D.setText("X");
                else
                    M_D.setText("O");
                clicked("M_D", current_player);
            }
        });

        R_U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    R_U.setText("X");
                else
                    R_U.setText("O");
                clicked("R_U", current_player);
            }
        });

        R_M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    R_M.setText("X");
                else
                    R_M.setText("O");
                clicked("R_M", current_player);
            }
        });

        R_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_player == 1)
                    R_D.setText("X");
                else
                    R_D.setText("O");
                clicked("R_D", current_player);
            }
        });
    }


    private void clicked(String cell, int player){
        theGame.one_move(cell, player);
        Log.d("myTag", "in clicked");
        check_if_winner();
    }




    private void check_if_winner(){
        Log.d("myTag", "in check if winner");
        String results[] = theGame.Check_who_won();

        Log.d("myTag", "after check who won");

        String winner = results[0];
        String cell1 = results[1];
        String cell2 = results[2];
        String cell3 = results[3];


        Log.d("myTag", winner);
        Log.d("myTag", cell1);
        Log.d("myTag", cell2);
        Log.d("myTag", cell3);
        Toast.makeText(getApplicationContext(), "continue!", Toast.LENGTH_LONG).show();
        if (winner.equals("X_Won") || winner.equals("O_Won") || winner.equals("Draw")){
            Toast.makeText(getApplicationContext(), "Game Over!", Toast.LENGTH_LONG).show();
            if (winner.equals("X_Won")) {
                mediaPlayer.start();
                Won.setText("X won!");
            }
            else if (winner.equals("O_Won")){
                mediaPlayer.start();
                Won.setText("O won!");
            }
            else
                Won.setText("Draw - No Winner!!");

            L_U.setEnabled(false);
            L_M.setEnabled(false);
            L_D.setEnabled(false);
            M_U.setEnabled(false);
            M_M.setEnabled(false);
            M_D.setEnabled(false);
            R_U.setEnabled(false);
            R_M.setEnabled(false);
            R_D.setEnabled(false);


            if (cell1.equals("L_U") || cell2.equals("L_U") || cell3.equals("L_U"))
                L_U.setTextColor(Color.BLUE);
            if (cell1.equals("L_M") || cell2.equals("L_M") || cell3.equals("L_M"))
                L_M.setTextColor(Color.BLUE);
            if (cell1.equals("L_D") || cell2.equals("L_D") || cell3.equals("L_D"))
                L_D.setTextColor(Color.BLUE);
            if (cell1.equals("M_U") || cell2.equals("M_U") || cell3.equals("M_U"))
                M_U.setTextColor(Color.BLUE);
            if (cell1.equals("M_M") || cell2.equals("M_M") || cell3.equals("M_M"))
                M_M.setTextColor(Color.BLUE);
            if (cell1.equals("M_D") || cell2.equals("M_D") || cell3.equals("M_D"))
                M_D.setTextColor(Color.BLUE);
            if (cell1.equals("R_U") || cell2.equals("R_U") || cell3.equals("R_U"))
                R_U.setTextColor(Color.BLUE);
            if (cell1.equals("R_M") || cell2.equals("R_M") || cell3.equals("R_M"))
                R_M.setTextColor(Color.BLUE);
            if (cell1.equals("R_D") || cell2.equals("R_D") || cell3.equals("R_D"))
                R_D.setTextColor(Color.BLUE);

            PlayAgain.setEnabled(true);
        }
        else {
            switch_player();

            if (current_player == 1)
                Won.setText("X Turn");
            else
                Won.setText("O Turn");
        }
    }



    private void switch_player(){
        if (this.current_player == 1)
            current_player --;
        else
            current_player++;
    }



    @Override
    public void onCompletion(MediaPlayer mp)
    {
    }

}
