package com.ravi.firebaseone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;

public class Leg_beginner extends AppCompatActivity {

    private LinearLayout ll_Side_hop,ll_Squats,ll_Side_lying_leg,ll_Backward_lunge;
    private TextView side_hop_txt,squats_txt,side_lying_leg_txt,backward_lunge_txt;
    private GifImageView side_hop_gif,squats_gif,side_lying_leg_gif,backward_lunge_gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_beginner);


        ll_Side_hop =findViewById(R.id.ll_Side_hop);
        side_hop_txt =findViewById(R.id.side_hop_txt);
        side_hop_gif =findViewById(R.id.side_hop_gif);


        ll_Squats =findViewById(R.id.ll_Squats);
        squats_txt=findViewById(R.id.squats_txt);
        squats_gif=findViewById(R.id.squats_gif);


        ll_Side_lying_leg =findViewById(R.id.ll_Side_lying_leg);
        side_lying_leg_txt=findViewById(R.id.side_lying_leg_txt);
        side_lying_leg_gif=findViewById(R.id.side_lying_leg_gif);


        ll_Backward_lunge =findViewById(R.id.ll_Backward_lunge);
        backward_lunge_txt=findViewById(R.id.backward_lunge_txt);
        backward_lunge_gif=findViewById(R.id.backward_lunge_gif);



        ll_Side_hop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent side_hop_int =new Intent(Leg_beginner.this,SideHop.class);
                startActivity(side_hop_int);
            }
        });

        ll_Squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent squats_int= new Intent(Leg_beginner.this,Squats.class);
                startActivity(squats_int);
            }
        });

        ll_Side_lying_leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent side_lying_leg_int =new Intent(Leg_beginner.this,SideLyingLeg.class);
                startActivity(side_lying_leg_int);
            }
        });

        ll_Backward_lunge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backward_lunge_int = new Intent(Leg_beginner.this,BackwardLunge.class);
                startActivity(backward_lunge_int);
            }
        });
    }
}