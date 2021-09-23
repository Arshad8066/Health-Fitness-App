package com.ravi.firebaseone;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.annotations.NotNull;
import com.ravi.firebaseone.Activities.Rating.RatingActivity;

public class MainActivity extends AppCompatActivity implements Mainadapter.OnClick {

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyFitnessData[] myFitnessData = new MyFitnessData[]{
               // new MyFitnessData("Strength",R.drawable.strength),
                new MyFitnessData("CHEST BEGINNER",R.drawable.chest),
                new MyFitnessData("ABS BEGINNER",R.drawable.abs),
                new MyFitnessData("LEG BEGINNER",R.drawable.leg),
                new MyFitnessData("ABS ADVANCED",R.drawable.abs),
                new MyFitnessData("CHEST ADVANCED",R.drawable.chest),

                new MyFitnessData("LEG ADVANCED",R.drawable.leg),
                new MyFitnessData("Bodybuilding",R.drawable.bodybuilding),

        };



            Mainadapter mainadapter = new Mainadapter(myFitnessData,MainActivity.this,MainActivity.this);
            recyclerView.setAdapter(mainadapter);

        bottomNavigationView = findViewById(R.id.bottomnav);
        frameLayout = findViewById(R.id.framlayout);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NotNull MenuItem item) {



                switch (item.getItemId()){

                    case R.id.home_dash:
                        Intent home_dash = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(home_dash);
                        break;



                    //setFragment(new DashboardActivity);

//                        return true;




//                    case R.id.person:
//                        setFragment(new personfragment());
//                        return true;

                case R.id.bmi_cal:
                    Intent bmi_int = new Intent(MainActivity.this, Bmicalculator.class);
                    startActivity(bmi_int);
//                        //setFragment();
                    break;




                    case R.id.rating:
                        Intent person = new Intent(MainActivity.this, RatingActivity.class);
                        startActivity(person);
//                        //setFragment();
                        break;



                    default:
                          return false;
                }


                return false;
            }
        });

    }

    @Override
    public void OnClickListener(int position) {
        switch (position) {
            //  case 0:

            // Intent stren_int = new Intent(MainActivity.this, Strength.class);
            // MainActivity.this.startActivity(stren_int);
            //  break;

            case 0:
                Intent chest_int =new Intent(MainActivity.this,Chest_beginner.class);
                startActivity(chest_int);
                break;

            case 1:
                Intent Abs_int= new Intent(MainActivity.this,Abs_beginner.class);
                startActivity(Abs_int);
                break;

            case 2:
                Intent Leg_int =new Intent(MainActivity.this,Leg_beginner.class);
                startActivity(Leg_int);
                break;

            case 3:
                Intent Abs_adv =new Intent(MainActivity.this,Abs_Advanced.class);
                startActivity(Abs_adv);
                break;

            case 4:
                Intent chest_adv =new Intent(MainActivity.this,Chest_Advanced.class);

                startActivity(chest_adv);
                break;

            case 5:
                Intent Leg_adv = new Intent(MainActivity.this,Leg_Advanced.class);
                startActivity(Leg_adv);
                break;
        }

    }


}



