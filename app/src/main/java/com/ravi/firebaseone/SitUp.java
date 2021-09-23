package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class SitUp extends AppCompatActivity {

    private GifImageView sit_ups_gif;
    private TextView tvsit_ups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sit_up);


        sit_ups_gif=findViewById(R.id.sit_ups_gif);
        tvsit_ups =findViewById(R.id.tvsit_ups);
    }
}