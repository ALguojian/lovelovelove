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


public class FeaturesFragment extends BaseFragment {

    @BindView(R.id.asd)
    TextView asd;


    @Override
    protected void data() {

    }

    @Override
    protected void init() {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_features;
    }


    @OnClick(R.id.asd)
    public void onViewClicked() {

        showLogger("asdasdasdasd");
        showToast("asdasdasdasd");

    }

    /**
     * 创建Fragment实例
     */
    public static FeaturesFragment newInstance() {

        Bundle args = new Bundle();

        FeaturesFragment fragment = new FeaturesFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
