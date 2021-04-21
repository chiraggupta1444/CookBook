package com.example.cookbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity()/*,View.OnClickListener*/
{

    lateinit var button: Button
    lateinit var name: EditText
    lateinit var pass: EditText
    lateinit var cuisine: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name=findViewById(R.id.etName)
        pass=findViewById(R.id.etPass)
        val valName= arrayOf("chirag","muskan","deepak","anita")
        val valPass="mahadev"
        button=findViewById(R.id.btnbutton)
        cuisine=findViewById(R.id.btnCuisine)

        button.setOnClickListener {
            val password=pass.text.toString()
            val namenew=name.text.toString()
            if((valName.contains(namenew))&&(password==valPass))
            {
                /* Toast.makeText(this@MainActivity ,"Clicked",Toast.LENGTH_LONG).show()*/
                val intent= Intent(this@MainActivity,loginActivity2::class.java)
                startActivity(intent)}
            else{
                Toast.makeText(this@MainActivity,"Incorrect", Toast.LENGTH_LONG).show()
            }
        }
        cuisine.setOnClickListener {
            val intent= Intent(this@MainActivity,nonloginActivity::class.java)
            startActivity(intent)
        }
    }
}