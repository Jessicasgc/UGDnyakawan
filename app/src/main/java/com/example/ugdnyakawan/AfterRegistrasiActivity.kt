package com.example.ugdnyakawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AfterRegistrasiActivity : AppCompatActivity() {
    private lateinit var username: TextView
    private lateinit var password: TextView
    private lateinit var email: TextView
    private lateinit var tglLahir: TextView
    private lateinit var notelp: TextView
    lateinit var mBundle: Bundle

    lateinit var vUsername: String
    lateinit var vPassword: String
    lateinit var vEmail: String
    lateinit var vtglLahir: String
    lateinit var vNoTelp: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_registrasi)

        getBundle()
        setText()
    }

    fun getBundle(){
        //mengambil bundle dari activity sebelumnya dengan menggunakan key register
        mBundle = intent.getBundleExtra("register")!!
        //mengambil data dari bundle
        vUsername = mBundle.getString("username")!!
        vPassword = mBundle.getString("password")!!
        vEmail = mBundle.getString("email")!!
        vtglLahir = mBundle.getString("tglLahir")!!
        vNoTelp = mBundle.getString("notelp")!!
    }

    fun setText(){
        username = findViewById(R.id.tvUsername)
        username.setText(vUsername)
        password = findViewById(R.id.tvPassword)
        password.setText(vPassword)
        email = findViewById(R.id.tvEmail)
        email.setText(vEmail)
        tglLahir = findViewById(R.id.tvtglLahir)
        tglLahir.setText(vtglLahir)
        notelp = findViewById(R.id.tvNoTelp)
        notelp.setText(vNoTelp)

    }
}