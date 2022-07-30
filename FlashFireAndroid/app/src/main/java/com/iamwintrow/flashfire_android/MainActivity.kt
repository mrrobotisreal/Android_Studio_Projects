package com.iamwintrow.flashfire_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView : TextView
    lateinit var mainTitleString : SpannableString

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        underLineMainTitle()
    }

    fun underLineMainTitle() {
        textView = findViewById(R.id.main_title)
        mainTitleString = SpannableString(textView.text)
        mainTitleString.setSpan(UnderlineSpan(), 0, mainTitleString.length, 0)
        textView.text = mainTitleString
    }
}