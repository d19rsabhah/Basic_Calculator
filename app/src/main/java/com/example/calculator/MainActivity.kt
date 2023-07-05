package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener {
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()

            tVResult.text = (input1 + input2).toString()
        }
        btnMinus.setOnClickListener{
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()
            tVResult.text = (input1 - input2).toString()

        }
        btnDivide.setOnClickListener{
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()
            tVResult.text = (input1 / input2).toString()
        }

        btnMult.setOnClickListener{
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()
            tVResult.text = (input1 * input2).toString()
        }
        btnMod.setOnClickListener{
            val inp1 = eTInput1.text.toString().toInt()
            val inp2 = eTInput2.text.toString().toInt()
            tVResult.text = (inp1 % inp2).toString()
        }
        btnSquare.setOnClickListener{
            val inp1 = eTInput1.text.toString().toInt()
            val inp2 = eTInput2.text.toString().toInt()
            var n1 = inp1;
            var n2 = inp1;
            while (n2 > 0)
            {
                n1 *= inp2;
                n2--;
            }
            tVResult.text = (n1).toString()
        }

    }
}