package com.example.adi.welcometohogsmeade;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ADI on 08/05/2018.
 */

public class AttractionFragmentAdapter extends FragmentPagerAdapter {
    // States
    private Context mContext;

    //Constructor
    public AttractionFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoryFragment();
        } else if (position == 1) {
            return new ResidentsFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new ShopsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getResources().getString(R.string.history_category_name);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.residents_category_name);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.attractions_category_name);
        } else {
            return mContext.getResources().getString(R.string.shops_category_name);
        }
    }

}
