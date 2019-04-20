package advocosoft.com.cricket.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;

import java.util.ArrayList;
import java.util.List;

import advocosoft.com.cricket.Adapters.HomeNewsAdapter;
import advocosoft.com.cricket.Adapters.HomeUpcomingEventsAdapter;
import advocosoft.com.cricket.Adapters.SlideAdapter;
import advocosoft.com.cricket.Model.HomeNewsModel;
import advocosoft.com.cricket.Model.HomeUpcomingEventsModel;
import advocosoft.com.cricket.Model.ViewPagerHomeModel;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;;

/**
 * A simple {@link Fragment} subclass.
 */
public class Homefragment extends Fragment {

    @BindView(R.id.upcoming_news_home) RecyclerView upcoming_news_home;
    @BindView(R.id.spring_dots_indicator) SpringDotsIndicator indicator;
    @BindView(R.id.upcoming_events_home) RecyclerView upcoming_events_home;
    @BindView(R.id.viewpager_home) ViewPager viewpager_home;
    List<ViewPagerHomeModel> testimonialsItemList = new ArrayList<>();
    SlideAdapter slideAdapter;

    ArrayList<HomeNewsModel> homeNewsModelArrayList = new ArrayList<>();
    HomeNewsAdapter  homeNewsAdapter;

    ArrayList<HomeUpcomingEventsModel> homeUpcomingEventsModelArrayList = new ArrayList<>();
    HomeUpcomingEventsAdapter homeUpcomingEventsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_homefragment, container, false);

        ButterKnife.bind(this ,view);
        viewpager_home.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        for (int i =0 ;i<10;i++){
            ViewPagerHomeModel viewPagerHomeModel = new ViewPagerHomeModel();
            viewPagerHomeModel.setTeam_name("aSDSADF"+i);
            testimonialsItemList.add(viewPagerHomeModel);
        }
        slideAdapter = new SlideAdapter(testimonialsItemList,getActivity());
        viewpager_home.setAdapter(slideAdapter);
        indicator.setViewPager(viewpager_home);
        viewpager_home.setPageTransformer(true, new ZoomOutPageTransformer());

        //News recyclerview
        for (int j=0;j<20;j++){
            HomeNewsModel homeNewsModel = new HomeNewsModel();
            homeNewsModel.setTitle("sdfsa"+j);
            homeNewsModelArrayList.add(homeNewsModel);
        }
        upcoming_news_home.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        homeNewsAdapter = new HomeNewsAdapter(homeNewsModelArrayList,getActivity());
        upcoming_news_home.setAdapter(homeNewsAdapter);

        for (int j=0;j<3;j++){
            HomeUpcomingEventsModel homeUpcomingEventsModel = new HomeUpcomingEventsModel();
            homeUpcomingEventsModel.setName("sdfsa"+j);
            homeUpcomingEventsModelArrayList.add(homeUpcomingEventsModel);
        }
        upcoming_events_home.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        homeUpcomingEventsAdapter = new HomeUpcomingEventsAdapter(homeUpcomingEventsModelArrayList,getActivity());
        upcoming_events_home.setAdapter(homeUpcomingEventsAdapter);
        return view;
    }

    //ZoomOut ViewPager animation
    public static class ZoomOutPageTransformer implements ViewPager.PageTransformer {

        private static final float MIN_SCALE = 0.85f;
        private static final float MIN_APLHA = 0.5f;
        @Override
        public void transformPage(@NonNull View view, float v) {

            int pageWidth = view.getWidth();
            int pageheight = view.getHeight();

            if (v<-1){
                view.setAlpha(0f);
            }else if (v<=1){
                float scaleFactor = Math.max(MIN_SCALE,1-Math.abs(v));
                float vertMargin = pageheight*(1-scaleFactor)/2;
                float horzMargin = pageWidth * (1-scaleFactor)/2;
                if (v<0){
                    view.setTranslationX(horzMargin - vertMargin/2);
                }else {
                    view.setTranslationX(-horzMargin + vertMargin/2);
                }
                view.setScaleX(scaleFactor);
                view.setScaleY(scaleFactor);
                view.setAlpha(MIN_APLHA+(scaleFactor-MIN_SCALE)/(1-MIN_SCALE)*(1-MIN_APLHA));
            }else {
                view.setAlpha(0f);
            }


        }
    }
}
