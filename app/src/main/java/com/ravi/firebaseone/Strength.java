package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Strength extends AppCompatActivity {

//    private Button btnstr;
    private GifImageView str_gif;
    public int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength);

//        btnstr = findViewById(R.id.buttonstr);
        str_gif = findViewById(R.id.strength_gif);
        final TextView counttime=findViewById(R.id.counttime);
        new CountDownTimer(50000,1000) {
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