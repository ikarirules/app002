package com.example.app002

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
        lateinit var btn001: Button
        lateinit var text001: EditText
        lateinit var intet: Intent
        lateinit var text003: EditText
        var usuario="david"
        var pass="david1234"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn001= findViewById(R.id.btn001)
        text001 = findViewById(R.id.text001)
        text003 = findViewById(R.id.text003)

        btn001.setOnClickListener {
            verificarCampo()
        }
    }

    private fun verificarCampo() {
        if (text001.text.isNotEmpty()){
            if (text003.text.isNotEmpty()){
                verificarLogPass()
            }else{
                mensajeErrorVacio()
            }
        }else{
            mensajeErrorVacio()
        }
    }

    private fun verificarLogPass() {
        if (text003.text.length<8){
            mensajeErrorLong()
        }else {
            comprobarUserYPass()
        }
    }

    private fun mensajeErrorLong(){
        Toast.makeText(this, "Contraseña muy corta", Toast.LENGTH_SHORT).show()
    }

    private fun comprobarUserYPass() {
        if (text001.text.toString().equals(usuario)){
            if (text003.text.toString().equals(pass)){
                val intent = Intent(this, RespActivity::class.java)
                intent.putExtra("value001", text001.text)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Usuario o Contraseña incorrecto", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "Usuario o Contraseña incorrecto", Toast.LENGTH_SHORT).show()
        }
    }

    private fun mensajeErrorVacio() {
        Toast.makeText(this, "Datos incompletos", Toast.LENGTH_SHORT).show()
    }


}