package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveActivity : AppCompatActivity() {

    companion object{
        const val Extra_Data = "extra_data"
        const val Data_Lengkap= "data_lengkap"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)

        val NamaData = intent.getStringExtra(MoveActivity.Extra_Data)
        val DataLengkap = intent.getStringExtra(MoveActivity.Data_Lengkap)

        val text = "Nama Data : $NamaData\nData Lengkap : $DataLengkap"
        tvDataReceived.text=text
    }
}