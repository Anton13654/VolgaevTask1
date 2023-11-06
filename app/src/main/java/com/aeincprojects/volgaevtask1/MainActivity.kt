package com.aeincprojects.volgaevtask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var redButton: Button
    private lateinit var greenButton: Button
    private lateinit var blueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redButton = findViewById(R.id.button_red)
        greenButton = findViewById(R.id.button_green)
        blueButton = findViewById(R.id.button_blue)

        redButton.setOnClickListener {
            val redActivity = Intent(this, RedActivity::class.java)
            startActivity(redActivity) }
        greenButton.setOnClickListener {
            val greenActivity = Intent(this, GreenActivity::class.java)
            startActivity(greenActivity) }
        blueButton.setOnClickListener {
            val blueActivity = Intent(this, BlueActivity::class.java)
            startActivity(blueActivity) }

    }
}