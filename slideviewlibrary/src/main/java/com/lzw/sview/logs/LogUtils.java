package com.lzw.sview.logs;

import android.nfc.Tag;
import android.util.Log;

public class LogUtils {
    public static  final String TAG = "打印日志:";

    public static void Loge(String content){
        Log.e(TAG, "Loge: "+content);
    }

    public static void Logd(String content){
        Log.d(TAG,"logd:" + content);
    }
}
