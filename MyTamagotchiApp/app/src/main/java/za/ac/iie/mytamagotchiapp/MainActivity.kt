package za.ac.iie.mytamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        val btnMainActivity2 = findViewById<Button>(R.id.btnMainActivity2)                           //The IIE,2024. IMAD5112MM
        btnMainActivity2.setOnClickListener {                                                        // Set a click listener to navigate to MainActivity2 when button is clicked
            navigateToMainActivity2()
        }
    }

    private fun navigateToMainActivity2() {

                                                                                                      // Create an intent to start MainActivity2
    val intent = Intent(this, MainActivity2::class.java)                                 // https://youtu.be/4bEZ2PlIo8g?si=hRblRNBjKS9fzzeB
    startActivity(intent)

     }
}



