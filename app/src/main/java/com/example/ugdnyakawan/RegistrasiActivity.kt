package com.example.ugdnyakawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class RegistrasiActivity : AppCompatActivity() {
    private lateinit var username: TextInputEditText
    private lateinit var password: TextInputEditText
    private lateinit var email: TextInputEditText
    private lateinit var tglLahir: TextInputEditText
    private lateinit var notelp: TextInputEditText
    private lateinit var register: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        username = findViewById(R.id.etUsername)
        password = findViewById(R.id.etPassword)
        email = findViewById(R.id.etEmail)
        tglLahir = findViewById(R.id.etTglLahir)
        notelp = findViewById(R.id.etNoTelp)
        register = findViewById(R.id.btnRegister)

        register.setOnClickListener {
            val intent = Intent(this, AfterRegistrasiActivity::class.java)
            val mBundle = Bundle()
            //memasukkan data ke dalam bundle
            mBundle.putString("username", username.text.toString())
            mBundle.putString("password", password.text.toString())
            mBundle.putString("email", email.text.toString())
            mBundle.putString("tglLahir", tglLahir.text.toString())
            mBundle.putString("notelp", notelp.text.toString())
            //melakukan intent dengan memanggil bundle
            intent.putExtra("register", mBundle)

            startActivity(intent)
        }
    }
}