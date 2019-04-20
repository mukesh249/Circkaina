package advocosoft.com.cricket.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import advocosoft.com.cricket.Adapters.T20MatechRecentAdapter;
import advocosoft.com.cricket.Model.T20MatchRecentModel;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class T20 extends Fragment {

    @BindView(R.id.t20_recyclerview) RecyclerView t20_recyclerview;
    T20MatechRecentAdapter t20MatechRecentAdapter;
    ArrayList<T20MatchRecentModel> t20MatchRecentModelArrayList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_t20, container, false);

        ButterKnife.bind(this,view);

        for (int i =0;i<20;i++){
            T20MatchRecentModel t20MatchRecentModel = new T20MatchRecentModel();
            t20MatchRecentModelArrayList.add(t20MatchRecentModel);
        }

        t20_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        t20MatechRecentAdapter = new T20MatechRecentAdapter(t20MatchRecentModelArrayList,getActivity());
        t20_recyclerview.setAdapter(t20MatechRecentAdapter);

        return view;
    }

}
