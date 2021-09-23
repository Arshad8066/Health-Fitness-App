package com.ravi.firebaseone;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Legraises extends AppCompatActivity {

    private GifImageView leg_raises_gif;
    private TextView tv_leg_raise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legraises);
        //setContentView(R.layout.activity_bicycle_crunches);

        leg_raises_gif = findViewById(R.id.leg_raises_gif);
        tv_leg_raise=findViewById(R.id.tv_leg_raise);

    }
}