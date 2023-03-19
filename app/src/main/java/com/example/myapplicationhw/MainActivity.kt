package com.example.myapplicationhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nameEditText = findViewById<EditText>(R.id.textView)
        val nameEditText1 = findViewById<EditText>(R.id.textView1)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            val name = nameEditText.text.toString()
            val name1 = nameEditText1.text.toString()
            intent.putExtra("Key2",name)
            intent.putExtra("Key3",name1)
            startActivity(intent)

        }




            intent?.extras?.let {
                val value = it.getString("Key")
                val nameTextView6 = findViewById<TextView>(R.id.textView6)
                nameTextView6.text = value.toString()


                val value1 = it.getString("Key1")
                val nameTextView7 = findViewById<TextView>(R.id.textView7)
                nameTextView7.text = value1.toString()

                val value2 = it.getString("Key4")
                val nameTextView4 = findViewById<TextView>(R.id.textView4)
                nameTextView4.text = value2.toString()

                val value3 = it.getString("Key5")
                val nameTextView5 = findViewById<TextView>(R.id.textView5)
                nameTextView5.text = value3.toString()



            }
    }
}
