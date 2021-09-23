package com.ravi.firebaseone;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Wide_Arm_pushups extends AppCompatActivity {

    private GifImageView wide_arm_pushups_gif;
    private TextView tvwide_arm_pushups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wide_arm_pushups);

        wide_arm_pushups_gif =findViewById(R.id.wide_arm_pushups_gif);
        tvwide_arm_pushups=findViewById(R.id.tvwide_arm_pushups);

    }
}