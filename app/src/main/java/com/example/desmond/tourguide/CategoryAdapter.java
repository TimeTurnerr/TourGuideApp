package com.example.desmond.tourguide;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DelhiFragment();
        } else if (position == 1){
            return new AgraFragment();
        }
        else if (position == 2){
            return new ShimlaFragment();
        }
        else if (position == 3){
            return new TelanganaFragment();
        }else {
            return new JkFragment();
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.delhi);
        } else if (position == 1) {
            return mContext.getString(R.string.agra);
        } else if (position == 2) {
            return mContext.getString(R.string.shimla);
        }
        else if (position == 3) {
            return mContext.getString(R.string.telangana);
        } else {
            return mContext.getString(R.string.Jk);
        }
    }
    @Override
    public int getCount() {
        return 5;
    }
}