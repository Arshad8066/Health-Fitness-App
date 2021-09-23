package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class CalfStretchLeft extends AppCompatActivity {



    private int counter;
    private GifImageView calf_stretch_left_gif;
    private TextView tvcalf_stretch_left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calf_stretch_left);

        calf_stretch_left_gif=findViewById(R.id.calf_stretch_left_gif);
        tvcalf_stretch_left =findViewById(R.id.tvcalf_stretch_left);






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