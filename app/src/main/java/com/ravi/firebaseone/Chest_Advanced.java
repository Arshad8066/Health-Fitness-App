package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import pl.droidsonroids.gif.GifImageView;

public class Chest_Advanced extends AppCompatActivity {

    private LinearLayout ll_Burpees,ll_Diamond_push_up,ll_Box_pushup,ll_Spiderman_push_up;
    private TextView burpees_txt,Diamond_push_up_txt,box_up_pushtxt,spiderman_push_up_txt;
    private TextView burpees_txt1,Diamond_push_up_txt1,box_up_pushtxt1,spiderman_push_up_txt1;
    private GifImageView burpees_gif,Diamond_push_up_gif,box_up_pushgif,spiderman_push_up_gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_advanced);


        ll_Burpees=findViewById(R.id.ll_Burpees);
        burpees_txt=findViewById(R.id.burpees_txt);
        burpees_txt1=findViewById(R.id.burpees_txt1);
        burpees_gif=findViewById(R.id.burpees_gif);


        ll_Diamond_push_up=findViewById(R.id.ll_Diamond_push_up);
        Diamond_push_up_txt=findViewById(R.id.Diamond_push_up_txt);
        Diamond_push_up_txt1=findViewById(R.id.Diamond_push_up_txt1);
        Diamond_push_up_gif=findViewById(R.id.Diamond_push_up_gif);

        ll_Box_pushup=findViewById(R.id.ll_Box_pushup);
        box_up_pushtxt=findViewById(R.id.box_pushup_txt);
        box_up_pushtxt1=findViewById(R.id.box_pushup_txt1);
        box_up_pushgif=findViewById(R.id.box_pushup_gif);


        ll_Spiderman_push_up=findViewById(R.id.ll_Spiderman_push_up);
        spiderman_push_up_txt=findViewById(R.id.spiderman_push_up_txt);
        spiderman_push_up_txt1=findViewById(R.id.spiderman_push_up_txt1);
        spiderman_push_up_gif=findViewById(R.id.spiderman_push_up_gif);


        ll_Burpees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent burpees_int =new Intent(Chest_Advanced.this,Burpees.class);
                startActivity(burpees_int);
            }
        });

        ll_Diamond_push_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Diamond_pushup_int =new Intent(Chest_Advanced.this,DiamondPushup.class);
                startActivity(Diamond_pushup_int);
            }
        });


        ll_Box_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Box_pushup_int =new Intent(Chest_Advanced.this,BoxPushup.class);
                startActivity(Box_pushup_int);
            }
        });


        ll_Spiderman_push_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Spiderman_push_up_int =new Intent(Chest_Advanced.this,SpidermanPushup.class);
                startActivity(Spiderman_push_up_int);
            }
        });






    }
}