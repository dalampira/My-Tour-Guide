package com.example.android.mytourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class ArrangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_arrange);

        // Find the View that shows the numbers category
        LinearLayout city_info = (LinearLayout) findViewById(R.id.city_info);

        // Set a click listener on that View
        city_info.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CityInfoActivity}
                Intent cityInfoIntent = new Intent(ArrangeActivity.this, CityInfoActivity.class);

                // Start the new activity
                startActivity(cityInfoIntent);
            }
        });

        // Find the View that shows the family category
        LinearLayout where_to_go = (LinearLayout) findViewById(R.id.where_to_go);

        // Set a click listener on that View
        where_to_go.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WhereToGoActivity}
                Intent whereToGoIntent = new Intent(ArrangeActivity.this, WhereToGoActivity.class);

                // Start the new activity
                startActivity(whereToGoIntent);
            }
        });

        // Find the View that shows the colors category
        LinearLayout what_to_eat = (LinearLayout) findViewById(R.id.what_to_eat);

        // Set a click listener on that View
        what_to_eat.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WhatToEatActivity}
                Intent whatToEatIntent = new Intent(ArrangeActivity.this, WhatToEatActivity.class);

                // Start the new activity
                startActivity(whatToEatIntent);
            }
        });

        // Find the View that shows the phrases category
        LinearLayout city_songs = (LinearLayout) findViewById(R.id.city_songs);

        // Set a click listener on that View
        city_songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CitySongsActivity}
                Intent citySongsIntent = new Intent(ArrangeActivity.this, CitySongsActivity.class);

                // Start the new activity
                startActivity(citySongsIntent);
            }
        });
    }
}

