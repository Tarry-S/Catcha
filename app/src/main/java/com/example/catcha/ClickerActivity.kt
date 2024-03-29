package com.example.catcha

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catcha.databinding.ActivityClickerBinding

class ClickerActivity : AppCompatActivity() {

    companion object{
        var COINS = ""
    }

    private lateinit var binding: ActivityClickerBinding
    var coins = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClickerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewClickerCoins.text = "$coins"

        binding.buttonClickerButton.setOnClickListener {
            coins++
            binding.textViewClickerCoins.text = "$coins"
        }

        binding.buttonClickerPull.setOnClickListener {
            var pullIntent = Intent(this, PullActivity::class.java).apply {
                putExtra(COINS, coins)
            }
            startActivity(pullIntent)
        }
    }
}