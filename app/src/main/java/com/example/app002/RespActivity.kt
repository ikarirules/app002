package com.example.app002

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RespActivity : AppCompatActivity() {
    lateinit var btn002: Button
    lateinit var text002: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resp)
        btn002= findViewById(R.id.btn002)
        text002 = findViewById(R.id.text002)
        btn002.setOnClickListener { onBackPressed() }
        obtenerDatos()
    }
    fun obtenerDatos(){
        val info = intent.extras
        val aMostrar = info?.get("value001")
        val saludo = aMostrar.toString()

        text002.text = saludo
    }
}