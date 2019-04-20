package advocosoft.com.cricket.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import advocosoft.com.cricket.Activitys.BrowseTeam;
import advocosoft.com.cricket.Model.BrowseTeamModel;
import advocosoft.com.cricket.R;

public class BrowseTeamAdapter extends RecyclerView.Adapter<BrowseTeamAdapter.ViewHolder> {
    private ArrayList<BrowseTeamModel> browseTeamModelArrayList = new ArrayList<>();
    BrowseTeamModel browseTeamModel;
    Context context;
    public BrowseTeamAdapter(ArrayList<BrowseTeamModel> browseTeamModelArrayList,Context context){
        this.browseTeamModelArrayList = browseTeamModelArrayList;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.browseteam_raw,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        browseTeamModel = this.browseTeamModelArrayList.get(i);

    }

    @Override
    public int getItemCount() {
        return browseTeamModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
