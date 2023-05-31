package com.example.recipekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recipekeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddRecipe.setOnClickListener { addRecipe() }
    }
    private fun addRecipe() {

    }
}