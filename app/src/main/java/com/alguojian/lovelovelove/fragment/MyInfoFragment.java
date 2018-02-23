package com.alguojian.lovelovelove.fragment;

import android.os.Bundle;

import com.alguojian.lovelovelove.R;

/**
 * @author ALguojian
 * @date 2018/2/8
 * ${DESCRIPTION}
 */
public class MyInfoFragment extends BaseFragment {


    @Override
    protected void data() {

    }

    @Override
    protected void init() {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_myinfo;
    }


    /**
     * 创建Fragment实例
     */
    public static MyInfoFragment newInstance() {

        Bundle args = new Bundle();

        MyInfoFragment fragment = new MyInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
