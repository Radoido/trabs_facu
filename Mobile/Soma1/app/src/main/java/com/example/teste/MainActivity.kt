package com.example.teste

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.example.teste.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.main)
        var valor = 0
        binding.buttonSoma.setOnClickListener{
        valor += 1

            binding.textViewValor.setText(valor.toString())

        }



    }
}
