package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class SpidermanPushup extends AppCompatActivity {

    private GifImageView spiderman_push_up_gif;
    private TextView tvspiderman_push_ups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman_pushup);


        spiderman_push_up_gif=findViewById(R.id.spiderman_push_up_gif);
        tvspiderman_push_ups=findViewById(R.id.tvspiderman_push_ups);

    }
}