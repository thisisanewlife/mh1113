package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetailsActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.contact);
        ImageView imageView;
        TextView textView1,textView2,textView3,textView4;
        // 获取从上一个界面传递过来的联系人信息
        contactMS contact = getIntent().getParcelableExtra("contact");
        int rid=contact.getImageResourceId();
        String name = contact.getMessageText();
        String region = contact.getregion();
        String gender = contact.getgender();
        String type = contact.gettype();
        textView1=findViewById(R.id.textViewa2);
        textView2=findViewById(R.id.textViewb2);
        textView3=findViewById(R.id.textViewc2);
        textView4=findViewById(R.id.textViewd2);
        imageView=findViewById(R.id.imageView5);
        imageView.setImageResource(rid);
        textView1.setText(name);
        textView2.setText(region);
        textView3.setText(gender);
        textView4.setText(type);

    }
}