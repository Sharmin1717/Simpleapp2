package com.example.simpleapp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast; // Corrected import statement
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button openSecondActivity;
    private Button clickHereButton;
    private Button openFormActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button to open the second activity
        openSecondActivity = findViewById(R.id.openSecondActivity);
        clickHereButton = findViewById(R.id.button); // Reference to "Click Here" button
        openFormActivity = findViewById(R.id.openFormActivity); // Add reference to the FormActivity button

        openSecondActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        // Set a toast message for the "Click Here" button
        clickHereButton.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button clicked!", Toast.LENGTH_SHORT).show();
        });

        openFormActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FormActivity.class);
            startActivity(intent);
        });
    }
}
