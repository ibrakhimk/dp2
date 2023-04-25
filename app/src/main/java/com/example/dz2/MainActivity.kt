package com.example.dz2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val list = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.btnAdd.setOnClickListener {
            list.add(binding.etText.text.toString())
            binding.etText.text.clear()
        }
        binding.btnPrint.setOnClickListener {
            binding.tvText.text = list.toString()
        }
    }
}