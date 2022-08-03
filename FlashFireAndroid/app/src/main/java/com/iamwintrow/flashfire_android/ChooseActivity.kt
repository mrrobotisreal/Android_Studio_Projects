package com.iamwintrow.flashfire_android

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChooseActivity : AppCompatActivity() {
    lateinit var studyButton : LinearLayout
    lateinit var easyButton : LinearLayout
    lateinit var difficultButton : LinearLayout
    lateinit var editButton : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_mode)

        setEventHearerOnStudy()
        setEventHearerOnEasy()
        setEventHearerOnDifficult()
        setEventHearerOnEdit()
    }

    private fun setEventHearerOnStudy() {
        studyButton = findViewById(R.id.study_button)
        studyButton.setOnClickListener {
            Toast.makeText(this, "This is study mode!", Toast.LENGTH_LONG).show()
        }
    }

    private fun setEventHearerOnEasy() {
        easyButton = findViewById(R.id.easy_button)
        easyButton.setOnClickListener {
            Toast.makeText(this, "This is easy test mode!", Toast.LENGTH_LONG).show()
        }
    }

    private fun setEventHearerOnDifficult() {
        difficultButton = findViewById(R.id.difficult_button)
        difficultButton.setOnClickListener {
            Toast.makeText(this, "This is difficult test mode!", Toast.LENGTH_LONG).show()
        }
    }

    private fun setEventHearerOnEdit() {
        editButton = findViewById(R.id.edit_button)
        editButton.setOnClickListener {
            Toast.makeText(this, "This is edit mode!", Toast.LENGTH_LONG).show()
        }
    }
}