package com.iamwintrow.flashfire_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainMenuActivity : AppCompatActivity() {
    lateinit var logoutButton: Button
    lateinit var upButton : Button
    lateinit var downButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        setEventHearerOnLogoutButton()
        setEventHearerOnUpButton()
        setEventHearerOnDownButton()
    }

    private fun setEventHearerOnLogoutButton() {
        logoutButton = findViewById(R.id.logout_button)
        logoutButton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(Constants.USER_NAME, "username")
                startActivity(intent)
                finish()
            }
    }

    private fun setEventHearerOnUpButton() {
        upButton = findViewById(R.id.up_button)
        upButton.setOnClickListener {
            // TODO: Implement upward movement through collections
            Toast.makeText(this, "Going up!", Toast.LENGTH_LONG).show()
        }
    }

    private fun setEventHearerOnDownButton() {
        downButton = findViewById(R.id.down_button)
        downButton.setOnClickListener {
            // TODO: Implement downward movement through collections
            Toast.makeText(this, "Going down!", Toast.LENGTH_LONG).show()
        }
    }
}