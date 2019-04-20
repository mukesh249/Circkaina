package advocosoft.com.cricket.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
public class T20_A extends Fragment {

    @BindView(R.id.batsmen_tv) TextView batsmen_tv;
    @BindView(R.id.bowlers_tv) TextView bowlers_tv;
    @BindView(R.id.all_rounder_tv) TextView all_rounder_tv;
    @BindView(R.id.teams_tv) TextView team_tv;
    @BindView(R.id.rate_col) TextView rate_col;
    public static Boolean bat=false,bowler=false,all_round=false,team=false,test=false,odi=false,t20=false;

    @BindView(R.id.t20_recyclerview) RecyclerView t20_recyclerview;

    public static T20_A mInstance;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_t20_a, container, false);

        ButterKnife.bind(this,view);
        mInstance = this;
        ShowMehtod(getActivity(),team);
        bat = true;
        bowler = false;
        all_round = false;
        team = false;
        rate_col.setVisibility(View.GONE);
        batsmen_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bat = true;
                bowler = false;
                all_round = false;
                team = false;
                batsmen_tv.setBackground(getResources().getDrawable(R.drawable.tablayoutbackground));
                bowlers_tv.setBackground(null);
                all_rounder_tv.setBackground(null);
                team_tv.setBackground(null);
                batsmen_tv.setTextColor(getResources().getColor(R.color.colorWhite));
                bowlers_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                all_rounder_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                team_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                rate_col.setVisibility(View.GONE);
                ShowMehtod(getActivity(),team);
            }
        });
        bowlers_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bat = false;
                bowler = true;
                all_round = false;
                team = false;
                batsmen_tv.setBackground(null);
                bowlers_tv.setBackground(getResources().getDrawable(R.drawable.tablayoutbackground));
                all_rounder_tv.setBackground(null);
                team_tv.setBackground(null);
                batsmen_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                bowlers_tv.setTextColor(getResources().getColor(R.color.colorWhite));
                all_rounder_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                team_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                rate_col.setVisibility(View.GONE);
                ShowMehtod(getActivity(),team);
            }
        });
        all_rounder_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bat = false;
                bowler = false;
                all_round = true;
                team = false;
                batsmen_tv.setBackground(null);
                bowlers_tv.setBackground(null);
                all_rounder_tv.setBackground(getResources().getDrawable(R.drawable.tablayoutbackground));
                team_tv.setBackground(null);
                batsmen_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                bowlers_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                all_rounder_tv.setTextColor(getResources().getColor(R.color.colorWhite));
                team_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                rate_col.setVisibility(View.GONE);
                ShowMehtod(getActivity(),team);
            }
        });
        team_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bat = false;
                bowler = false;
                all_round = false;
                team = true;
                batsmen_tv.setBackground(null);
                bowlers_tv.setBackground(null);
                all_rounder_tv.setBackground(null);
                team_tv.setBackground(getResources().getDrawable(R.drawable.tablayoutbackground));
                batsmen_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                bowlers_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                all_rounder_tv.setTextColor(getResources().getColor(R.color.colorBlack));
                team_tv.setTextColor(getResources().getColor(R.color.colorWhite));
                rate_col.setVisibility(View.VISIBLE);
                ShowMehtod(getActivity(),team);
            }
        });
        return view;
    }

    public static T20_A getInstance(){
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
