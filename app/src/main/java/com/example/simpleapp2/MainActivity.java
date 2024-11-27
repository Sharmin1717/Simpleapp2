package com.example.simpleapp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare buttons for navigation
    private Button openSecondActivity, openFormActivity, openFoodActivity, openFoodCategoriesActivity, openProductRecyclerViewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        openSecondActivity = findViewById(R.id.openSecondActivity);
        openFormActivity = findViewById(R.id.openFormActivity);
        openFoodActivity = findViewById(R.id.openFoodActivity);
        openFoodCategoriesActivity = findViewById(R.id.openFoodCategoriesActivity);
        openProductRecyclerViewActivity = findViewById(R.id.openProductRecyclerViewActivity);

        // Set listeners for buttons

        // Navigate to SecondActivity
        openSecondActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        // Navigate to FormActivity
        openFormActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FormActivity.class);
            startActivity(intent);
        });

        // Navigate to FoodActivity (ListView)
        openFoodActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FoodActivity.class);
            startActivity(intent);
        });

        // Navigate to FoodCategoriesActivity (ExpandableListView)
        openFoodCategoriesActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FoodCategoriesActivity.class);
            startActivity(intent);
        });

        // Navigate to ProductRecyclerViewActivity (RecyclerView)
        openProductRecyclerViewActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProductRecyclerViewActivity.class);
            startActivity(intent);
        });
    }
}
