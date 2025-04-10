package com.example.reciyle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MakananDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_detail);

        ImageView makananImage = findViewById(R.id.makananDetailImage);
        TextView makananName = findViewById(R.id.makananDetailNama);
        TextView makananRating = findViewById(R.id.makananDetailRating);
        TextView makananPrice = findViewById(R.id.makananDetailPrice);
        TextView makananAge = findViewById(R.id.makananDetailFrom);

        Intent intent = getIntent();
        makananName.setText(intent.getStringExtra("NAME"));
        makananRating.setText("Rating " + intent.getFloatExtra("RATING", 0));
        makananPrice.setText("Harga: " + intent.getStringExtra("PRICE"));
        makananAge.setText("Asal Makanan: " + intent.getStringExtra("FROM"));
        makananImage.setImageResource(intent.getIntExtra("IMAGE", R.drawable.satekerbau));
    }
}