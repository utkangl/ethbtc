package com.example.ethbtc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBTN : (Button) = findViewById(R.id.loginBTN)
        val mailfield : (EditText)= findViewById(R.id.LogInMail)
        val passwordfield: (EditText) = findViewById(R.id.LogInPassword)
        val signupBTN : (Button)= findViewById(R.id.signupBTN)

        loginBTN.setOnClickListener{
            if(mailfield.text.length >= 8) {
                if(passwordfield.text.length >= 8){
                    // change activity
                }
            }
        }

        signupBTN.setOnClickListener{
            //change activity
        }
    }





}