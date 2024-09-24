package com.example.simpleapp2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView quantityTextView, priceTextView, ratingText, seekBarValue;
    private Button increment, decrement;
    private CheckBox checkBox1, checkBox2;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    private int quantity = 0;
    private int price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // CheckBoxes
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);

        // RadioGroup
        radioGroup = findViewById(R.id.radioGroup);

        // RatingBar
        ratingBar = findViewById(R.id.ratingBar);
        ratingText = findViewById(R.id.ratingText);

        // SeekBar
        seekBar = findViewById(R.id.seekBar);
        seekBarValue = findViewById(R.id.seekBarValue);

        // Quantity buttons and display
        increment = findViewById(R.id.increment);
        decrement = findViewById(R.id.decrement);
        quantityTextView = findViewById(R.id.quantityTextView);
        priceTextView = findViewById(R.id.priceTextView);

        // CheckBox logic
        checkBox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Toast.makeText(SecondActivity.this, "CheckBox1 is " + (isChecked ? "checked" : "unchecked"), Toast.LENGTH_SHORT).show();
        });

        checkBox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Toast.makeText(SecondActivity.this, "CheckBox2 is " + (isChecked ? "checked" : "unchecked"), Toast.LENGTH_SHORT).show();
        });

        // RadioGroup logic
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            radioButton = findViewById(checkedId);
            Toast.makeText(SecondActivity.this, "Selected: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
        });

        // RatingBar logic
        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> ratingText.setText("Rating: " + rating));

        // SeekBar logic
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarValue.setText("SeekBar Value: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        // Increment and decrement logic
        increment.setOnClickListener(v -> {
            quantity++;
            price = quantity * 250;
            quantityTextView.setText(String.valueOf(quantity));
            priceTextView.setText("Price: $" + price);
        });

        decrement.setOnClickListener(v -> {
            if (quantity > 0) {
                quantity--;
                price = quantity * 250;
                quantityTextView.setText(String.valueOf(quantity));
                priceTextView.setText("Price: $" + price);
            }
        });
    }
}
