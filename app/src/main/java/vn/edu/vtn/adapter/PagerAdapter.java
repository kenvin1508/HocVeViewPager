package vn.edu.vtn.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import vn.edu.vtn.model.PlaceholderFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return PlaceholderFragment.newInstance(i);
    }

    @Override
    public int getCount() {
        return 3; // trả về số lượng Fragment được tạo ra
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "HOUSE";
            case 1:
                return "SCHOOL";
            case 2:
                return "HOSPITAL";
        }
        return null;
    }
}
