package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class BackwardLunge extends AppCompatActivity {

    private GifImageView backward_lunge_gif;
    private TextView tvbackward_lunge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backward_lunge);


        backward_lunge_gif = findViewById(R.id.backward_lunge_gif);
        tvbackward_lunge = findViewById(R.id.tvbackward_lunge);
    }


}