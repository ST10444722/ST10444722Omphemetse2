package za.ac.iie.mytamagotchiapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        initializeUI()
        setupActionBar()
    }

    private fun setupActionBar() {
        supportActionBar?.apply {
            title = "MainActivity4"
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)

        }
    }                                                                                               // Ensure there is a layout file named activity_main4.xml

    fun initializeUI() {
        val imageDisplay4 = findViewById<ImageView>(R.id.imageDisplay4)                              // The IIE,2024.IMAD5112MM
        val btnBackToMainAct2 = findViewById<Button>(R.id.btnBackToMainAct2)

        btnBackToMainAct2.setOnClickListener {
            finish()                                                                                   // Finish this activity and go back to the previous one

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {                                    // OpenAI.2024
        // Handle presses on the action bar items
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed() // This will handle the back action
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

