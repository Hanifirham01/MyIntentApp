package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button =findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityWithData : Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivityWithData.setOnClickListener(this)

        val btnDialPhone :Button = findViewById(R.id.boton_dial_number)
        btnDialPhone.setOnClickListener(this)


    }

    override fun onClick(v: View){
        when (v.id){
            R.id.btn_move_activity ->{
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                moveIntent.putExtra(MoveActivity.Data_Lengkap, "Data Diri")
                moveIntent.putExtra(MoveActivity.Extra_Data, "Data Tambahan")
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data ->{
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithActivityData::class.java)
                moveWithDataIntent.putExtra(MoveWithActivityData.Extra_Name, "Hanif Irham")
                moveWithDataIntent.putExtra(MoveWithActivityData.Extra_Age,22)
                startActivity(moveWithDataIntent)
            }

            R.id.boton_dial_number ->{
                val phoneNumber = "089610557003"
                val DialPhoneInternet = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(DialPhoneInternet)
            }
        }
    }
}
