package com.example.wlw.shixun;

/**
 * Created by wlw on 2016/12/10.
 */
public class Msg {
    public  static  final  int TYPE_RECEIVED=0;
    public  static  final  int TYPE_SENT=1;
    private  String mContent;
    private  int mType;

    public Msg(String mContent, int mType) {
        this.mContent = mContent;
        this.mType = mType;
    }

    public String getmContent() {
        return mContent;
    }

    public int getmType() {
        return mType;
    }
}
