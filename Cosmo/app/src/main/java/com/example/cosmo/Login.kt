package com.example.cosmo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)
        var button = findViewById<Button>(R.id.login)
        var signup = findViewById<TextView>(R.id.text4)

        signup.setOnClickListener{
            val intent=Intent(this,Signup::class.java)
            startActivity(intent)

        }

        button.setOnClickListener {
            if (username.text.toString().equals("") || password.text.toString().equals("")) {
                Toast.makeText(this, "Username or Password is blank", Toast.LENGTH_LONG).show()
            } else if (username.text.toString().equals("Admin") and password.text.toString()
                    .equals("Admin")
            ) {
                val editor = getSharedPreferences("name", Context.MODE_PRIVATE).edit()
                editor.putString("name", username.getText().toString())
                editor.apply()
                val intent = Intent(this, Dashboard::class.java)
                intent.putExtra("name", username.toString())
                startActivity(intent)
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Incorrect Username or Password", Toast.LENGTH_LONG).show()
            }

        }

    }


}