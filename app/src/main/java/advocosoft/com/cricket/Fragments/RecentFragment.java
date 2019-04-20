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
public class RecentFragment extends Fragment {

    @BindView(R.id.recent_appbar)
    AppBarLayout recent_appbar;
    @BindView(R.id.recent_tablayout)
    TabLayout recent_tablayout;
    @BindView(R.id.recent_viewpager)
    ViewPager recent_viewpager;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view = inflater.inflate(R.layout.fragment_recent, container, false);

        ButterKnife.bind(this,view);
        setUpViewPager(recent_viewpager);
        recent_tablayout.setupWithViewPager(recent_viewpager);
        return view;
    }

    public void setUpViewPager(ViewPager viewPager){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPagerAdapter.addFragment(new T20(),"T20");
        viewPagerAdapter.addFragment(new ODI(),"ODI");
        viewPagerAdapter.addFragment(new TEST(),"TEST");
        viewPager.setAdapter(viewPagerAdapter);
    }

}
