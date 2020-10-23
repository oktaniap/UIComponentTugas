package com.example.uicomponenttugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<ImageButton>(R.id.btndft)
        btn1.setOnClickListener{
            Toast.makeText(this@MainActivity, "Pendaftaran Berhasil", Toast.LENGTH_LONG).show()
        }
        val btn2 = findViewById<ImageButton>(R.id.btntdk)
        btn2.setOnClickListener{
            Toast.makeText(this@MainActivity, "Pendaftaran Dibatalkan", Toast.LENGTH_LONG).show()
        }
    }
}