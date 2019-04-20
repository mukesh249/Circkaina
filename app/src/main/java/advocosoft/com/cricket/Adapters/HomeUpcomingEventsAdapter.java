package advocosoft.com.cricket.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import advocosoft.com.cricket.Model.HomeUpcomingEventsModel;
import advocosoft.com.cricket.R;

public class HomeUpcomingEventsAdapter extends RecyclerView.Adapter<HomeUpcomingEventsAdapter.ViewHolder> {
    ArrayList<HomeUpcomingEventsModel> homeUpcomingEventsModelArrayList = new ArrayList<>();
    HomeUpcomingEventsModel homeUpcomingEventsModel;
    Context context;

    public HomeUpcomingEventsAdapter(ArrayList<HomeUpcomingEventsModel> homeUpcomingEventsModelArrayList, Context context){
        this.homeUpcomingEventsModelArrayList = homeUpcomingEventsModelArrayList;
        this.context = context;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_upcoming_events_raw,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return homeUpcomingEventsModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
