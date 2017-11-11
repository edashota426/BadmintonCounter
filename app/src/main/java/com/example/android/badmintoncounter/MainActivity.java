package com.example.android.badmintoncounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForA = 0;
    int scoreForB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreForA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showScoreForA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showScoreForB);
        scoreView.setText(String.valueOf(score));
    }

    public void addPointForA(View v) {
        scoreForA = scoreForA + 1;
        displayScoreForA(scoreForA);
    }

    public void addPointForB(View v) {
        scoreForB = scoreForB + 1;
        displayScoreForB(scoreForB);
    }

    public void reset(View v) {
        scoreForA = 0;
        scoreForB = 0;
        displayScoreForA(scoreForA);
        displayScoreForB(scoreForB);
    }


}
