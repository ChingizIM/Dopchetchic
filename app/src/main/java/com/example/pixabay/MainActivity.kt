package com.example.pixabay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.pixabay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vb:MViewModel
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        vb = ViewModelProvider(this)[MViewModel::class.java]

        vb.result.observe(this){
            binding.count.text = it

        }
        binding.btnp.setOnClickListener{
            vb.increment()
        }
        binding.btnm.setOnClickListener {
            vb.decrement()
        }
    }

}