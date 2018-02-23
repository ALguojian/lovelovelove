package com.alguojian.lovelovelove.fragment;

import android.os.Bundle;

import com.alguojian.lovelovelove.R;

/**
 * @author ALguojian
 * @date 2018/2/8
 * ${DESCRIPTION}
 */
public class HerInfoFragment extends BaseFragment {


    @Override
    protected void data() {

    }

    @Override
    protected void init() {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_herinfo;
    }


    /**
     * 创建Fragment实例
     */
    public static HerInfoFragment newInstance() {

        Bundle args = new Bundle();

        HerInfoFragment fragment = new HerInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
