package com.example.kotlin1dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1dz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent.getSerializableExtra("text2") != null ) {
            var text = intent.getSerializableExtra("text2")
            binding.kakoytoEtActiv1.hint = text.toString()
        }
        click()
    }

    private fun click() {
        binding.kakoytoBtnActiv1.setOnClickListener {
            if (binding.kakoytoEtActiv1.text.toString() >= 1.toString()) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("text", binding.kakoytoEtActiv1.text.toString())
                startActivity(intent)
            } else {
                binding.kakoytoEtActiv1.error = "Введите текст"
            }
        }
    }
}