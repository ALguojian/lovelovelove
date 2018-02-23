package com.alguojian.lovelovelove.activity;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import com.alguojian.lovelovelove.R;
import com.alguojian.lovelovelove.adapter.FragAdapter;
import com.alguojian.lovelovelove.fragment.FeaturesFragment;
import com.alguojian.lovelovelove.fragment.MyBabyFragment;
import com.alguojian.lovelovelove.fragment.ScheduleFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.bottom)
    BottomNavigationView bottom;
    private MenuItem mMenuItem;


    @Override
    protected void data() {

    }


    /**
     * 添加监听回调
     */
    @Override
    protected void init() {

        bottom.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.schedule:
                    viewPager.setCurrentItem(0);
                    break;
                case R.id.features:
                    viewPager.setCurrentItem(1);
                    break;
                case R.id.my_baby:
                    viewPager.setCurrentItem(2);
                    break;

                case R.id.asd:
                    viewPager.setCurrentItem(3);
                    break;
                default:
                    break;
            }
            return true;
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (mMenuItem != null) {
                    mMenuItem.setChecked(false);
                } else {
                    bottom.getMenu().getItem(0).setChecked(false);
                }
                mMenuItem = bottom.getMenu().getItem(position);
                mMenuItem.setChecked(true);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        List<Fragment> fragments = new ArrayList<>();

        fragments.add(ScheduleFragment.newInstance());
        fragments.add(FeaturesFragment.newInstance());
        fragments.add(MyBabyFragment.newInstance());
        fragments.add(MyBabyFragment.newInstance());

        FragAdapter fragAdapter = new FragAdapter(getSupportFragmentManager());
        fragAdapter.setFragment(fragments);
        viewPager.setAdapter(fragAdapter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
