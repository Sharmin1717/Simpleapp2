package com.example.simpleapp2;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FoodCategoriesActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    FoodExpandableListAdapter adapter;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_categories);

        expandableListView = findViewById(R.id.expandableListView);

        // Prepare data for the ExpandableListView
        prepareListData();

        // Set the adapter
        adapter = new FoodExpandableListAdapter(this, listDataHeader, listDataChild);
        expandableListView.setAdapter(adapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        // Adding headers
        listDataHeader.add("Fruits");
        listDataHeader.add("Vegetables");

        // Adding child data
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Broccoli");

        // Adding child data to respective headers
        listDataChild.put(listDataHeader.get(0), fruits);
        listDataChild.put(listDataHeader.get(1), vegetables);
    }
}
