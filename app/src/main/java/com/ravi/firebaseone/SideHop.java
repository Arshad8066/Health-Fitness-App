package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class SideHop extends AppCompatActivity {

    private GifImageView side_hop_gif;
    private int counter;
    private TextView tvside_hop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_hop);

        side_hop_gif=findViewById(R.id.side_hop_gif);
        tvside_hop=findViewById(R.id.tvside_hop);



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