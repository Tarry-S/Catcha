package com.example.catcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.catcha.databinding.ActivityClickerBinding
import com.example.catcha.databinding.ActivityTitleBinding

class TitleScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTitleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTitleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonTitleScreenStart.setOnClickListener {
            val clickerIntent = Intent(this, ClickerActivity::class.java)
            startActivity(clickerIntent)
        }
    }
}