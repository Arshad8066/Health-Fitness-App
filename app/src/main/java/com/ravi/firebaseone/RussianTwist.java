package com.ravi.firebaseone;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class RussianTwist extends AppCompatActivity {

    private GifImageView russian_twist_gif;
    private TextView tvrussian_twist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_russian_twist);
        
        russian_twist_gif =findViewById(R.id.russian_twist_gif);
        tvrussian_twist=findViewById(R.id.tvrussian_twist);
    }
}