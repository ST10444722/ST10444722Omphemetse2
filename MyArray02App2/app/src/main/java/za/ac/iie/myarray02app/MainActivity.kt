package za.ac.iie.myarray02app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtResults: TextView
    private lateinit var edtNum: EditText
    private lateinit var btnPopulate: Button
    private lateinit var btnDisplay: Button
    private lateinit var btnSumEven: Button
    private lateinit var btnAvg: Button
    private lateinit var btnMult5: Button
    private lateinit var btnOdd: Button
    private lateinit var txtSum: TextView

    private var arrNum = arrayOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtResults = findViewById<TextView>(R.id.txtResults)
        edtNum = findViewById<EditText>(R.id.edtNum)
        btnPopulate = findViewById<Button>(R.id.btnPopulate)
        btnSumEven = findViewById<Button>(R.id.btnSumEven)
        btnAvg = findViewById<Button>(R.id.btnAvg)
        btnMult5 = findViewById<Button>(R.id.btnMult5)
        btnOdd = findViewById<Button>(R.id.btnOdd)
        txtSum = findViewById<TextView>(R.id.txtSum)
        btnDisplay = findViewById<Button>(R.id.btnDisplay)

        btnPopulate.setOnClickListener {                   //generates numbers
            getNum()
        }
        btnDisplay.setOnClickListener {                   //displaying numbers
            dispNum()
        }
        btnSumEven.setOnClickListener {                  //displays sum of all even numbers in array
            var sumEven = 0
            for (num in arrNum) {
                if (num % 2 == 0) {                     //Check if number is even
                    sumEven += num
                }
            }
            txtSum.text = "Sum: $sumEven"
        }
        btnAvg.setOnClickListener {                    //average of all numbers
            var totalSum = 0
            for (num in arrNum) {
                totalSum += num
            }
            val average = if (arrNum.isNotEmpty()) totalSum.toDouble() / arrNum.size else 0.0
            txtSum.text = "Average: $average"
        }
        btnMult5.setOnClickListener {                 //sum of numbers in array that are multiple of 5
            var sumMult5 = 0
            for (num in arrNum) {
                if (num % 5 == 0) {
                    sumMult5 += num
                }
            }
            txtSum.text = "Sum: $sumMult5"
        }
        btnOdd.setOnClickListener {                //average of all odd numbers in array
            var sumOdd = 0
            var countOdd = 0
            for (num in arrNum) {
                if (num % 2 != 0) {              //Check if number is odd
                    sumOdd += num
                    countOdd++
                }
            }
            val averageOdd = if (countOdd != 0) sumOdd.toDouble() / countOdd else 0.0
            txtSum.text = "Average: $averageOdd"
        }
    }

        private fun getNum() {
            arrNum = Array(10) { (1..10).random() }     //Correct range from 1 to 10

        }

        private fun dispNum() {
            txtResults.text = arrNum.joinToString("\n")
        }
    }








