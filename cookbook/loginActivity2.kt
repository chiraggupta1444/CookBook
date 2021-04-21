package com.example.cookbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginActivity2 : AppCompatActivity() {
   lateinit var  button1:Button
    lateinit var  button2:Button
    lateinit var  button3:Button
    lateinit var  button4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        button1=findViewById(R.id.btnBut2)
        button1.setOnClickListener {
            val intent= Intent(this@loginActivity2,loginIndiaActivity2::class.java)
            startActivity(intent)
        }
        button2=findViewById(R.id.btnBut3)
        button2.setOnClickListener {
            val intent= Intent(this@loginActivity2,loginchineseActivity2::class.java)
            startActivity(intent)
        }
        button3=findViewById(R.id.btnBut4)
        button3.setOnClickListener {
            val intent= Intent(this@loginActivity2,loginItalianActivity2::class.java)
            startActivity(intent)
        }
        button4=findViewById(R.id.btnBut5)
        button4.setOnClickListener {
            val intent= Intent(this@loginActivity2,loginsouthActivity2::class.java)
            startActivity(intent)
        }
    }
}