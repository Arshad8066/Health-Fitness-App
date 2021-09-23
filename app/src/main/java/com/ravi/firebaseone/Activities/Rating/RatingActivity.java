package com.ravi.firebaseone.Activities.Rating;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ravi.firebaseone.R;

public class RatingActivity extends AppCompatActivity
{
    Button buttonGetRatingBarResult;
    RatingBar ratingBar;
    TextView ratingBarResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        ratingBarResult= findViewById(R.id.ratingBarResult);
        ratingBar = findViewById(R.id.ratingBar);
        buttonGetRatingBarResult = findViewById(R.id.buttonGetRatingBarResult);

        buttonGetRatingBarResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float result = ratingBar.getRating();

                SharedPreferences share = getSharedPreferences("star", MODE_PRIVATE);
                SharedPreferences.Editor editor = share.edit();

                editor.putString("str", String.valueOf(result));
                editor.apply();
                ratingBarResult.setText(String.valueOf(result));
            }
        });

        SharedPreferences getshared = getSharedPreferences("star", MODE_PRIVATE);
        String stri = getshared.getString("str", "0.0");
        ratingBarResult.setText(stri);
        ratingBar.setRating(Float.parseFloat(stri));
    }
}