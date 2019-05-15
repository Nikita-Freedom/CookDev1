package ru.startandroid.cookdev1;

import android.widget.Button;

public class ExampleItem {
    private int mImageResource;
    private String mText1;
    private String mText2;

    public ExampleItem(int imageResource, String Text1, String Text2){
        mImageResource = imageResource;
        mText1 = Text1;
        mText2 = Text2;
    }

    public int getmImageResource(){
        return mImageResource;
    }
    public String getmText1(){
        return mText1;
    }
    public String getmText2(){
        return mText2;
    }

}
