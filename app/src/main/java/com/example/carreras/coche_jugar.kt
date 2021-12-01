package com.example.carreras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class coche_jugar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coche_jugar)

        val pagcoche = findViewById<Button>(R.id.button2)

        pagcoche.setOnClickListener {

            val cambiando = Intent(this, Coches ::class.java)

            startActivity(cambiando)

        }

        val pagjugar = findViewById<Button>(R.id.button4)

        pagjugar.setOnClickListener {

            val cambiando = Intent(this, Jugar ::class.java)

            startActivity(cambiando)

        }

    }


}