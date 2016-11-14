package com.pingan.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // with builder
        HotDryNoodlesWithBuilder noodlesC = new HotDryNoodlesWithBuilder.Builder()
                .withChili()
                .withParsley()
                .build();
        System.out.println("Customer C wants: " + noodlesC);

        HotDryNoodlesWithBuilder noodlesD = new HotDryNoodlesWithBuilder.Builder()
                .withChili()
                .withParsley()
                .withSauerkraut()
                .withShallot()
                .build();
        System.out.println("Customer D wants: " + noodlesD);
    }
}
