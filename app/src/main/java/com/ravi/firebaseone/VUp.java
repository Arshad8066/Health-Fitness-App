package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class VUp extends AppCompatActivity {

    private GifImageView v_up_gif;
    private TextView tv_vups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vup);


        v_up_gif=findViewById(R.id.v_up_gif);
        tv_vups=findViewById(R.id.tv_vups);
    }
}