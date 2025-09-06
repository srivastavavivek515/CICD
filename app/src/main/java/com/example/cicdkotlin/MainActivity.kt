package com.example.cicdkotlin

import android.content.*
import android.os.*
import android.view.*
import android.widget.*
import androidx.activity.*
import androidx.appcompat.app.*
import androidx.core.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText?>(R.id.name)
        val submitBtn = findViewById<Button?>(R.id.on_click)

        submitBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val intent = Intent(this@MainActivity, HomeActivity::class.java)
                intent.putExtra("name", editText.getText().toString())
                startActivity(intent)
            }
        })
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}