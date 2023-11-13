package com.example.mywork;

import android.os.Parcel;
import android.os.Parcelable;

public class contactMS  implements Parcelable {
    private String 分类;
    private String 地区;
    private String 性别;
    private String 名字;
    private int 图片;

    public contactMS(Parcel in) {//从 Parcel 中读取数据并初始化对象
        图片 = in.readInt();
        名字 = in.readString();
        地区 = in.readString();
        性别 = in.readString();
        分类 = in.readString();



    }

    public contactMS(int 图片, String 名字, String 地区, String 性别 , String 分类 ) {
        this.图片 = 图片;
        this.名字 = 名字;
        this.地区=地区;
        this.性别 = 性别;
        this.分类 = 分类;

        }




    public String getMessageText() {
        return 名字;
    }

    public int getImageResourceId() {
        return  图片;
    }
    public String getgender() {
        return  性别;
    }
    public String getregion() {
        return  地区;
    }
    public String gettype() {
        return  分类;
    }
    public static final Creator<contactMS> CREATOR = new Creator<contactMS>() {
        @Override
        public contactMS createFromParcel(Parcel in) {
            return new contactMS(in);
        }

        @Override
        public contactMS[] newArray(int size) {
            return new contactMS[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {///// 将对象数据写入 Parcel 中
        parcel.writeInt(图片);
        parcel.writeString(名字);
        parcel.writeString(地区);
        parcel.writeString(性别);
        parcel.writeString(分类);

    }

}
