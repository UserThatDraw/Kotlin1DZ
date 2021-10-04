package com.example.kotlin1dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.example.kotlin1dz.databinding.ActivityMainBinding
import com.example.kotlin1dz.utils.extencions.errorText
import com.example.kotlin1dz.utils.extencions.getTextE

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent.getSerializableExtra("text2") != null) binding.kakoytoEtActiv1.setText(
            intent.getSerializableExtra(
                "text2"
            ).toString()
        )
        click()
    }

    private fun click() {
        binding.kakoytoBtnActiv1.setOnClickListener {
            if (!TextUtils.isEmpty(binding.kakoytoEtActiv1.text)) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("text", binding.kakoytoEtActiv1.getTextE())
                startActivity(intent)
            } else {
                binding.kakoytoEtActiv1.errorText()
            }
        }
    }
}