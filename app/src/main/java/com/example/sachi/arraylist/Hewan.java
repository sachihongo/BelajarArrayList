package com.example.sachi.arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Hewan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        // create an array of words
        ArrayList<String> words = new ArrayList<String>();

        words.add("Singa");
        words.add("Katak");
        words.add("Burung");
        words.add("Ikan");
        words.add("Ular");


        TextView hewan1 = (TextView) findViewById(R.id.hewan1);
        hewan1.setText(words.get(0));

        TextView hewan2 = (TextView) findViewById(R.id.hewan2);
        hewan2.setText(words.get(1));

        TextView hewan3 = (TextView) findViewById(R.id.hewan3);
        hewan3.setText(words.get(2));

        TextView hewan4 = (TextView) findViewById(R.id.hewan4);
        hewan4.setText(words.get(3));

        TextView hewan5 = (TextView) findViewById(R.id.hewan5);
        hewan5.setText(words.get(4));

    }
}
