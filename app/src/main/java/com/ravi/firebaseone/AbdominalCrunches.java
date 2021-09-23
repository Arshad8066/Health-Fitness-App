package com.ravi.firebaseone;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class AbdominalCrunches extends AppCompatActivity {

    private GifImageView abdominal_crunches_gif;
    private TextView tvabdo_crunches;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdominal_crunches);


        tvabdo_crunches =findViewById(R.id.tvabdo_crunches);
        abdominal_crunches_gif =findViewById(R.id.abdominal_crunhes_gif);
 
    }
}