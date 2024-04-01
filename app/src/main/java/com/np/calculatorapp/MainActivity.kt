package com.np.calculatorapp

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.np.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener(this)
        binding.btnSub.setOnClickListener(this)
        binding.btnMultiply.setOnClickListener(this)
        binding.btnDivision.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val a = binding.inputA.text.toString().toDouble()
        val b = binding.inputB.text.toString().toDouble()
        var result=0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_sub ->{
                result = a-b
            }
            R.id.btn_multiply ->{
                result = a*b
            } R.id.btn_division ->{
                result = a/b
            }
        }
        binding.resultTv.text = "Result is $result"
    }

}