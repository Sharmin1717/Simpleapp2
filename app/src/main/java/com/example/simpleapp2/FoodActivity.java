package com.example.simpleapp2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {

    ListView foodListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        foodListView = findViewById(R.id.foodListView);

        String[] foodTitles = {
                "Pizza", "Burger", "Pasta"
        };

        String[] foodDescriptions = {
                "Cheesy and delicious pizza", "Juicy beef burger", "Creamy pasta"
        };

        FoodAdapter foodAdapter = new FoodAdapter(this, foodTitles, foodDescriptions);
        foodListView.setAdapter(foodAdapter);
    }
}
