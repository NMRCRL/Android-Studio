package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        Log.v("MainActivity","Verbose");
        Log.d("MainActivity","Debug");
        Log.i("MainActivity","Info");
        Log.w("MainActivity","Warning");
        Log.e("MainActivity","Error");
        Log.wtf("MainActivity","Assert");

    }
}