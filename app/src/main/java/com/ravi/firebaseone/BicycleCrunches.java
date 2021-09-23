package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class BicycleCrunches extends AppCompatActivity {

    private GifImageView bicycle_crunches_gif;
    private TextView tvbicycle_crunches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle_crunches);


        bicycle_crunches_gif=findViewById(R.id.bicycle_crunches_gif);
        tvbicycle_crunches=findViewById(R.id.tvbicycle_crunches);
    }
}