package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String STATE_GOALTEAMA = "goalTeamA";
    static final String STATE_GOALTEAMB = "goalTeamB";
    static final String STATE_SHOTTEAMA = "shotTeamA";
    static final String STATE_SHOTTEAMB = "shotTeamB";
    static final String STATE_FOULTEAMA = "foulTeamA";
    static final String STATE_FOULTEAMB = "foulTeamB";
    static final String STATE_YELLOWTEAMA = "yellowTeamA";
    static final String STATE_YELLOWTEAMB = "yellowTeamB";
    static final String STATE_REDTEAMA = "redTeamA";
    static final String STATE_REDTEAMB = "redTeamB";

    int goalTeamA = 0;
    int goalTeamB = 0;
    int shotTeamA = 0;
    int shotTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;

    TextView GoalViewForTeamA;
    TextView GoalViewForTeamB;
    TextView ShotViewForTeamA;
    TextView ShotViewForTeamB;
    TextView FoulViewForTeamA;
    TextView FoulViewForTeamB;
    TextView YellowViewForTeamA;
    TextView YellowViewForTeamB;
    TextView RedViewForTeamA;
    TextView RedViewForTeamB;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GoalViewForTeamA = (TextView) findViewById(R.id.team_a_goals);
        GoalViewForTeamB = (TextView) findViewById(R.id.team_b_goals);
        ShotViewForTeamA = (TextView) findViewById(R.id.team_a_shots);
        ShotViewForTeamB = (TextView) findViewById(R.id.team_b_shots);
        FoulViewForTeamA = (TextView) findViewById(R.id.team_a_fouls);
        FoulViewForTeamB = (TextView) findViewById(R.id.team_b_fouls);
        YellowViewForTeamA = (TextView) findViewById(R.id.team_a_yellow);
        YellowViewForTeamB = (TextView) findViewById(R.id.team_b_yellow);
        RedViewForTeamA = (TextView) findViewById(R.id.team_a_red);
        RedViewForTeamB = (TextView) findViewById(R.id.team_b_red);

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_GOALTEAMA, goalTeamA);
        savedInstanceState.putInt(STATE_GOALTEAMB, goalTeamB);
        savedInstanceState.putInt(STATE_SHOTTEAMA, shotTeamA);
        savedInstanceState.putInt(STATE_SHOTTEAMB, shotTeamB);
        savedInstanceState.putInt(STATE_FOULTEAMA, foulTeamA);
        savedInstanceState.putInt(STATE_FOULTEAMB, foulTeamB);
        savedInstanceState.putInt(STATE_YELLOWTEAMA, yellowTeamA);
        savedInstanceState.putInt(STATE_YELLOWTEAMB, yellowTeamB);
        savedInstanceState.putInt(STATE_REDTEAMA, redTeamA);
        savedInstanceState.putInt(STATE_REDTEAMB, redTeamB);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        goalTeamA = savedInstanceState.getInt(STATE_GOALTEAMA);
        goalTeamB = savedInstanceState.getInt(STATE_GOALTEAMB);
        shotTeamA = savedInstanceState.getInt(STATE_SHOTTEAMA);
        shotTeamB = savedInstanceState.getInt(STATE_SHOTTEAMB);
        foulTeamA = savedInstanceState.getInt(STATE_FOULTEAMA);
        foulTeamB = savedInstanceState.getInt(STATE_FOULTEAMB);
        yellowTeamA = savedInstanceState.getInt(STATE_YELLOWTEAMA);
        yellowTeamB = savedInstanceState.getInt(STATE_YELLOWTEAMB);
        redTeamA = savedInstanceState.getInt(STATE_REDTEAMA);
        redTeamB = savedInstanceState.getInt(STATE_REDTEAMB);

        displayGoalsForTeamA(goalTeamA);
        displayGoalsForTeamB(goalTeamB);
        displayShotsForTeamA(shotTeamA);
        displayShotsForTeamB(shotTeamB);
        displayFoulsForTeamA(foulTeamA);
        displayFoulsForTeamB(foulTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);
    }

    /**

     * This method reference them

     */

    public void displayGoalsForTeamA(int goal) {

        GoalViewForTeamA.setText(String.valueOf(goal));

    }

    public void displayGoalsForTeamB(int goal) {

        GoalViewForTeamB.setText(String.valueOf(goal));

    }

    public void displayShotsForTeamA(int goal) {

        ShotViewForTeamA .setText(String.valueOf(goal));

    }

    public void displayShotsForTeamB(int goal) {

        ShotViewForTeamB .setText(String.valueOf(goal));

    }

    public void displayFoulsForTeamA(int goal) {

        FoulViewForTeamA .setText(String.valueOf(goal));

    }

    public void displayFoulsForTeamB(int goal) {

        FoulViewForTeamB .setText(String.valueOf(goal));

    }

    public void displayYellowForTeamA(int goal) {

        YellowViewForTeamA .setText(String.valueOf(goal));

    }

    public void displayYellowForTeamB(int goal) {

        YellowViewForTeamB .setText(String.valueOf(goal));

    }

    public void displayRedForTeamA(int goal) {

        RedViewForTeamA .setText(String.valueOf(goal));

    }

    public void displayRedForTeamB(int goal) {

        RedViewForTeamB .setText(String.valueOf(goal));

    }


    /**

     * This method is called when goal button Team A is clicked.

     */

    public void addGoalForTeamA(View v) {

        goalTeamA = goalTeamA + 1;

        displayGoalsForTeamA(goalTeamA);

    }
    /**

     * This method is called when the shot button Team A is clicked.

     */

    public void addShotForTeamA(View v) {

        shotTeamA = shotTeamA + 1;

        displayShotsForTeamA(shotTeamA);
    }

    /**

     * This method is called when the foul button Team A is clicked.

     */

    public void addFoulForTeamA(View v) {

        foulTeamA = foulTeamA + 1;

        displayFoulsForTeamA(foulTeamA);

    }

    /**

     * This method is called when the yellow cards button Team A is clicked.

     */

    public void addYellowForTeamA(View v) {

        yellowTeamA = yellowTeamA + 1;

        displayYellowForTeamA(yellowTeamA);

    }

    /**

     * This method is called when the red cards button Team A is clicked.

     */

    public void addRedForTeamA(View v) {

        redTeamA = redTeamA + 1;

        displayRedForTeamA(redTeamA);

    }



    /**

     * This method is called when goal button Team B is clicked.

     */

    public void addGoalForTeamB(View v) {

        goalTeamB = goalTeamB + 1;

        displayGoalsForTeamB(goalTeamB);

    }
    /**

     * This method is called when the shot button Team B is clicked.

     */

    public void addShotForTeamB(View v) {

        shotTeamB = shotTeamB + 1;

        displayShotsForTeamB(shotTeamB);
    }

    /**

     * This method is called when the foul button Team B is clicked.

     */

    public void addFoulForTeamB(View v) {

        foulTeamB = foulTeamB + 1;

        displayFoulsForTeamB(foulTeamB);

    }

    /**

     * This method is called when the yellow card button Team B is clicked.

     */

    public void addYellowForTeamB(View v) {

        yellowTeamB = yellowTeamB + 1;

        displayYellowForTeamB(yellowTeamB);

    }

    /**

     * This method is called when the red card button Team B is clicked.

     */

    public void addRedForTeamB(View v) {

        redTeamB = redTeamB + 1;

        displayRedForTeamB(redTeamB);

    }

    /**

     * This method is called when the Reset button is clicked.

     */

    public void reset(View v) {

        // reset all scores to 0

        goalTeamA = 0;
        goalTeamB = 0;
        shotTeamA = 0;
        shotTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;

        // display all scores after reset

        displayGoalsForTeamA(goalTeamA);
        displayGoalsForTeamB(goalTeamB);
        displayShotsForTeamA(shotTeamA);
        displayShotsForTeamB(shotTeamB);
        displayFoulsForTeamA(foulTeamA);
        displayFoulsForTeamB(foulTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);

    }
}
