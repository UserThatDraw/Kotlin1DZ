package com.example.kotlin1dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.example.kotlin1dz.databinding.ActivityMain2Binding
import com.example.kotlin1dz.databinding.ActivityMainBinding
import com.example.kotlin1dz.utils.extencions.errorText
import com.example.kotlin1dz.utils.extencions.getTextE

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent.getSerializableExtra("text") != null) binding.kakoytoEtActiv2.setText(
            intent.getSerializableExtra(
                "text"
            ).toString()
        )
        click()
    }

    private fun click() {
        binding.kakoytoBtnActiv2.setOnClickListener {
            if (!TextUtils.isEmpty(binding.kakoytoEtActiv2.text)) {
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                intent.putExtra("text2", binding.kakoytoEtActiv2.getTextE())
                startActivity(intent)
            } else {
                binding.kakoytoEtActiv2.errorText()
            }
        }
    }
}