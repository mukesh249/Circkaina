package advocosoft.com.cricket.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.florent37.shapeofview.shapes.CutCornerView;

import java.util.ArrayList;

import advocosoft.com.cricket.Model.HomeNewsModel;
import advocosoft.com.cricket.Model.T20MatchRecentModel;
import advocosoft.com.cricket.R;

public class T20MatechRecentAdapter extends RecyclerView.Adapter<T20MatechRecentAdapter.ViewHolder> {

    ArrayList<T20MatchRecentModel> t20MatchRecentModelArrayList = new ArrayList<>();
    T20MatchRecentModel t20MatchRecentModel;
    Context context;

    public T20MatechRecentAdapter(ArrayList<T20MatchRecentModel> t20MatchRecentModelArrayList, Context context){
        this.t20MatchRecentModelArrayList = t20MatchRecentModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recent_raw,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        t20MatchRecentModel = this.t20MatchRecentModelArrayList.get(i);

    }

    @Override
    public int getItemCount() {
        return t20MatchRecentModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

//        TextView title,description;
//        CutCornerView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            title = (TextView)itemView.findViewById(R.id.title_news);
//            description = (TextView)itemView.findViewById(R.id.description_news);
//            imageView = (CutCornerView)itemView.findViewById(R.id.clipCorner);
        }
    }
}
