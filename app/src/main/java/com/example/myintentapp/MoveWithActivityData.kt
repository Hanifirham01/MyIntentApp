package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MoveWithActivityData : AppCompatActivity() {

    companion object{
        const val Extra_Age = "extra_age"
        const val Extra_Name = "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)

        val name = intent.getStringExtra(Extra_Name)
        val age = intent.getIntExtra(Extra_Age,0)

        val text = "Name : $name \n Age : $age"
        tvDataReceived.text=text


    }
}