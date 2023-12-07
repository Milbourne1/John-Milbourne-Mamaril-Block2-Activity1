package com.mamaril.john.milbourne.block2.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber: EditText = findViewById(R.id.insrt_First)
        val secondNumber: EditText = findViewById(R.id.insrt_Second)
        val thirdNumber: EditText = findViewById(R.id.insrt_Third)
        val fourthNumber: EditText = findViewById(R.id.insrt_Fourth)
        val btnAdd: Button = findViewById(R.id.btn_Add)
        val btnSubtract: Button = findViewById(R.id.btn_Subtract)
        val btnMultiply: Button = findViewById(R.id.btn_Multiply)
        val btnDivide: Button = findViewById(R.id.btn_Divide)
        val txtNumber: TextView = findViewById(R.id.txt_Number)

        txtNumber.text = ("Hello g").toString()

        btnAdd.setOnClickListener {
            txtNumber.text = (firstNumber.text.toString().toInt()+secondNumber.text.toString().toInt()+thirdNumber.text.toString
                ().toInt()+fourthNumber.text.toString().toInt()).toString()
        }



    }
}