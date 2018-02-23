package com.alguojian.lovelovelove.fragment;

import android.os.Bundle;

import com.alguojian.lovelovelove.R;

/**
 * @author ALguojian
 * @date 2018/2/8
 * ${DESCRIPTION}
 */


public class ScheduleFragment extends BaseFragment {

    @Override
    protected void data() {
        
    }

    @Override
    protected void init() {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_schedule;
    }

    /**
     * 创建Fragment实例
     */
    public static ScheduleFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ScheduleFragment fragment = new ScheduleFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
