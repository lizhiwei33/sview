package com.lzw.sview.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    public static void showMsg(Context context, String content){
        Toast.makeText(context,content,Toast.LENGTH_LONG).show();
    }
}
