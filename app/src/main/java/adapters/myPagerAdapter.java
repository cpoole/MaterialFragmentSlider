package adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;

import fragments.MenuCategoryFragment;

/**
 * Created by connor on 1/5/15.
 */
public class myPagerAdapter extends FragmentStatePagerAdapter {

    SparseArray<Fragment> registeredFragments = new SparseArray<Fragment>();
    private final String[] TITLES = {"Appetizers", "Soup & Salad", "Entrees", "Desserts", "A La Carte", "Beverages"};

    public myPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public Fragment getItem(int position) {
        return MenuCategoryFragment.newInstance(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        registeredFragments.put(position,fragment);
        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        registeredFragments.remove(position);
        super.destroyItem(container, position, object);
    }

    public Fragment getRegisteredFragment(int position){
        return registeredFragments.get(position);
    }

}
