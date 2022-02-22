package com.example.customgrid

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customgrid.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val msg = intent.getStringExtra("title")
        val pic = intent.getIntExtra("image",R.drawable.msdhoni)

        binding.tvTitle.text = msg
        binding.ivImage.setImageResource(pic)
    }
}