package com.example.mediaaluno

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mediaaluno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.main)

        binding.buttonCalcula.setOnClickListener {

           if (binding.editTextNota1.text.isEmpty() || binding.editTextNota2.text.isEmpty() || binding.editTextNota3.text.isEmpty() ){
               Toast.makeText(applicationContext, "Informe todas as notas!", Toast.LENGTH_LONG).show()

           }else if (binding.editTextPeso1.text.isEmpty() || binding.editTextPeso2.text.isEmpty() || binding.editTextPeso3.text.isEmpty()){
               val nota1 = binding.editTextNota1.text.toString().toDouble()
               val nota2 = binding.editTextNota2.text.toString().toDouble()
               val nota3 = binding.editTextNota3.text.toString().toDouble()

               val resultado  = String.format("%.2f",((nota3 + nota2 + nota1)/3))

                binding.textViewResultado.setText("A média é $resultado")

           }else{
               val nota1 = binding.editTextNota1.text.toString().toDouble()
               val nota2 = binding.editTextNota2.text.toString().toDouble()
               val nota3 = binding.editTextNota3.text.toString().toDouble()
               val peso1 = binding.editTextPeso1.text.toString().toDouble()
               val peso2 = binding.editTextPeso2.text.toString().toDouble()
               val peso3 = binding.editTextPeso3.text.toString().toDouble()

               val resultado  = String.format("%.2f",((nota3*peso3) + (nota2*peso2) + (nota1*peso1))*0.10)

               binding.textViewResultado.setText("A média é $resultado")
           }






        }
        }
    }
