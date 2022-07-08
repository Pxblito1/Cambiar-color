package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import com.example.signup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnregister.setOnClickListener {
            val   myintent=Intent(this, Datos::class.java)
            startActivity(myintent)
        }
        fun onRadioButtonClicked(view: View) {
            if (view is RadioButton) {
                val checked = view.isChecked

                when (view.getId()) {
                    R.id.rbhombres ->
                        if (checked) {
                        }
                    R.id.rbmujeres ->
                        if (checked) {
                        }
                }
            }
        }
    }
}