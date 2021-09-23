package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class SideLyingLeg extends AppCompatActivity {

    private GifImageView side_lying_leg_gif;
    private TextView tvside_lying_leg_lift;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_lying_leg);


        side_lying_leg_gif=findViewById(R.id.side_lying_leg_gif);
        tvside_lying_leg_lift =findViewById(R.id.tvside_lying_leg_lift);




    }
}