package com.alguojian.lovelovelove.fragment;

import android.os.Bundle;
import android.widget.TextView;

import com.alguojian.lovelovelove.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author ALguojian
 * @date 2018/2/8
 * ${DESCRIPTION}
 */


public class MyBabyFragment extends BaseFragment {

    @BindView(R.id.asdasdqweqw)
    TextView asdasdqweqw;


    @Override
    protected void data() {
        
    }

    @Override
    protected void init() {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_my_baby;
    }
    

    @OnClick(R.id.asdasdqweqw)
    public void onViewClicked() {
    }

    /**
     * 创建Fragment实例
     */
    public static MyBabyFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MyBabyFragment fragment = new MyBabyFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
