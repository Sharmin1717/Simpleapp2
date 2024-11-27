package com.example.simpleapp2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_description);

        ImageView productImage = findViewById(R.id.productImage);
        TextView productTitle = findViewById(R.id.productTitle);
        TextView productDescription = findViewById(R.id.productDescription);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        int imageId = getIntent().getIntExtra("image", 0);

        productImage.setImageResource(imageId);
        productTitle.setText(name);
        productDescription.setText(description);
    }
}
