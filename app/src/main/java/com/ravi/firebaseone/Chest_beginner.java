package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Chest_beginner extends AppCompatActivity {

    private LinearLayout ll_Incline_pushups,ll_Wide_arm_pushups,ll_Triceps_dips,ll_Knee_pushups,ll_Cobra_stretch,ll_Chest_stretch;
    private TextView incline_pushups_txt,Wide_arm_pushups_txt,Triceps_dips_txt,Knee_pushups_txt,Cobra_stretch_txt,Chest_stretch_txt;
    private GifImageView incline_pushups_gif,Wide_arm_pushups_gif,Triceps_dips_gif,Knee_pushups_gif,Cobra_stretch_gif,Chest_stretch_gif;
    private TextView incline_pushups_txt1,Wide_arm_pushups_txt1,Triceps_dips_txt1,Knee_pushups_txt1,Cobra_stretch_txt1,Chest_stretch_txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_beginner);


       ll_Incline_pushups=findViewById(R.id.ll_Incline_pushup);
        incline_pushups_txt =findViewById(R.id.incline_pushups_txt);
        incline_pushups_txt1 =findViewById(R.id.incline_pushups_txt1);
        incline_pushups_gif= findViewById(R.id.Incline_pushups_gif);


        ll_Wide_arm_pushups = findViewById(R.id.ll_Wide_arm_pushups);
        Wide_arm_pushups_txt =findViewById(R.id.Wide_arm_pushups_txt);
        Wide_arm_pushups_txt1 =findViewById(R.id.Wide_arm_pushups_txt1);
        Wide_arm_pushups_gif =findViewById(R.id.Wide_arm_pushups_gif);


         ll_Triceps_dips =findViewById(R.id.ll_Triceps_dips);
        Triceps_dips_txt =findViewById(R.id.Triceps_dips_txt);
        Triceps_dips_txt1 =findViewById(R.id.Triceps_dips_txt1);

        Triceps_dips_gif =findViewById(R.id.Triceps_dips_gif);


        ll_Knee_pushups=findViewById(R.id.ll_Knee_pushups);
        Knee_pushups_txt=findViewById(R.id.Knee_pushups_txt);
        Knee_pushups_txt1=findViewById(R.id.Knee_pushups_txt1);
        Knee_pushups_gif=findViewById(R.id.Knee_pushups_gif);

       /*ll_Cobra_stretch=findViewById(R.id.ll_Cobra_stretch);
        Cobra_stretch_txt =findViewById(R.id.Cobra_stretch_txt);
        Cobra_stretch_txt1 =findViewById(R.id.Cobra_stretch_txt1);
        Cobra_stretch_gif =findViewById(R.id.Cobra_stretch_gif);*/


      /*ll_Chest_stretch=findViewById(R.id.ll_Chest_stretch);
        Chest_stretch_txt=findViewById(R.id.Chest_stretch_txt);
        Chest_stretch_txt1=findViewById(R.id.Chest_stretch_txt1);
        Chest_stretch_gif=findViewById(R.id.Chest_stretch_gif);*/



        ll_Incline_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Incline_push_int = new Intent(Chest_beginner.this,InclinePushups.class);
                startActivity(Incline_push_int);
            }
        });

        ll_Wide_arm_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Wide_arm_pushups_int = new Intent(Chest_beginner.this,Wide_Arm_pushups.class);
                startActivity(Wide_arm_pushups_int);
            }
        });

        ll_Triceps_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Triceps_dips_int = new Intent(Chest_beginner.this,TricepsDips.class);
                startActivity(Triceps_dips_int);
            }
        });


        ll_Knee_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Knee_pushups_int = new Intent(Chest_beginner.this,KneePushups.class);
                startActivity(Knee_pushups_int);
            }
        });

       /* ll_Cobra_stretch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cobra_stretch_int = new Intent(Chest_beginner.this,CobraStretch.class);
                startActivity(Cobra_stretch_int);
            }
        });*/

     /*   ll_Chest_stretch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Chest_stretch_int = new Intent(Chest_beginner.this,ChestStretch.class);
                startActivity(Chest_stretch_int);
            }
        });*/

    }
}