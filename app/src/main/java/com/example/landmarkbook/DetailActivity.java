package com.example.landmarkbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkNameText = findViewById(R.id.landmarkNameText);
        TextView countryNameText = findViewById(R.id.countryNameText);

        Intent intent = getIntent();
        String landmarkName = intent.getStringExtra("landmark");
        landmarkNameText.setText(landmarkName);
        String countryName = intent.getStringExtra("country");
        countryNameText.setText(countryName);

        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());

        //imageView.setImageBitmap(selectedImage);

    }
}
