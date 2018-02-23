package com.alguojian.lovelovelove.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;

import com.alguojian.lovelovelove.R;

public class SplashActivity extends BaseActivity {

    private Handler mHandler = new Handler();

    @Override
    protected void data() {



    }

    @Override
    protected void init() {

        SharedPreferences sp = getSharedPreferences("args", Context.MODE_PRIVATE);

        mHandler.postDelayed(() -> {
            if (sp.getBoolean("isGuid", false)){
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }else {
                startActivity(new Intent(SplashActivity.this, GuideActivity.class));
            }

            finish();

        },1200);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }
}
