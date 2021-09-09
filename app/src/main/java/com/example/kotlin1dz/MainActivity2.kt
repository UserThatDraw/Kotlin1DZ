package com.example.kotlin1dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1dz.databinding.ActivityMain2Binding
import com.example.kotlin1dz.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent.getSerializableExtra("text") != null) {
            var text = intent.getSerializableExtra("text")
            binding.kakoytoEtActiv2.hint = text.toString()
        }
        click()
    }

    private fun click() {
        binding.kakoytoBtnActiv2.setOnClickListener {
            if (binding.kakoytoEtActiv2.text.toString() >= 1.toString()) {
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                intent.putExtra("text2", binding.kakoytoEtActiv2.text.toString())
                startActivity(intent)
            } else {
                binding.kakoytoEtActiv2.error = "Введите текст"
            }
        }
    }
}