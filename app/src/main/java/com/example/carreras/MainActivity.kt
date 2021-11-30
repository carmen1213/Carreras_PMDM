package com.example.carreras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagprincipal = findViewById<Button>(R.id.buttonprincipal)

        pagprincipal.setOnClickListener {

            val cambiando = Intent(this, coche_jugar ::class.java)

            startActivity(cambiando)

        }

    }
}