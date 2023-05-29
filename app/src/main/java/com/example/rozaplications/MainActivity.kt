package com.example.rozaplications

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.logging.Level
import java.util.logging.Logger

class MainActivity : ComponentActivity() {
    var logger = Logger.getLogger("MainActivity")

    lateinit var editText: EditText
    lateinit var EditEmail:EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main_constraint)

        var btn = findViewById<Button>(R.id.Button)
        btn.setOnClickListener({view ->
            logger.log(Level.INFO, findViewById<TextView>(R.id.editText).text.toString())
            logger.log(Level.INFO, findViewById<TextView>(R.id.editEmail).text.toString())
        })
    }

    override fun onStop() {
        super.onStop()
        logger.log(Level.INFO, "OnStopMethod")
    }

    override fun onPause() {
        super.onPause()
        logger.log(Level.INFO, "OnStopMethod")
    }
}

