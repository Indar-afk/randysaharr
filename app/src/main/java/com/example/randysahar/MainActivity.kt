package com.example.randysahar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    internal var bLogout: Button
    internal var etName: EditText, internal var etAge:EditText, internal var etUsername:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName) as EditText
        etAge = findViewById(R.id.etAge) as EditText
        etUsername = findViewById(R.id.etUsername) as EditText
        bLogout = findViewById(R.id.bLogout) as Button

        bLogout.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.bLogout -> startActivity(Intent(this, Login::class.java))
        }
    }
}
