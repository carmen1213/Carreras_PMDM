package com.example.carreras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Jugar : AppCompatActivity() {
    val cocheferrari = coches(450,300,8)
    val cochelambo = coches(300,250,8)
    val cochecupra = coches(300,250,8)
    val cocheporche = coches(300,250,8)
    val cochemustang = coches(300,250,8)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)


    }
}