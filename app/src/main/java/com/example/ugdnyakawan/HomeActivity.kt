package com.example.ugdnyakawan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val buttonLogin1 = findViewById<Button>(R.id.buttonLogin1)

        btnSignUp.setOnClickListener {
            val intent = Intent(this, RegistrasiActivity::class.java )
            startActivity(intent)
        }

        buttonLogin1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }
    }
}