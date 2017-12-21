package se.sugarest.jane.lisbon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by jane on 17-12-21.
 */

public class LisbonFragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private Context mContext;

    public LisbonFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SeeFragment();
        } else {
            return new EatFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_see);
        } else {
            return mContext.getString(R.string.category_eat);
        }
    }
}
