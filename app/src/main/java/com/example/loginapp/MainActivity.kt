package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username == "admin" && password == "password") {
                Toast.makeText(this, "Login correcto", Toast.LENGTH_SHORT).show()
// Iniciar la nueva actividad después de un inicio de sesión exitoso
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()  // Finalizar MainActivity para que el usuario no pueda volver con el botón atrás
            } else {
                Toast.makeText(this, "Login fallido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}