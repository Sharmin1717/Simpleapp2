package com.example.simpleapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button openSecondActivity;
    private Button clickHereButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button to open the second activity
        openSecondActivity = findViewById(R.id.openSecondActivity);
        clickHereButton = findViewById(R.id.button); // Reference to "Click Here" button

        openSecondActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        // Set a toast message for the "Click Here" button
        clickHereButton.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button clicked!", Toast.LENGTH_SHORT).show();
        });
    }
}
