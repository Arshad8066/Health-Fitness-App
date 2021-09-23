package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class ButtBridge extends AppCompatActivity {

    private GifImageView butt_bridge_gif;
    private TextView tvbutt_bridge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butt_bridge);

        butt_bridge_gif=findViewById(R.id.butt_bridge_gif);
        tvbutt_bridge=findViewById(R.id.tvbutt_bridge);
    }
}