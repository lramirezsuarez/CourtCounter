package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int iPointsA = 0, iPointsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void update3PointsA(View view) {
        iPointsA = iPointsA + 3;
        displayForTeamA(iPointsA);
    }

    public void update2PointsA(View view) {
        iPointsA = iPointsA + 2;
        displayForTeamA(iPointsA);
    }

    public void update1PointA(View view) {
        iPointsA = iPointsA + 1;
        displayForTeamA(iPointsA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.txtPointsA);
        scoreView.setText(String.valueOf(score));
    }

    public void update3PointsB(View view) {
        iPointsB = iPointsB + 3;
        displayForTeamB(iPointsB);
    }

    public void update2PointsB(View view) {
        iPointsB = iPointsB + 2;
        displayForTeamB(iPointsB);
    }

    public void update1PointB(View view) {
        iPointsB = iPointsB + 1;
        displayForTeamB(iPointsB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.txtPointsB);
        scoreView.setText(String.valueOf(score));
    }

    public void reset (View view){
        iPointsA=0;
        iPointsB=0;
        displayForTeamA(iPointsA);
        displayForTeamB(iPointsB);
    }
}
