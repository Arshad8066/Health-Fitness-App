package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Jumpingjack extends AppCompatActivity {

    private GifImageView jumping_jacks_gif ;
    private int counter;
    private TextView tvjumping_jack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumpingjack);







            tvjumping_jack=findViewById(R.id.tvjumping_jack);
            jumping_jacks_gif=findViewById(R.id.jumping_jacks_gif);

            final TextView counttime=findViewById(R.id.counttime);
            new CountDownTimer(20000,1000) {
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