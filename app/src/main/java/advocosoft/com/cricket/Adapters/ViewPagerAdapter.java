package advocosoft.com.cricket.Adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;


public class ViewPagerAdapter extends FragmentPagerAdapter {
    private  ArrayList<Fragment> fragments = new ArrayList();
    private  ArrayList<String> mTitle = new ArrayList();

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public void addFragment(Fragment fragment, String str) {
        this.fragments.add(fragment);
        this.mTitle.add(str);
    }

    public void addView(Fragment fragment, int i) {
        this.fragments.add(i, fragment);
        this.mTitle.add(i, "");
        notifyDataSetChanged();
    }

    public void removeView(int i) {
        this.fragments.remove(i);
        this.mTitle.remove(i);
        notifyDataSetChanged();
    }

    public void removeAllFragment() {
        this.fragments.clear();
        this.mTitle.clear();
    }

    public Fragment getItem(int i) {
        return (Fragment) this.fragments.get(i);
    }

    public int getCount() {
        return this.fragments.size();
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        return (CharSequence) this.mTitle.get(i);
    }

}
