package advocosoft.com.cricket.Activitys;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import advocosoft.com.cricket.Adapters.Ranking_A_Adapter;
import advocosoft.com.cricket.Adapters.ViewPagerAdapter;
import advocosoft.com.cricket.Comman.OnclickRate;
import advocosoft.com.cricket.Comman.SharedPrefManager;
import advocosoft.com.cricket.Fragments.T20_A;
import advocosoft.com.cricket.Model.Ranking_A_Model;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Ranking extends AppCompatActivity {

//    @BindView(R.id.batsmen_tv) TextView batsmen_tv;
//    @BindView(R.id.bowlers_tv) TextView bowlers_tv;
//    @BindView(R.id.all_rounder_tv) TextView all_rounder_tv;
//    @BindView(R.id.teams_tv) TextView team_tv;
    @BindView(R.id.ranking_appbar) AppBarLayout ranking_appbar;
    @BindView(R.id.ranking_tablayout) TabLayout ranking_tablayout;
    @BindView(R.id.ranking_viewpager) ViewPager ranking_viewpager;
    @BindView(R.id.ranking_toolbar) Toolbar ranking_toolbar;
//    @BindView(R.id.rate_col) TextView rate_col;
//    public static Boolean bat=false,bowler=false,all_round=false,team=false,test=false,odi=false,t20=false;
//    public static int i=0;
    public static Ranking mInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        ButterKnife.bind(this,this);
        mInstance = this;
        setSupportActionBar(ranking_toolbar);
        getSupportActionBar().setTitle("Ranking");

        setUpViewPager(ranking_viewpager);
        ranking_tablayout.setupWithViewPager(ranking_viewpager);
//        ShowMehtod(this);

//        bat = true;
//        bowler = false;
//        all_round = false;
//        team = false;
//        rate_col.setVisibility(View.GONE);
//        batsmen_tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bat = true;
//                bowler = false;
//                all_round = false;
//                team = false;
//                batsmen_tv.setBackground(getResources().getDrawable(R.drawable.tablayoutbackground));
//                bowlers_tv.setBackground(null);
//                all_rounder_tv.setBackground(null);
//                team_tv.setBackground(null);
//                batsmen_tv.setTextColor(getResources().getColor(R.color.colorWhite));
//                bowlers_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                all_rounder_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                team_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                rate_col.setVisibility(View.GONE);
//                T20_A.getInstance().ShowMehtod(Ranking.this,team);
//            }
//        });
//        bowlers_tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bat = false;
//                bowler = true;
//                all_round = false;
//                team = false;
//                batsmen_tv.setBackground(null);
//                bowlers_tv.setBackground(getResources().getDrawable(R.drawable.tablayoutbackground));
//                all_rounder_tv.setBackground(null);
//                team_tv.setBackground(null);
//                batsmen_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                bowlers_tv.setTextColor(getResources().getColor(R.color.colorWhite));
//                all_rounder_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                team_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                rate_col.setVisibility(View.GONE);
//                T20_A.getInstance().ShowMehtod(Ranking.this,team);
//            }
//        });
//        all_rounder_tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bat = false;
//                bowler = false;
//                all_round = true;
//                team = false;
//                SharedPrefManager.setClickITem(team);
//                batsmen_tv.setBackground(null);
//                bowlers_tv.setBackground(null);
//                all_rounder_tv.setBackground(getResources().getDrawable(R.drawable.tablayoutbackground));
//                team_tv.setBackground(null);
//
//                batsmen_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                bowlers_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                all_rounder_tv.setTextColor(getResources().getColor(R.color.colorWhite));
//                team_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//
//                rate_col.setVisibility(View.GONE);
//                T20_A.getInstance().ShowMehtod(Ranking.this,team);
//            }
//        });
//        team_tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bat = false;
//                bowler = false;
//                all_round = false;
//                team = true;
//                batsmen_tv.setBackground(null);
//                bowlers_tv.setBackground(null);
//                all_rounder_tv.setBackground(null);
//                team_tv.setBackground(getResources().getDrawable(R.drawable.tablayoutbackground));
//                batsmen_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                bowlers_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                all_rounder_tv.setTextColor(getResources().getColor(R.color.colorBlack));
//                team_tv.setTextColor(getResources().getColor(R.color.colorWhite));
//                rate_col.setVisibility(View.VISIBLE);
//                T20_A.getInstance().ShowMehtod(Ranking.this,team);
//            }
//        });


        ranking_viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

//                T20_A.getInstance().ShowMehtod(Ranking.this,team);
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void setUpViewPager(ViewPager viewPager){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new T20_A(),"T20");
        viewPagerAdapter.addFragment(new T20_A(),"ODI");
        viewPagerAdapter.addFragment(new T20_A(),"TEST");
        viewPager.setAdapter(viewPagerAdapter);
    }

    public static Ranking getInstance(){
        return mInstance;
    }
}
