package com.example.recipemanager

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class AddRecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipe)

        val spCategory = findViewById<Spinner>(R.id.spCategory)

        val categories = listOf(
            "Main dishes",
            "Desserts",
            "Salads",
            "Soups",
            "Breakfast",
            "Other"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            categories
        )

        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        spCategory.adapter = adapter

        val btnCancel = findViewById<Button>(R.id.btnCancel)

        btnCancel.setOnClickListener {
            finish()
        }

        val btnSaveRecipe = findViewById<Button>(R.id.btnSaveRecipe)

        btnSaveRecipe.setOnClickListener {
            // We will implement saving in the next stage.
        }
    }
}
