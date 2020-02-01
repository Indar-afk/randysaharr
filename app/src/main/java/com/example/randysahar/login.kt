package com.example.randysahar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class login : AppCompatActivity(),View.OnClickListener {

        internal var bLogin: Button
        internal var etUsername: EditText
        internal var etPassword: EditText
        internal var RegiesterLink: TextView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_login)

            etUsername = findViewById(R.id.etUsername) as EditText
            etPassword = findViewById(R.id.etPassword) as EditText
            bLogin = findViewById(R.id.bLogin) as Button
            RegiesterLink = findViewById(R.id.RegiesterLink) as TextView

            bLogin.setOnClickListener(this)
            RegiesterLink.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            when (v.id) {
                R.id.bLogin -> {
                }

                R.id.RegiesterLink -> startActivity(Intent(this, Register::class.java))
            }
        }
    }
