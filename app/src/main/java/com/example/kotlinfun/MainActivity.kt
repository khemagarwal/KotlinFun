package com.example.kotlinfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var count =0



    fun count(view: View)
    {
        count++
        textView.text=count.toString()
    }

    fun reset(view: View)
    {
        count=0
        textView.text=count.toString()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      var textView = findViewById<TextView>(R.id.textView)







    }
}
