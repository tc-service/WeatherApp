package com.technocopy.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // создание глобальной переменной
    var tvText : TextView? = null  // способ через null

    lateinit var tvCount : TextView
    lateinit var button: Button
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText)
        tvText?.text = getString(R.string.start)

        tvCount = findViewById(R.id.tvCount)
        tvCount.text = count.toString()

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val myDialogFragment = MyDialogFragment()
            val manager = supportFragmentManager
            myDialogFragment.show(manager, "Нажата кнопка")

            count++
            tvCount.text = count.toString()
        }

    }

}