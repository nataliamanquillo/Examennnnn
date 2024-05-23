package com.example.examen1

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examen1.databinding.ActivityMainBinding

private operator fun Boolean.invoke(value: Any) {

}

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //usar los botones
        binding.btnMasaCorporal.setOnClickListener(this)

    }

    // funcion
    fun masaCorporal(peso: String, estatura: String): String{
        var indice = (peso.toFloat() / (estatura.toFloat() * 2))
        return "Su índice de masa corporal es $indice"
    }

    // funciones

    override fun onClick(v: View?) {

        when (v) {
            binding.btnMasaCorporal -> {



            }
        }
    }
}




