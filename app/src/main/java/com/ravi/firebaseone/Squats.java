package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Squats extends AppCompatActivity {

    private GifImageView squats_gif;
    private TextView tvsquats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squats);

        squats_gif=findViewById(R.id.squats_gif);
        tvsquats=findViewById(R.id.tvsquats);



    }
}