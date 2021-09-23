package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class DiamondPushup extends AppCompatActivity {

    private GifImageView diamond_push_up_gif;
    private TextView tvdiamond_push_ups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diamond_pushup);


        diamond_push_up_gif=findViewById(R.id.diamond_push_up_gif);
        tvdiamond_push_ups=findViewById(R.id.tvdiamond_push_ups);

    }
}