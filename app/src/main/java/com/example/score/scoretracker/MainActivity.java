package com.example.score.scoretracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeToA(View view)
    {
        scoreA+=3;
        displayScoreA(scoreA);
    }

    public void addTwoToA(View view)
    {
        scoreA+=2;
        displayScoreA(scoreA);
    }

    public void addOneToA(View view)
    {
        scoreA+=1;
        displayScoreA(scoreA);
    }

    public void addThreeToB(View view)
    {
        scoreB+=3;
        displayScoreB(scoreB);
    }

    public void addTwoToB(View view)
    {
        scoreB+=2;
        displayScoreB(scoreB);
    }

    public void addOneToB(View view)
    {
        scoreB+=1;
        displayScoreB(scoreB);
    }

    private void displayScoreA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        quantityTextView.setText("" + number);
    }

    private void displayScoreB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        quantityTextView.setText("" + number);
    }

    public void Reset(View view)
    {
        scoreA=scoreB=0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }
}
