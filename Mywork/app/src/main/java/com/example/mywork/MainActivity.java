package com.example.mywork;

import static androidx.core.view.OneShotPreDrawListener.add;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {//接口

    Fragment fragment1;//父类声明，子类创建
    Fragment fragment2;
    Fragment fragment3;
    Fragment fragment4;
    FragmentManager Fm;//new
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;
    ImageButton imageButton1,imageButton2,imageButton3,imageButton4;
   // FragmentTransaction ft;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fragment1=new Fragment1();
        fragment2 = new Fragment2();
        fragment3=new Fragment3();
        fragment4=new Fragment4();

        linearLayout1=findViewById(R.id.linearLayout1);
        linearLayout2=findViewById(R.id.linearLayout2);
        linearLayout3=findViewById(R.id.linearLayout3);
        linearLayout4=findViewById(R.id.linearLayout4);
        imageButton1=findViewById(R.id.imageView1);
        imageButton2=findViewById(R.id.imageView2);
        imageButton3=findViewById(R.id.imageView3);
        imageButton4=findViewById(R.id.imageView4);
        Fm =getSupportFragmentManager();
        initial();
        fragmenthide();
        linearLayout1.setOnClickListener(this);//全局监听
        linearLayout2.setOnClickListener(this);//全局监听
        linearLayout3.setOnClickListener(this);//全局监听
        linearLayout4.setOnClickListener(this);//全局监听

    }

    private void fragmenthide() {
        FragmentTransaction ft= Fm.beginTransaction()
                .hide(fragment1)
                .hide(fragment2)
                .hide(fragment3)
                .hide(fragment4);
        ft.commit();
    }

    private void initial() {

        FragmentTransaction ft= Fm.beginTransaction()//管理fragment的交互动作，交互开始启动，不是所有函数可访问
                .add(R.id.content1,fragment1)
                .add(R.id.content1,fragment2)
                .add(R.id.content1,fragment3)
                .add(R.id.content1,fragment4)
                ;
        ft.commit();//as必须分行写
    }

    @Override
    public void onClick(View v) {
        fragmenthide();


        if(v.getId()==R.id.linearLayout1) {fragmentshow(fragment1);
            imageButton1.setImageResource(R.drawable.k2);}

        else if(v.getId()==R.id.linearLayout2) {fragmentshow(fragment2);
            imageButton2.setImageResource(R.drawable.k4); }
        else if(v.getId()==R.id.linearLayout3) {fragmentshow(fragment3);
            imageButton3.setImageResource(R.drawable.k6);}
        else {fragmentshow(fragment4);
            imageButton4.setImageResource(R.drawable.k8);}


    }

    private void fragmentshow(Fragment fragment) {
        FragmentTransaction transaction=Fm.beginTransaction()
                .show(fragment);
        transaction.commit();
    }
}
//fragment 局部刷新