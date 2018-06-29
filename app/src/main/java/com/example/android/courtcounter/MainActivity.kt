package com.example.android.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    // TEAM A VARIABLES
    var scoreTeamA = 0;
    var faultTeamA = 0;

    // TEAM B VARIABLES
    var scoreTeamB = 0;
    var faultTeamB = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //// TEAM A

    fun displayScoreTeamA(score: Int) {
        scoreTeamA += score
        scoreViewTeamA.text = scoreTeamA.toString()
    }

    fun displayFaultTeamA(fault: Int) {
        faultTeamA += fault
        faultViewTeamA.text = faultTeamA.toString()
    }


    fun addScoreTeamA(view: View) {
        displayScoreTeamA(1)
    }

    fun addFaultTeamA(view: View) {
        displayFaultTeamA(1)
    }

    //// TEAM B

    fun displayScoreTeamB(score: Int) {
        scoreTeamB += score
        scoreViewTeamB.text = scoreTeamB.toString()
    }

    fun displayFaultTeamB(fault: Int) {
        faultTeamB += fault
        faultViewTeamB.text = faultTeamB.toString()
    }


    fun addScoreTeamB(view: View) {
        displayScoreTeamB(1)
    }

    fun addFaultTeamB(view: View) {
        displayFaultTeamB(1)
    }

    // RESET BUTTON

    fun reset(view: View) {
        scoreTeamA = 0;
        faultTeamA = 0;

        faultTeamB = 0;
        scoreTeamB = 0;

        displayScoreTeamA(scoreTeamA)
        displayFaultTeamA(faultTeamA)

        displayScoreTeamB(scoreTeamB)
        displayFaultTeamB(faultTeamB)
    }

}
