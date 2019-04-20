package advocosoft.com.cricket.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import advocosoft.com.cricket.Adapters.BrowseTeamAdapter;
import advocosoft.com.cricket.Model.BrowseTeamModel;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class BrowseTeam extends AppCompatActivity {

    @BindView(R.id.search_icon) ImageView search_icon;
    @BindView(R.id.search_view) SearchView search_view;
    @BindView(R.id.browse_team_toolbar) Toolbar browse_team_toolbar;
    @BindView(R.id.recyclerview_browse_team) RecyclerView recyclerview_browse_team;

    ArrayList<BrowseTeamModel>browseTeamModelArrayList = new ArrayList<>();
    BrowseTeamAdapter browseTeamAdapter;
    private boolean isshow=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_team);

        ButterKnife.bind(this,this);
        setSupportActionBar(browse_team_toolbar);
        getSupportActionBar().setTitle("Browse Team");
        search_view.setVisibility(View.GONE);
        search_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isshow){
                    isshow = false;
                    search_view.setVisibility(View.GONE);
                }else {
                    isshow = true;
                    search_view.setVisibility(View.VISIBLE);
                }
            }
        });
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
        for (int i=0;i<50;i++){
            BrowseTeamModel browseTeamModel = new BrowseTeamModel();
            browseTeamModelArrayList.add(browseTeamModel);
        }
        recyclerview_browse_team.setLayoutManager(new LinearLayoutManager(BrowseTeam.this,LinearLayoutManager.VERTICAL,false));
        browseTeamAdapter = new BrowseTeamAdapter(browseTeamModelArrayList,BrowseTeam.this);
        recyclerview_browse_team.setAdapter(browseTeamAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
