package com.iamwintrow.flashfire_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.widget.Button
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

    fun underLineMainTitle() {
        textView = findViewById(R.id.main_title)
        mainTitleString = SpannableString(textView.text)
        mainTitleString.setSpan(UnderlineSpan(), 0, mainTitleString.length, 0)
        textView.text = mainTitleString
    }

    fun setEventHearerOnLoginButton() {
        appCompatButton = findViewById(R.id.login_button)
        appCompatButton.setOnClickListener {
            val toast = Toast.makeText(applicationContext, "You logged in sucka!!!", Toast.LENGTH_LONG).show()
        }
    }

    fun setEventHearerOnRegisterButton() {
        registerButton = findViewById(R.id.register_button)
        registerButton.setOnClickListener {
            val toast = Toast.makeText(applicationContext, "Thanks for registering!", Toast.LENGTH_LONG).show()
        }
    }
}