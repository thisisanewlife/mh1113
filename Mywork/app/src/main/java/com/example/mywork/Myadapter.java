package com.example.mywork;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



//泛型 类。类
public class Myadapter extends RecyclerView.Adapter <Myadapter.myholder>{



   List <contactMS> msList;


    public Myadapter( List <contactMS> msList) {
        this.msList=msList;
    }

    @NonNull
    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//       View view =
//       LayoutInflater.from(context1).inflate(R.layout.item,parent,false) ;
//       //Inflater inflater=new inflater();
//       //inflater.inflate()不是要这个压缩
//        myholder myholder=new myholder(view);
        View view;

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);


        return new myholder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull myholder holder, int position) {
        contactMS msList1=  msList.get(position);

        holder.messageText.setText(msList1.getMessageText());
        holder.ImageView.setImageResource(msList1.getImageResourceId());
//     holder.textView.setOnClickListener(new View.OnClickListener() {
//         @Override
//         public void onClick(View v) {
//
//         }
//     });
    }

    @NonNull

    //指向行的指针



    //item 一行，多长
    public int getItemCount() {
        return msList.size();
    }

    public class myholder extends  RecyclerView.ViewHolder{//类的嵌套，会调用子类对象
        TextView messageText;
        ImageView ImageView;
        public myholder(@NonNull View itemView) {

            super(itemView);
            messageText = itemView.findViewById(R.id.messageText);
            ImageView = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        contactMS clickedContact = msList.get(position);
                        Intent intent = new Intent(itemView.getContext(), ContactDetailsActivity.class);
                        intent.putExtra("contact", (Parcelable) clickedContact);
                        itemView.getContext().startActivity(intent);
                    }
                }
            });
        }
        }
    }






