package com.ravi.firebaseone;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class TricepsDips extends AppCompatActivity {

    private GifImageView triceps_dips_gif;
    private TextView tvtriceps_dips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_dips);


        triceps_dips_gif =findViewById(R.id.triceps_dips_gif);
        tvtriceps_dips=findViewById(R.id.tvtriceps_dips);
    }
}