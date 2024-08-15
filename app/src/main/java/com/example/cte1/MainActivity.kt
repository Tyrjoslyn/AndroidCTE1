/*              CTE1

Create TextView
    Print ("Critical Thinking Exercise 1")
        center text

Create Button
    Button label("Click Me")
    Button activate function Clicked

Function Clicked
    print("Hello Android")

* */


package com.example.cte1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    
    fun Clicked(view: View) {
        var displaytext : TextView = findViewById(R.id.textView)
        displaytext.setText("Hello Android")
        }

    }
