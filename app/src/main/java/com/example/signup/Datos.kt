package com.example.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.signup.databinding.ActivityDatosBinding

class Datos : AppCompatActivity() {
    private lateinit var binding: ActivityDatosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDatosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adaptador : ArrayAdapter<*> = ArrayAdapter.createFromResource(
            this,R.array.teleefono,android.R.layout.simple_spinner_item
        )
        binding.spntfno.adapter = adaptador
        binding.spntfno.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ){
            }
            override fun onNothingSelected(parent:AdapterView<*>?) {
                Toast.makeText(this@Datos, "sin selección", Toast.LENGTH_SHORT).show()
            }
        }
        val adaptadorr : ArrayAdapter<*> = ArrayAdapter.createFromResource(
            this,R.array.Emaiil,android.R.layout.simple_spinner_item
        )
        binding.spinner2.adapter = adaptadorr
        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ){
            }

            override fun onNothingSelected(parent:AdapterView<*>?) {
                Toast.makeText(this@Datos, "sin selección", Toast.LENGTH_SHORT).show()
            }
        }


    }
}