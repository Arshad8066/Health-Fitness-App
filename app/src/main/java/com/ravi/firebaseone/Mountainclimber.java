package com.ravi.firebaseone;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Mountainclimber extends AppCompatActivity {

    private GifImageView mountain_climber_gif;
    private TextView tv_mountain_climber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountainclimber);


        mountain_climber_gif =findViewById(R.id.mountain_climber_gif);

        tv_mountain_climber=findViewById(R.id.tv_mountain_climber);
    }
}