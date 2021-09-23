package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class CobraStretch extends AppCompatActivity {

    private GifImageView cobra_stretch_gif;
    public int counter;
    private TextView tvcobra_stretch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobra_stretch);


        tvcobra_stretch=findViewById(R.id.tvcobra_stretch);
        cobra_stretch_gif=findViewById(R.id.cobra_stretch_gif);

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