package com.aydinaytac.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score&cards of Galatasaray.
    int scoreTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;

    // Tracks the score&cards of Team B.
    int scoreTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given cards for Team A.
     */
    public void displayCardsForTeamA(String cardsOfTeamA) {
        TextView cardView = (TextView) findViewById(R.id.team_a_cards);
        cardsOfTeamA = "Galatasaray has shown " + yellowCardsTeamA + " yellow cards and " + redCardsTeamA + " red cards.";
        cardView.setText(cardsOfTeamA);
    }

    /**
     * Adds a goal and displays score for Team A.
     */
    public void goalScoredTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Adds a yellow card and displays it for Team A.
     */
    public void yellowCardTeamA(View view) {
        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayCardsForTeamA(String.valueOf(yellowCardsTeamA));
    }

    /**
     * Adds a red card and displays it for Team A..
     */
    public void redCardTeamA(View view) {
        redCardsTeamA = redCardsTeamA + 1;
        displayCardsForTeamA(String.valueOf(redCardsTeamA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given cards for Team B.
     */
    public void displayCardsForTeamB(String cardsOfTeamB) {
        TextView cardView = (TextView) findViewById(R.id.team_b_cards);
        cardsOfTeamB = "Other Team has shown " + yellowCardsTeamB + " yellow cards and " + redCardsTeamB + " red cards.";
        cardView.setText(cardsOfTeamB);
    }

    /**
     * Adds a goal and displays score for Team B.
     */
    public void goalScoredTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Adds a yellow card and displays it for Team B.
     */
    public void yellowCardTeamB(View view) {
        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayCardsForTeamB(String.valueOf(yellowCardsTeamB));
    }

    /**
     * Adds a red card and displays it for Team B.
     */
    public void redCardTeamB(View view) {
        redCardsTeamB = redCardsTeamB + 1;
        displayCardsForTeamB(String.valueOf(redCardsTeamB));
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        yellowCardsTeamA = 0;
        redCardsTeamA = 0;
        scoreTeamB = 0;
        yellowCardsTeamB = 0;
        redCardsTeamB = 0;

        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);

        TextView cardViewTeamA = (TextView) findViewById(R.id.team_a_cards);
        String cardsOfTeamA = "Galatasaray has shown no cards yet!";
        cardViewTeamA.setText(cardsOfTeamA);

        TextView cardViewTeamB = (TextView) findViewById(R.id.team_b_cards);
        String cardsOfTeamB = "Other Team has shown no cards yet!";
        cardViewTeamB.setText(cardsOfTeamB);
    }
}
