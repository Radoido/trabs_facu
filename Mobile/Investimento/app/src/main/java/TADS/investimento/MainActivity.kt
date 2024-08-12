package TADS.investimento

import TADS.investimento.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.main)


        binding.buttonCalcula.setOnClickListener{

            if (binding.editTextCapital.text.isEmpty() || binding.editTextJuros.text.isEmpty() || binding.editTextPeriodo.text.isEmpty()){
                Toast.makeText(applicationContext, "Informe todos os valores!", Toast.LENGTH_LONG).show()
            }else {

                val capital = binding.editTextCapital.text.toString().toDouble()
                val taxa = binding.editTextJuros.text.toString().toDouble()
                val periodo = binding.editTextPeriodo.text.toString().toDouble()

                var resultado = String.format("%.2f", capital * ((1 + taxa).pow(periodo)))

                binding.textResultado.setText("$resultado")
            }
            }

    }
}
