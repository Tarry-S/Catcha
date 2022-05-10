package com.example.catcha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catcha.databinding.ActivityPullBinding

class PullActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPullBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPullBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val coins = intent.getStringExtra(ClickerActivity.COINS)?.toInt()

    }
}