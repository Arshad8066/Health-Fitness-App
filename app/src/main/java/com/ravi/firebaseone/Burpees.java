package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Burpees extends AppCompatActivity {

    private GifImageView burpees_gif;
    private TextView tvburpees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burpees);


        burpees_gif=findViewById(R.id.burpees_gif);
        tvburpees =findViewById(R.id.tvburpees);
    }
}