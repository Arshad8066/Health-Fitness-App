package com.ravi.firebaseone;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class KneePushups extends AppCompatActivity {

    private GifImageView knee_pushups_gif;
    private TextView tv_knee_pushup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knee_pushups);

        knee_pushups_gif=findViewById(R.id.knee_pushups_gif);
        tv_knee_pushup=findViewById(R.id.tv_knee_pushup);
    }
}