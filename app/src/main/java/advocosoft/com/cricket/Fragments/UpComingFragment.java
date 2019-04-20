package advocosoft.com.cricket.Fragments;


import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import advocosoft.com.cricket.Adapters.ViewPagerAdapter;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpComingFragment extends Fragment {

    @BindView(R.id.upcoming_appbar)
    AppBarLayout upcoming_appbar;
    @BindView(R.id.upcoming_tablayout)
    TabLayout upcoming_tablayout;
    @BindView(R.id.upcoming_viewpager)
    ViewPager upcomng_viewpager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_up_coming, container, false);
        ButterKnife.bind(this,view);

        setUpviewPager(upcomng_viewpager);
        upcoming_tablayout.setupWithViewPager(upcomng_viewpager);
        return view;
    }

    private void setUpviewPager(ViewPager upcomng_viewpager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPagerAdapter.addFragment(new T20(),"T20");
        viewPagerAdapter.addFragment(new ODI(),"ODI");
        viewPagerAdapter.addFragment(new TEST(),"TEST");
        upcomng_viewpager.setAdapter(viewPagerAdapter);
    }

}
