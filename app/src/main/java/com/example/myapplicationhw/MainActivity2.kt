package com.example.myapplicationhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.StructuredName
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nameEditText2 = findViewById<EditText>(R.id.textView2)
        val nameEditText3 = findViewById<EditText>(R.id.textView3)
        val button1 = findViewById<Button>(R.id.button2)


        intent?.extras?.let {
            val value = it.getString("Key2")
            //val textView10 = findViewById<TextView>(R.id.textView8)
            //textView10.text = value.toString()


            val value1 = it.getString("Key3")
           // val textView11 = findViewById<TextView>(R.id.textView9)
            //textView11.text = value1.toString()




            button1.setOnClickListener {
//startActivity(Intent(this,MainActivity2::class.java))

                val intent = Intent(this, MainActivity::class.java)
                val name2 = nameEditText2.text.toString()
                val name3 = nameEditText3.text.toString()
               // val name4 = textView10.text.toString()
                //val name5 = textView11.text.toString()

                intent.putExtra("Key", name2)
                intent.putExtra("Key1", name3)
                intent.putExtra("Key4", value)
                intent.putExtra("Key5", value1)
                startActivity(intent)
            }
        }
    }
}




