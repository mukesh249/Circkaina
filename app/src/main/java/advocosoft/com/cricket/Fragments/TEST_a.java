package advocosoft.com.cricket.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import advocosoft.com.cricket.Activitys.Ranking;
import advocosoft.com.cricket.Adapters.Ranking_A_Adapter;
import advocosoft.com.cricket.Model.Ranking_A_Model;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class TEST_a extends Fragment {


    public static TEST_a mInstance;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_test_a, container, false);

        ButterKnife.bind(this,view);
        mInstance = this;
//        ShowMehtod(getActivity(), T20_A.team);
        return view;
    }

    public static TEST_a getInstance(){
        return mInstance;
    }
    public void ShowMehtod(Context context,Boolean team){
        Ranking_A_Adapter t20MatechRecentAdapter;
        ArrayList<Ranking_A_Model> ranking_a_modelArrayList = new ArrayList<>();
        RecyclerView t20_recyclerview;
        t20_recyclerview = (RecyclerView)view.findViewById(R.id.t20_recyclerview);
        ranking_a_modelArrayList.clear();
        for (int i =0;i<50;i++){
            Ranking_A_Model ranking_a_model = new Ranking_A_Model();
            ranking_a_modelArrayList.add(ranking_a_model
            );
        }
        t20_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        t20MatechRecentAdapter = new Ranking_A_Adapter(ranking_a_modelArrayList,getActivity(),team);
        t20_recyclerview.setAdapter(t20MatechRecentAdapter);
    }
}
