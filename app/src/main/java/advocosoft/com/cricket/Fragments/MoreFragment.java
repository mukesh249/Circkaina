package advocosoft.com.cricket.Fragments;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import advocosoft.com.cricket.Activitys.BrowsePlayer;
import advocosoft.com.cricket.Activitys.BrowseTeam;
import advocosoft.com.cricket.Activitys.NewsActivity;
import advocosoft.com.cricket.Activitys.Ranking;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment {

    @BindView(R.id.about_rel) RelativeLayout about_rel;
    @BindView(R.id.ranking_rel) RelativeLayout ranking_rel;
    @BindView(R.id.rate_rel) RelativeLayout rate_rel;
    @BindView(R.id.browse_player_rel) RelativeLayout browse_player_rel;
    @BindView(R.id.browse_series_rel) RelativeLayout browse_series_rel;
    @BindView(R.id.browse_team_rel) RelativeLayout browse_team_rel;
    @BindView(R.id.disclaimer_rel) RelativeLayout disclaimer_rel;
    @BindView(R.id.feedback_rel) RelativeLayout feedback_rel;
    @BindView(R.id.news_rel) RelativeLayout news_rel;
    @BindView(R.id.setting_rel) RelativeLayout setting_rel;
    @BindView(R.id.help_support_rel) RelativeLayout help_support_rel;
    @BindView(R.id.sharing_option_rel) RelativeLayout sharing_option_rel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_more, container, false);

        ButterKnife.bind(this,view);
        about_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });
        ranking_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), Ranking.class));
            }
        });
        rate_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });
        browse_player_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), BrowsePlayer.class));
            }
        });
        browse_series_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });
        browse_team_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), BrowseTeam.class));
            }
        });
        disclaimer_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                DisclaimerPupup();
            }
        });
        feedback_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });
        news_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), NewsActivity.class));
            }
        });
        setting_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });
        help_support_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });
        sharing_option_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    private void DisclaimerPupup(){
        final AlertDialog dialog = new AlertDialog.Builder(getActivity(), R.style.CustomDialogTheme).create();
        View view = getLayoutInflater().inflate(R.layout.disclaimer_popup,null);

        Button okay = (Button)view.findViewById(R.id.okay_btn);
        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.setView(view);
        dialog.show();
    }

}
