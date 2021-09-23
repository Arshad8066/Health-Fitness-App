package com.ravi.firebaseone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.L;

public class Mainadapter extends RecyclerView.Adapter<Mainadapter.ViewHolder> {


    MyFitnessData[]  myFitnessData;
    Context context;
    private OnClick onClick;

    public Mainadapter(MyFitnessData[] myFitnessData, MainActivity activity,OnClick onClick) {
        this.myFitnessData = myFitnessData;
        this.context = activity;
        this.onClick =onClick;

    }

    @NonNull
//    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fitness_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    public interface  OnClick{
        void OnClickListener(int position);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyFitnessData myFitnessDataList = myFitnessData[position];
        holder.txtViewName.setText(myFitnessDataList.getExerName());
//        holder.txtViewDuration.setText(myFitnessDataList.getExerDuration());
        holder.exerImage.setImageResource(myFitnessDataList.getExerImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onClick!=null){
                    onClick.OnClickListener(holder.getAdapterPosition());
                }
            }
        });


       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myFitnessDataList.getExerName(), Toast.LENGTH_SHORT).show();
                switch (position) {
                  //  case 0:

                   // Intent stren_int = new Intent(context, Strength.class);
                   // context.startActivity(stren_int);
                  //  break;

                    case 0:
                        Intent chest_int =new Intent(context,Chest_beginner.class);
                        context.startActivity(chest_int);
                        break;

                    case 1:
                        Intent Abs_int= new Intent(context,Abs_beginner.class);
                        context.startActivity(Abs_int);
                        break;

                    case 2:
                        Intent Leg_int =new Intent(context,Leg_beginner.class);
                        context.startActivity(Leg_int);
                        break;

                    case 3:
                        Intent Abs_adv =new Intent(context,Abs_Advanced.class);
                        context.startActivity(Abs_adv);
                        break;

                    case 4:
                        Intent chest_adv =new Intent(context,Chest_Advanced.class);
                        context.startActivity(chest_adv);
                        break;

                    case 5:
                        Intent Leg_adv = new Intent(context,Leg_Advanced.class);
                        context.startActivity(Leg_adv);
                        break;




                }



                }

        });*/


    }

    @Override
    public int getItemCount() {
        return myFitnessData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        ImageView exerImage;
        TextView txtViewName;
//        TextView txtViewDuration;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            exerImage =itemView.findViewById(R.id.imageview);
            txtViewName = itemView.findViewById(R.id.txtname);
//            txtViewDuration = itemView.findViewById(R.id.txtduration);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            int position =getAbsoluteAdapterPosition();
//            Intent intent = new Intent(context,Strength.class);
//            context.startActivity(intent);
        }
    }
}
