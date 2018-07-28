package com.example.android.mytourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        RelativeLayout introLayout = (RelativeLayout) findViewById(R.id.intro_layout);

        // Set a click listener on that View
        introLayout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CityInfoActivity}
                Intent arrangeIntent = new Intent(MainActivity.this, ArrangeActivity.class);

                // Start the new activity
                startActivity(arrangeIntent);
            }
        });


    }
}
