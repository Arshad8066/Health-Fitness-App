package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Leg_Advanced extends AppCompatActivity {

    private LinearLayout ll_Curtsy_lunges,ll_Jumping_Squats,ll_Glute_kick_back_right,ll_Calf_stretch_left;
    private TextView curtsy_lunges_txt,jumping_squats_txt,glute_kick_back_right_txt,calf_stretch_left_txt;
    private TextView curtsy_lunges_txt1,jumping_squats_txt1,glute_kick_back_right_txt1,calf_stretch_left_txt1;
    private GifImageView curtsy_lunges_gif,jumping_squats_gif,glute_kick_back_right_gif,calf_stretch_left_gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_advanced);


        ll_Curtsy_lunges=findViewById(R.id.ll_Curtsy_lunges);
        curtsy_lunges_txt=findViewById(R.id.curtsy_lunges_txt);
        curtsy_lunges_txt1=findViewById(R.id.curtsy_lunges_txt1);
        curtsy_lunges_gif=findViewById(R.id.curtsy_lunges_gif);


        ll_Jumping_Squats=findViewById(R.id.ll_Jumping_Squats);
        jumping_squats_txt=findViewById(R.id.jumping_squats_txt);
        jumping_squats_txt1=findViewById(R.id.jumping_squats_txt1);
        jumping_squats_gif=findViewById(R.id.jumping_squats_gif);


        ll_Glute_kick_back_right=findViewById(R.id.ll_Glute_kick_back_right);
        glute_kick_back_right_txt=findViewById(R.id.glute_kick_back_right_txt);
        glute_kick_back_right_txt1=findViewById(R.id.glute_kick_back_right_txt1);
        glute_kick_back_right_gif=findViewById(R.id.glute_kick_back_right_gif);


        ll_Calf_stretch_left=findViewById(R.id.ll_Calf_stretch_left);
        calf_stretch_left_txt=findViewById(R.id.calf_stretch_left_txt);
        calf_stretch_left_txt1=findViewById(R.id.calf_stretch_left_txt1);
        calf_stretch_left_gif=findViewById(R.id.calf_stretch_left_gif);



        ll_Curtsy_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent curtsy_lunges_int = new Intent(Leg_Advanced.this,CurtsyLunges.class);
                startActivity(curtsy_lunges_int);
            }
        });



        ll_Jumping_Squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jumping_squats_int = new Intent(Leg_Advanced.this,JumpingSquats.class);
                startActivity(jumping_squats_int);
            }
        });


        ll_Glute_kick_back_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent glute_kick_back_int = new Intent(Leg_Advanced.this,GluteKickBackRight.class);
                startActivity(glute_kick_back_int);
            }
        });


        ll_Calf_stretch_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calf_stretch_left_int = new Intent(Leg_Advanced.this,CalfStretchLeft.class);
                startActivity(calf_stretch_left_int);
            }
        });




    }
}