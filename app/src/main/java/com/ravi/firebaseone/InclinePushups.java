package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class InclinePushups extends AppCompatActivity {

    private GifImageView incline_pushups_gif;
    private TextView tv_incline_pushup;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incline_pushups);

        incline_pushups_gif=findViewById(R.id.incline_pushups_gif);
        tv_incline_pushup=findViewById(R.id.tv_incline_pushup);


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