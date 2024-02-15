package com.example.demosession

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    val TAG = SecondActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data = intent.getStringExtra("extra_data")
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = data
        Log.v(TAG, "------ onCreate ")
    }

    override fun onStart() {
        super.onStart()
        Log.v(TAG, "------ onStart ")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "------- onPause ")
    }

    override fun onResume() {
        super.onResume()
        Log.v(TAG, "------ onResume ")
    }

    override fun onStop() {
        super.onStop()
        setResult(Activity.RESULT_OK,
            Intent().putExtra("extra_string", "Data from second screen")
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "----- onDestroy ")
    }

}