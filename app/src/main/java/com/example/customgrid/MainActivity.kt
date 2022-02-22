package com.example.customgrid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customgrid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val title = arrayOf(
        "MS Dhoni",
        "Suresh Raina",
        "Moeen Ali",
        "Ravindra Jadeja",
        "Dwayne Bravo",
        "C Hari Nishaanth",
        "Sam Curran",
        "Robin Uthappa",
        "Ruturaj Gaikwad",
        "Ambati Rayudu",
        "Narayan Jagadeesan"
    )
    val imageId = arrayOf(R.drawable.msdhoni,R.drawable.suresh,R.drawable.alic,R.drawable.jadc,
        R.drawable.cbravo,R.drawable.hari,R.drawable.samc,R.drawable.uthappa,R.drawable.rutuc,
        R.drawable.ambati,R.drawable.narayanac)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val mainAdapter = MyGridAdapter(this,title,imageId)
        binding.grid.adapter = mainAdapter

        binding.grid.setOnItemClickListener { parent, view, position, id ->
            val name = title[position]
            val image = imageId[position]
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("title",name)
            intent.putExtra("image",image)
            startActivity(intent)
        }

    }
}