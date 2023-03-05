package com.example.ethbtc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class signupactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupactivity)

        val signinBTN : (Button) = findViewById(R.id.signinBTN)
        val mailfield : (EditText)= findViewById(R.id.SignInMail)
        val passwordfield: (EditText) = findViewById(R.id.SignInPassword)
        val passwordagainfield: (EditText) = findViewById(R.id.SignInPasswordAgain)

        signinBTN.setOnClickListener{
            if(mailfield.text.length >=8){
                if(passwordfield.text.length>=8){
                    if(passwordagainfield.text.length>=8 && passwordagainfield.text.contentEquals(passwordfield.text)){
                        val intent = Intent(this@signupactivity, MainScreen::class.java)
                        startActivity(intent)
                    }
                    else print("mail geçersiz")
                }
                else print("şifre tekrarı götten")
            }
            else println("şifre götten")
        }

    }
}