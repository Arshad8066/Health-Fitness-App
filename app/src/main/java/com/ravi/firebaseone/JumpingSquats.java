package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import pl.droidsonroids.gif.GifImageView;

public class JumpingSquats extends AppCompatActivity {

    private GifImageView jumping_squats_gif;
    private TextView tvjumping_squats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumping_squats);



        jumping_squats_gif = findViewById(R.id.jumping_squats_gif);
        tvjumping_squats = findViewById(R.id.tvjumping_squats);
        
        
    }
}