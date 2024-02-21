package com.example.demosession

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.AnyThread
import androidx.appcompat.app.AppCompatActivity
import com.example.demosession.demolist.RecyclerListFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val preferences = getSharedPreferences("demo_preference", Context.MODE_PRIVATE)
//        val data = preferences.getString("demo_data", "")

        val textView = findViewById<TextView>(R.id.demoTv)
        val editText = findViewById<EditText>(R.id.etDemo)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

//        try {
//            baseContext.openFileInput("demo_file").use { input ->
//                val text = input.bufferedReader().use {
//                    it.readText()
//                }
//                textView.text= text
//            }
//        } catch (exp: Exception) {
//            exp.printStackTrace()
//        }

//        textView.text =

        saveBtn.setOnClickListener {
            val data = editText.text.toString()
            if (data.isNotEmpty()) {
//                preferences.edit().putString("demo_data", data).apply()
//                baseContext.openFileOutput("demo_file", Context.MODE_PRIVATE).use { output ->
//                    output.write(data.toByteArray())
//                }
            } else {
                Toast.makeText(baseContext, "Please enter some text", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
