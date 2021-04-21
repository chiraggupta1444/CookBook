package com.example.cookbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nonloginActivity : AppCompatActivity() {
    lateinit var but: Button
    lateinit var but2: Button
    lateinit var but3: Button
    lateinit var but4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nonlogin)
        but=findViewById(R.id.btnBut2)
        but.setOnClickListener {
            val intent= Intent(this@nonloginActivity,indianActivity2::class.java)
            startActivity(intent)
        }
        but2=findViewById(R.id.btnBut3)
        but2.setOnClickListener {
            val intent= Intent(this@nonloginActivity,chineseActivity2::class.java)
            startActivity(intent)
        }
        but3=findViewById(R.id.btnBut4)
          but3.setOnClickListener {
              val intent = Intent(this@nonloginActivity, italianActivity2::class.java)
              startActivity(intent)
          }
        but4=findViewById(R.id.btnBut5)
        but4.setOnClickListener {
            val intent= Intent(this@nonloginActivity,southActivity2::class.java)
            startActivity(intent)
        }
    }
}