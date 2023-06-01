package com.example.recipekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.recipekeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddRecipe.setOnClickListener {
            var textInRecipeName = binding.edtRecipeName.text.toString()
            var textInIngredients = binding.edtIngredients.text.toString()
            var textInIstructions = binding.edtInstructions.text.toString()
            binding.txtViewRecipeArea.text = "Recipe Name:\n$textInRecipeName\n\nIngredients:\n$textInIngredients\n\nInstructions:\n$textInIstructions"
        }

        binding.btnAddIngredients.setOnClickListener {
            var textInRecipeName = binding.edtRecipeName.text.toString()
            var textInIngredients = binding.edtIngredients.text.toString()
            var textInIstructions = binding.edtInstructions.text.toString()
            binding.txtViewRecipeArea.text = "Recipe Name:\n$textInRecipeName\n\nIngredients:\n$textInIngredients\n\nInstructions:\n$textInIstructions"
        }

        binding.btnAddInstructions.setOnClickListener {
            var textInRecipeName = binding.edtRecipeName.text.toString()
            var textInIngredients = binding.edtIngredients.text.toString()
            var textInIstructions = binding.edtInstructions.text.toString()
            binding.txtViewRecipeArea.text = "Recipe Name:\n$textInRecipeName\n\nIngredients:\n$textInIngredients\n\nInstructions:\n$textInIstructions"
        }

        binding.btnClear.setOnClickListener {
            binding.edtRecipeName.text = null
            binding.edtIngredients.text = null
            binding.edtInstructions.text = null
            binding.txtViewRecipeArea.text = null
        }

        binding.btnSaveRecipe.setOnClickListener {
            //variables declaration
            var isAllEditTextWithInput = true
            var toastText = ""
            //checking if editTexts have input
            if (binding.edtRecipeName.text.isNullOrEmpty()) {
                isAllEditTextWithInput = false
            }
            if ((binding.edtInstructions.text.isNullOrEmpty())) {
                isAllEditTextWithInput = false
            }
            if (binding.edtIngredients.text.isNullOrEmpty()) {
                isAllEditTextWithInput = false
            }
            //toast setup and display
            if (isAllEditTextWithInput) {
                toastText = "Recipe Saved"
            } else {
                toastText = "Please complete all Required Information"
            }
            val toast = Toast.makeText(this, toastText, 5)
            toast.show()
        }
    }
}