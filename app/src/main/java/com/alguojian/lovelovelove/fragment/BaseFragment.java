package com.alguojian.lovelovelove.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.socks.library.KLog;

import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.alguojian.lovelovelove.MyApplication.TTAG;

/**
 * @author ALguojian
 * @date 2018/2/8
 * ${DESCRIPTION}
 */
public abstract class BaseFragment extends Fragment {

    private View rootView;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = View.inflate(getActivity(), getLayout(), null);
        unbinder = ButterKnife.bind(this, rootView);
        init();
        data();
        return rootView;
    }

    /**
     * 添加数据
     */
    protected abstract void data();

    /**
     * 初始化数据以及添加监听事件
     */
    protected abstract void init();

    /**
     * 获得布局ID
     *
     * @return
     */
    protected abstract int getLayout();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    void showLogger(String string) {
        KLog.d(TTAG, string);
    }

    void showToast(String string) {
        Toast.makeText(getActivity(), string, Toast.LENGTH_SHORT).show();
    }


}
