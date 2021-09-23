package com.ravi.firebaseone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Abs_beginner extends AppCompatActivity {

    private LinearLayout ll_jumping_jack,ll_abdominal_crunches,ll_Russian_twist,ll_Mountain_climber,ll_Leg_raises,ll_Plank;
    private TextView jumping_jack_txt,abdominal_crunches_txt,russian_twist_txt,mountain_climber_txt,leg_raises_txt,plank_txt;
    private GifImageView jumping_jack_gif,abdominal_crunches_gif,russian_twist_gif,mountain_climber_gif,leg_raises_gif,plank_gif;
    private TextView jumping_jack_txt1,abdominal_crunches_txt1,russian_twist_txt1,mountain_climber_txt1,leg_raises_txt1,plank_txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_beginner);

        ll_jumping_jack =findViewById(R.id.ll_jumping_jack);
        jumping_jack_txt = findViewById(R.id.jumping_jacks_txt);
        jumping_jack_txt1 = findViewById(R.id.jumping_jacks_txt1);
        jumping_jack_gif = findViewById(R.id.jumping_jacks_gif);

        ll_abdominal_crunches =findViewById(R.id.ll_Abdominal_crunhes);
        abdominal_crunches_txt = findViewById(R.id.Abdominal_crunhes_txt);
        abdominal_crunches_txt1 = findViewById(R.id.Abdominal_crunhes_txt1);
        abdominal_crunches_gif =findViewById(R.id.Abdominal_crunhes_gif);

        ll_Russian_twist = findViewById(R.id.ll_Russian_twist);
        russian_twist_txt =findViewById(R.id.Russian_twist_txt);
        russian_twist_txt1 =findViewById(R.id.Russian_twist_txt1);
        russian_twist_gif =findViewById(R.id.Russian_twist_gif);


        ll_Mountain_climber =findViewById(R.id.ll_Mountain_climber);
        mountain_climber_txt =findViewById(R.id.Mountain_climber_txt);
        mountain_climber_txt1 =findViewById(R.id.Mountain_climber_txt1);
        mountain_climber_gif = findViewById(R.id.Mountain_climber_gif);

        ll_Leg_raises = findViewById(R.id.ll_Leg_raises);
        leg_raises_txt = findViewById(R.id.Leg_raises_txt);
        leg_raises_txt1 = findViewById(R.id.Leg_raises_txt1);
        leg_raises_gif=findViewById(R.id.Leg_raises_gif);


        ll_Plank =findViewById(R.id.ll_Plank);
        plank_txt =findViewById(R.id.Plank_txt);
        plank_txt1 =findViewById(R.id.Plank_txt1);
        plank_gif =findViewById(R.id.Plank_gif);

        ll_jumping_jack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent jumping_jack_int =new Intent(Abs_beginner.this,Jumpingjack.class);
                startActivity(jumping_jack_int);
            }
        });

        ll_abdominal_crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abdominal_crunches_int =new Intent(Abs_beginner.this,AbdominalCrunches.class);
                startActivity(abdominal_crunches_int);
            }
        });

        ll_Russian_twist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent russian_twist_int =new Intent(Abs_beginner.this,RussianTwist.class);
                startActivity(russian_twist_int);
            }
        });
        ll_Mountain_climber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mountain_climber_int =new Intent(Abs_beginner.this,Mountainclimber.class);
                startActivity(mountain_climber_int);
            }
        });

        ll_Leg_raises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leg_raises_int =new Intent(Abs_beginner.this,Legraises.class);
                startActivity(leg_raises_int);
            }
        });

        ll_Plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent plank_int =new Intent(Abs_beginner.this,Plank.class);
                startActivity(plank_int);
            }
        });



    }
}