package za.ac.iie.footballdatabaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //teams from https://footballdatabase.com/ranking/south-africa/1
    //retrieved on 21 May 2022
    val teams = arrayOf<String>("Mamelodi Sundowns FC" ,
        "Bidvest Wits" ,
        "Orlando Pirates" ,
        "Kaizer Chiefs" ,
        "Cape Town City FC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the teams teams text view
        val teamsTextView = findViewById<TextView>(R.id.teamsTextView)
        // set the text view's text to the first team
        teams TextView.text = teams[0]
    }
}