package com.example.ugdnyakawan

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

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