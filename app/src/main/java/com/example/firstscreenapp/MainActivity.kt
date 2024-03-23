package com.example.firstscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.np.bimalkafle.R
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() , View.OnClickListener, R {
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMultiply : Button
    lateinit var btnDivision : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById<Button>(R.id.btn_add)
        btnSub = findViewById<Button>(R.id.btn_subtraction)
        btnMultiply = findViewById<Button>(R.id.btn_multiplication)
        btnDivision = findViewById<Button>(R.id.btn_division)
        etA = findViewById<EditText>(R.id.et_a)
        etB = findViewById<EditText>(R.id.et_b)
        resultTv = findViewById<EditText>(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val a = etA.text.toString().toDouble()
        val b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id) {
            R.id.btn_add -> {
                result = a+b
            }

            R.id.btn_subtraction -> {
                result = a-b
            }

            R.id.btn_multiplication -> {
                result = a*b
            }
            R.id.btn_division -> {
                result = a/b
            }
        }
        val also = ("Result is " + result).also { resultTv.text = it }
    }
}

