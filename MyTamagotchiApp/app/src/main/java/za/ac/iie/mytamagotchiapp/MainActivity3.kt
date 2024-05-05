package za.ac.iie.mytamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        initializeUI()
        setupActionBar()
    }

    private fun setupActionBar() {                                                                   //OpenAI.2024
        supportActionBar?.apply {
            title = "MainActivity3"
            setDisplayHomeAsUpEnabled(true)


        }
    }                                                                                               // Ensure there is a layout file named activity_main3.xml

    fun initializeUI() {
        val imageDisplay3 = findViewById<ImageView>(R.id.imageDisplay3)                              //The IIE,2024.IMAD5112MM
        val btnBackToMainAct2 = findViewById<Button>(R.id.btnBackToMainAct2)
        btnBackToMainAct2.setOnClickListener {
            finish()                                                                                 // Finish this activity and go back to the previous one
        }
}
    override fun onOptionsItemSelected(item: MenuItem): Boolean {                                   //OpenAI.2024
        // Handle presses on the action bar items
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}



