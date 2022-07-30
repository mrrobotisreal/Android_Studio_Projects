package com.iamwintrow.flashfire_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpPage : AppCompatActivity() {
    lateinit var signupButton: Button
    lateinit var accountButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        setEventHearerOnSignupButton()
        setEventHearerOnAccountButton()
    }

    private fun setEventHearerOnSignupButton() {
        val name : EditText = findViewById(R.id.signup_name)
        val email : EditText = findViewById(R.id.signup_email)
        val username : EditText = findViewById(R.id.signup_username)
        val password : EditText = findViewById(R.id.signup_password)
        signupButton = findViewById(R.id.signup_button)
        signupButton.setOnClickListener {
            Toast.makeText(this, "Thanks for signing up!", Toast.LENGTH_LONG).show()
            if (name.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            } else if (email.text.isEmpty()) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_LONG).show()
            } else if (username.text.isEmpty()) {
                Toast.makeText(this, "Please pick a username", Toast.LENGTH_LONG).show()
            } else if (password.text.isEmpty()) {
                Toast.makeText(this, "Please create a password", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, MainMenuActivity::class.java)
                intent.putExtra(Constants.SIGNUP_NAME, name.text.toString())
                intent.putExtra(Constants.SIGNUP_EMAIL, email.text.toString())
                intent.putExtra(Constants.SIGNUP_USERNAME, username.text.toString())
                intent.putExtra(Constants.SIGNUP_PASSWORD, password.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

    private fun setEventHearerOnAccountButton() {
        accountButton = findViewById(R.id.account_button)
        accountButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra(Constants.USER_NAME, "username")
            startActivity(intent)
            finish()
        }
    }
}