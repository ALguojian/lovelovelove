package com.alguojian.lovelovelove;

import android.app.Application;

import com.socks.library.KLog;


/**
 * @author ALguojian
 * @date 2018/2/8
 * ${DESCRIPTION}
 */


public class MyApplication extends Application {

    public static String TTAG = "asdfghjkl";

    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(true, TTAG);
    }
}
