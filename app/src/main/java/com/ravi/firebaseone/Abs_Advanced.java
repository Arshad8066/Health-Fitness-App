package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Abs_Advanced extends AppCompatActivity {

    private LinearLayout ll_Sit_ups,ll_Bicycle_crunches,ll_V_up,ll_Butt_bridge;
    private TextView sit_ups_txt,bicycle_crunches_txt,v_up_txt,butt_bridge_txt;
    private TextView sit_ups_txt1,bicycle_crunches_txt1,v_up_txt1,butt_bridge_txt1;
    private GifImageView sit_ups_gif,bicycle_crunches_gif,v_up_gif,butt_bridge_gif;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_advanced);





        ll_Sit_ups=findViewById(R.id.ll_Sit_ups);
        sit_ups_txt=findViewById(R.id.sit_ups_txt);
        sit_ups_txt1=findViewById(R.id.sit_ups_txt1);
        sit_ups_gif=findViewById(R.id.sit_ups_gif);


        ll_Bicycle_crunches=findViewById(R.id.ll_Bicycle_crunches);
        bicycle_crunches_txt=findViewById(R.id.bicycle_crunches_txt);
        bicycle_crunches_txt1=findViewById(R.id.bicycle_crunches_txt1);
        bicycle_crunches_gif=findViewById(R.id.bicycle_crunches_gif);


        ll_V_up=findViewById(R.id.ll_V_up);
        v_up_txt=findViewById(R.id.v_up_txt);
        v_up_txt1=findViewById(R.id.v_up_txt1);
        v_up_gif=findViewById(R.id.v_up_gif);

        ll_Butt_bridge=findViewById(R.id.ll_Butt_bridge);
        butt_bridge_txt=findViewById(R.id.butt_bridge_txt);
        butt_bridge_txt1=findViewById(R.id.butt_bridge_txt1);
        butt_bridge_gif=findViewById(R.id.butt_bridge_gif);



        ll_Sit_ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sit_up_int = new Intent(Abs_Advanced.this,SitUp.class);
                startActivity(Sit_up_int);

            }
        });


        ll_Bicycle_crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bicycle_crunches_int = new Intent(Abs_Advanced.this,BicycleCrunches.class);
                startActivity(Bicycle_crunches_int);

            }
        });


        ll_V_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent V_up_int = new Intent(Abs_Advanced.this,VUp.class);
                startActivity(V_up_int);

            }
        });


        ll_Butt_bridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Butt_Bridges_int = new Intent(Abs_Advanced.this,ButtBridge.class);
                startActivity(Butt_Bridges_int);

            }
        });
    }
}