package za.ac.iie.mytamagotchiapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        initializeUI()
        setupActionBar()
    }

    private fun setupActionBar() {
        supportActionBar?.apply {
            title = "MainActivity5"
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)

        }
    }                                                                                               // Ensure there is a layout file named activity_main5.xml

    fun initializeUI() {
        val imageDisplay5 = findViewById<ImageView>(R.id.imageDisplay5)                              // The IIE,2024.IMAD5112MM
        val btnBackToMainAct2 = findViewById<Button>(R.id.btnBackToMainAct2)

        btnBackToMainAct2.setOnClickListener {
            finish()                                                                                  // Finish this activity and go back to the previous one

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {                                     // OpenAI.2024

        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}


