package com.example.cosmo


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val btnSignbtn = findViewById<Button>(R.id.buttonSign)
        val firstName = findViewById<EditText>(R.id.firstname)
        val lastName = findViewById<EditText>(R.id.lastname)
        val emailId = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.pass)
        val repass = findViewById<EditText>(R.id.repass)
        btnSignbtn.setOnClickListener {
            if (firstName.text.toString().equals("") || password.text.toString().equals("") || lastName.text.toString().equals("")
                || emailId.text.toString().equals("") || repass.text.toString().equals("")) {
                Toast.makeText(this, "No fields should be blank", Toast.LENGTH_LONG).show()
            }
            else if (repass.text.toString().equals(password.text.toString())){

                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "passwords are not same", Toast.LENGTH_LONG).show()
            }


        }

    }
}
