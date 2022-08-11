package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MyTag","MainActivity :SeocndActivity")
        setContentView(R.layout.activity_second)
        val username = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$username, you will get all the content free for one month"
        textView.text = message
        //https://youtu.be/BCSlZIUj18Y?t=6702
    }
    override fun onStart() {
        super.onStart()
        Log.i("MyTag","MainActivity :onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag","SeocndActivity :onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag","SeocndActivity :onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag","SeocndActivity :onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag","SeocndActivity :onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTag","SeocndActivity :onRestart")
    }
}