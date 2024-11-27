package com.example.simpleapp2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductRecyclerViewActivity extends AppCompatActivity {

    RecyclerView productRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_recycler_view);

        productRecyclerView = findViewById(R.id.productRecyclerView);
        productRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "High-performance laptop", R.drawable.laptop, 1200.99));
        products.add(new Product("Smartphone", "Latest Android smartphone", R.drawable.smartphone, 799.99));
        products.add(new Product("Headphones", "Noise-cancelling headphones", R.drawable.headphone, 199.99));

        ProductRecyclerViewAdapter adapter = new ProductRecyclerViewAdapter(products, this);
        productRecyclerView.setAdapter(adapter);
    }
}
