package com.alguojian.lovelovelove.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.alguojian.lovelovelove.R;
import com.alguojian.lovelovelove.adapter.FragAdapter;
import com.alguojian.lovelovelove.fragment.HerInfoFragment;
import com.alguojian.lovelovelove.fragment.MyInfoFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class GuideActivity extends BaseActivity {

    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.save)
    TextView save;

    @Override
    protected void data() {

    }

    @Override
    protected void init() {

        FragAdapter fragAdapter = new FragAdapter(getSupportFragmentManager());

        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(MyInfoFragment.newInstance());
        fragments.add(HerInfoFragment.newInstance());

        ArrayList<String> strings = new ArrayList<>();
        strings.add("我的");
        strings.add("我的她");

        fragAdapter.setTitle(strings);
        fragAdapter.setFragment(fragments);
        viewPager.setAdapter(fragAdapter);
        tab.setupWithViewPager(viewPager);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_guide;
    }

    @OnClick(R.id.save)
    public void onViewClicked() {

        showToast("asdasd");

        SharedPreferences sp = getSharedPreferences("args", Context.MODE_PRIVATE);
        sp.edit().putBoolean("isGuid", true).apply();
        startActivity(new Intent(this, MainActivity.class));

    }
}
