package com.example.sapple.googlemapsdirection

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()
        Log.e("Main Activity", "Navjot")
        Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show()
    }
}
