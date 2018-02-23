package com.alguojian.lovelovelove.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author Hello
 * @date on 2017/1/12.
 * tablayout和viewPager连用适配器
 */
public class FragAdapter extends FragmentPagerAdapter {

    private List<String> title = null;
    private List<Fragment> fragments;
    private FragmentManager fm;

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        fm.beginTransaction().show(fragment).commit();

        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        Fragment fragment = fragments.get(position);
        fm.beginTransaction().hide(fragment).commit();
    }

    public void setTitle(List<String> title) {
        this.title = title;
    }

    public void setFragment(List<Fragment> fragments) {
        this.fragments = fragments;
    }

    public FragAdapter(FragmentManager fm) {

        super(fm);
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (null != title) {
            return title.get(position);
        }
        return super.getPageTitle(position);
    }
}