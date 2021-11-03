package com.example.googleform

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.googleform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { Toast.makeText(applicationContext,"go to next page",Toast.LENGTH_SHORT).show() }

//        binding.editTextTextPersonName.setOnClickListener{ Toast.makeText(applicationContext,"write you first name here",Toast.LENGTH_SHORT).show() }
//
//        binding.editTextTextPersonName2.setOnClickListener { Toast.makeText(applicationContext,"write you last name here",Toast.LENGTH_SHORT).show() }

        binding.textView5.setOnClickListener { Toast.makeText(applicationContext,"sign in instead",Toast.LENGTH_SHORT).show() }

//        binding.editTextTextPersonName3.setOnClickListener { Toast.makeText(applicationContext,"write your email",Toast.LENGTH_SHORT).show() }
//
//        binding.editTextTextPersonName4.setOnClickListener { Toast.makeText(applicationContext,"enter your password",Toast.LENGTH_SHORT).show() }
//
//        binding.editTextTextPersonName5.setOnClickListener { Toast.makeText(applicationContext,"confirm password",Toast.LENGTH_SHORT).show() }

        binding.textView4.setOnClickListener { Toast.makeText(applicationContext,"Use my current email",Toast.LENGTH_SHORT).show() }




    }
}