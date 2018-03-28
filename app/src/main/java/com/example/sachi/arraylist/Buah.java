package com.example.sachi.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Buah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        // create an array of words
        ArrayList<String> words = new ArrayList<String>();

        words.add("Mangga");
        words.add("Apel");
        words.add("Jeruk");
        words.add("Pisang");
        words.add("Semangka");


        TextView buah1 = (TextView) findViewById(R.id.buah1);
        buah1.setText(words.get(0));

        TextView buah2 = (TextView) findViewById(R.id.buah2);
        buah2.setText(words.get(1));

        TextView buah3 = (TextView) findViewById(R.id.buah3);
        buah3.setText(words.get(2));

        TextView buah4 = (TextView) findViewById(R.id.buah4);
        buah4.setText(words.get(3));

        TextView buah5 = (TextView) findViewById(R.id.buah5);
        buah5.setText(words.get(4));





    }
}
