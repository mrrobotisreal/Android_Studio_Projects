package com.iamwintrow.flashfire_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var textView : TextView
    lateinit var mainTitleString : SpannableString
    lateinit var appCompatButton: Button
    lateinit var registerButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        underLineMainTitle()
        setEventHearerOnLoginButton()
        setEventHearerOnRegisterButton()

    }

    private fun underLineMainTitle() {
        textView = findViewById(R.id.main_title)
        mainTitleString = SpannableString(textView.text)
        mainTitleString.setSpan(UnderlineSpan(), 0, mainTitleString.length, 0)
        textView.text = mainTitleString
    }

    private fun setEventHearerOnLoginButton() {
        val username : EditText = findViewById(R.id.username)
        val password : EditText = findViewById(R.id.password)
        appCompatButton = findViewById(R.id.login_button)
        appCompatButton.setOnClickListener {
            if (username.text.isEmpty()) {
                Toast.makeText(this, "Please enter your username", Toast.LENGTH_LONG).show()
            } else if (password.text.isEmpty()) {
                Toast.makeText(this, "Please enter your password", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, MainMenuActivity::class.java)
                intent.putExtra(Constants.USER_NAME, username.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

    private fun setEventHearerOnRegisterButton() {
        registerButton = findViewById(R.id.register_button)
        registerButton.setOnClickListener {
            val intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}