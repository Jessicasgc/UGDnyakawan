package com.example.ugdnyakawan


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var inputUsername: TextInputLayout
    private lateinit var inputPassword: TextInputLayout
    private lateinit var mainLayout: ConstraintLayout
    lateinit var username: String
    lateinit var password: String
    lateinit var bundle: Bundle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("User Login")


        inputUsername = findViewById(R.id.inputLayoutUsername)
        inputPassword = findViewById(R.id.inputLayoutPassword)
        mainLayout = findViewById(R.id.mainLayout)

        val btnClear : Button = findViewById(R.id.btnClear)
        val btnLogin : Button = findViewById(R.id.btnLogin)

        btnClear.setOnClickListener{
            inputUsername.getEditText()?.setText("")
            inputPassword.getEditText()?.setText("")

            Snackbar.make(mainLayout,"Text Cleared Success", Snackbar.LENGTH_LONG).show()
        }

        btnLogin.setOnClickListener (View.OnClickListener{
            var checkLogin = false
            val username : String = inputUsername.getEditText()?.getText().toString()
            val password : String = inputPassword.getEditText()?.getText().toString()

            if(username==user && password==pass) {
                val intent = Intent(this, HomeActivity1::class.java)
                startActivity(intent)
                checkLogin = true

            }

            if(username!=user) {
                inputUsername.setError("Username must be filled correctly")
                checkLogin = false
            }

            if(password!=pass) {
                inputPassword.setError("Password must be filled correctly")
                checkLogin = false
            }

            if(username.isEmpty()){
                inputUsername.setError("Username must be filled with text")
                checkLogin = false
            }

            if(password.isEmpty()){
                inputPassword.setError("Username must be filled with text")
                checkLogin = false
            }

            if (username == user && password == pass) checkLogin = true
            if (!checkLogin) return@OnClickListener
            val toHome = Intent(this@MainActivity, HomeActivity1::class.java)
            startActivity(toHome)

        })

        textViewRegister.setOnClickListener{
            val intent = Intent(this, RegistrasiActivity::class.java)
            startActivity(intent)
        }
    }

    fun getBundle(){
        val bundle: Bundle? = intent.extras

        val name: String? = bundle?.getString("username")
        val pass: String? = bundle?.getString("password")

        inputUsername = findViewById(R.id.inputLayoutUsername)
        inputPassword = findViewById(R.id.inputLayoutPassword)
        inputUsername.getEditText()?.setText(name)
        inputPassword.getEditText()?.setText(pass)
        username = name.toString()
        password = pass.toString()
    }

}


