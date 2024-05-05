package za.ac.iie.mytamagotchiapp

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initializeUI()
        setupActionBar()
    }

    private fun setupActionBar() {
        supportActionBar?.apply {
            title = "MainActivity2"
            setDisplayHomeAsUpEnabled(true)

        }
    }                                                                                               // Ensure there is a layout file named activity_main2.xml

    private fun initializeUI() {
        val imageDisplay2 = findViewById<ImageView>(R.id.imageDisplay2)                              //The IIE,2024. IMAD5112MM
        val btnMainActivity3 = findViewById<Button>(R.id.btnMainActivity3)
        val btnMainActivity4 = findViewById<Button>(R.id.btnMainActivity4)
        val btnMainActivity5 = findViewById<Button>(R.id.btnMainActivity5)
        val txtDisplay = findViewById<TextView>(R.id.txtDisplay)
        val txtDisplay2 = findViewById<TextView>(R.id.txtDisplay2)
        val txtDisplay3 = findViewById<TextView>(R.id.txtDisplay3)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val progressBar2 = findViewById<ProgressBar>(R.id.progressBar2)
        val progressBar4 = findViewById<ProgressBar>(R.id.progressBar4)

                                                                                                     // Set max progress for all progress bars
        progressBar.max = 1000
        progressBar2.max = 1000
        progressBar4.max = 1000

        btnMainActivity3.setOnClickListener {                                                        //https://youtu.be/xU-Cc41DfTg?si=veAzKL1sSW41VZIv
            navigateToActivity(MainActivity3::class.java)
            animateProgressBar(progressBar, 1000)
        }

        btnMainActivity4.setOnClickListener {
            navigateToActivity(MainActivity4::class.java)
            animateProgressBar(progressBar2, 1000)
        }

        btnMainActivity5.setOnClickListener {
            navigateToActivity(MainActivity5::class.java)
            animateProgressBar(progressBar4, 1000)
        }
    }

    private fun animateProgressBar(progressBar: ProgressBar, progress: Int) {
        ObjectAnimator.ofInt(progressBar, "progress", progress)
            .setDuration(2000)
            .start()
    }

    private fun navigateToActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {                                    // OpenAI.2024
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
















