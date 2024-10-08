package com.example.livefit

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BMIactivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)
        val height = findViewById<EditText>(R.id.eTHeight)
        val weight = findViewById<EditText>(R.id.eTWeight)
        val btnCalc = findViewById<Button>(R.id.btnBMI)
        val resultText = findViewById<TextView>(R.id.tVResult)

        btnCalc.setOnClickListener {
            val h = height.text.toString().toFloat() / 100
            val w = weight.text.toString().toFloat()
            val res = w / (h * h)
            resultText.text = String.format("Your BMI = %.2f", res)
        }
    }
}