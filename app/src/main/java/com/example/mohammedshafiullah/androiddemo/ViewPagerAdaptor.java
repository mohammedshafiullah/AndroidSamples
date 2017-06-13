package com.example.mohammedshafiullah.androiddemo;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by mohammedshafiullah on 13/06/17.
 */

public class ViewPagerAdaptor extends PagerAdapter
{


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
