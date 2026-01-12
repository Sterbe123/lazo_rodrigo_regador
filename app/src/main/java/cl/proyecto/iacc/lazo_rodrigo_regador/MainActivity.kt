package cl.proyecto.iacc.lazo_rodrigo_regador

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

Class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.textViewDemo)
        texto.text = "Rodrigo Lazo Fredes - HERPM1305-31--1-2025 - 12/01/2026"
    }
}