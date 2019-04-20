package advocosoft.com.cricket.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;

import java.util.ArrayList;

import advocosoft.com.cricket.Adapters.PollSlideAdapter;
import advocosoft.com.cricket.Model.HomeNewsModel;
import advocosoft.com.cricket.Model.ViewPagerHomeModel;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class PollFragment extends Fragment {

    @BindView(R.id.view_pager_poll) ViewPager view_pager_poll;
    @BindView(R.id.spring_dots_indicator)
    SpringDotsIndicator indicator;
    PollSlideAdapter pollSlideAdapter;
    ArrayList<ViewPagerHomeModel> viewPagerHomeModelArrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_poll, container, false);

        ButterKnife.bind(this,view);
        for (int i =0;i<3;i++){
            ViewPagerHomeModel homeNewsModel = new ViewPagerHomeModel();
            viewPagerHomeModelArrayList.add(homeNewsModel);
        }
        pollSlideAdapter = new PollSlideAdapter(viewPagerHomeModelArrayList,getActivity());
        view_pager_poll.setAdapter(pollSlideAdapter);
        indicator.setViewPager(view_pager_poll);
        view_pager_poll.setPageTransformer(true, new Homefragment.ZoomOutPageTransformer());

        return view;
    }

}
