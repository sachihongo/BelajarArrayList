package com.example.sachi.arraylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the buah category
        Button btnBuah = (Button) findViewById(R.id.btnBuah);

        // Set a click listener on that View
        btnBuah.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the buah activity
                Intent buahIntent = new Intent(MainActivity.this, Buah.class);

                // Start the new activity
                startActivity(buahIntent);
            }
        });



        // Find the View that shows the hewan category
        Button btnHewan = (Button) findViewById(R.id.btnHewan);

        // Set a click listener on that View
        btnHewan.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the hewan activity
                Intent hewanIntent = new Intent(MainActivity.this,Hewan.class);

                // Start the new activity
                startActivity(hewanIntent);
            }
        });

    }
}
