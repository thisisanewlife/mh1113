package com.example.mywork;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {

    RecyclerView recyclerView;
    Intent intent;
    ArrayList<contactMS> msList;

    Myadapter myadapter;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2, container, false);
        context = view.getContext();


//        list = new ArrayList();
//        for (int i = 0; i < 8; i++) {
//            list.add("这是第" + i + "行");
//
//            myadapter = new Myadapter(context, list);
//            recyclerView.setAdapter(myadapter);
//            LinearLayoutManager manager = new LinearLayoutManager(context);
//            manager.setOrientation(RecyclerView.VERTICAL);
//            recyclerView.setLayoutManager(manager);//上下左右
//
//
//        }

        msList = initializeContactList();

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        myadapter = new Myadapter(msList);
        recyclerView.setAdapter(myadapter);
        return view;
    }


    private ArrayList<contactMS> initializeContactList() {
        ArrayList<contactMS> contacts = new ArrayList<>();

        // 添加一些联系人
        contacts.add(new contactMS(R.drawable.amiya2, "阿米娅", "罗德岛", "女","至爱"));
        contacts.add(new contactMS(R.drawable.skadi, "浊心斯卡蒂", "伊比利亚", "女","血亲"));
        contacts.add(new contactMS(R.drawable.texas, "缄默德克萨斯", "叙拉古", "女", "后妈"));
        contacts.add(new contactMS(R.drawable.kex, "凯尔希", "罗德岛", "女", "老猞猁"));
        contacts.add(new contactMS(R.drawable.thorn, "棘刺", "伊比利亚", "男","寒爹"));
        contacts.add(new contactMS(R.drawable.knight174, "耀骑士临光", "卡西米尔", "女", "骑士"));
        contacts.add(new contactMS(R.drawable.mumu, "缪尔塞斯", "莱茵生命", "女","精灵"));
        contacts.add(new contactMS(R.drawable.exusiai, "能天使", "拉特兰", "女","拐天使"));
        contacts.add(new contactMS(R.drawable.typhon, "提丰", "萨米", "女","超大杯"));
        contacts.add(new contactMS(R.drawable.chen, "假日威龙陈", "龙门", "女","我要抢走你的妈妈"));
        contacts.add(new contactMS(R.drawable.xk, "刻俄柏", "罗德岛", "女","哒哒哒哒哒"));
        contacts.add(new contactMS(R.drawable.glory, "澄闪", "罗德岛", "女","别在这理发店"));


        // 添加更多联系人...

        return contacts;
    }
}//压缩