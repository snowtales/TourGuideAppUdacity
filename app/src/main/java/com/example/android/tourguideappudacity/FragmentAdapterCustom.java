package com.example.android.tourguideappudacity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Анастасия on 16.06.2018.
 */

public class FragmentAdapterCustom extends FragmentPagerAdapter {
    private Context mContext;

    public FragmentAdapterCustom(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TheatreFragment();
        } else if (position == 1) {
            return new MusemsFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new BarsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_theatres);
        } else if (position == 1) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 2) {
            return mContext.getString(R.string.category_parks);
        } else {
            return mContext.getString(R.string.category_bars);
        }
    }
}

