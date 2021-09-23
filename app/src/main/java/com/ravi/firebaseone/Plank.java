package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Plank extends AppCompatActivity {

    private GifImageView plank_gif;
    private int counter;
    private TextView tvplank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank);


        plank_gif =findViewById(R.id.plank_gif);
        tvplank=findViewById(R.id.tvplank);


        final TextView counttime=findViewById(R.id.counttime);
        new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counttime.setText(String.valueOf(counter));
                counter++;
            }
            @Override
            public void onFinish() {
                counttime.setText("Finished");
            }
        }.start();
    }
}