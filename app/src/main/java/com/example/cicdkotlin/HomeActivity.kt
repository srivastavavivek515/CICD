package com.example.cicdkotlin

import android.os.*
import android.widget.*
import androidx.activity.*
import androidx.appcompat.app.*
import androidx.core.view.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val name = this.getIntent().getStringExtra("name")
        val passedName = findViewById<TextView?>(R.id.passed_name)
        passedName.setText(name)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}