package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class BoxPushup extends AppCompatActivity {

    private GifImageView box_push_up_gif;
    private TextView tvbox_push_ups;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box_pushup);

        box_push_up_gif=findViewById(R.id.box_push_up_gif);
        tvbox_push_ups=findViewById(R.id.tvbox_push_ups);

    }
}