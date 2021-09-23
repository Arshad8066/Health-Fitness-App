package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class CurtsyLunges extends AppCompatActivity {

    private GifImageView curtsy_lunges_gif;
    private TextView tvcurtsy_lunges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curtsy_lunges);



        curtsy_lunges_gif = findViewById(R.id.curtsy_lunges_gif);
        tvcurtsy_lunges= findViewById(R.id.tvcurtsy_lunges);
        
        
        
        
    }
}