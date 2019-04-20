package advocosoft.com.cricket.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import advocosoft.com.cricket.Activitys.Ranking;
import advocosoft.com.cricket.Comman.OnclickRate;
import advocosoft.com.cricket.Fragments.T20_A;
import advocosoft.com.cricket.Model.Ranking_A_Model;
import advocosoft.com.cricket.R;

public class Ranking_A_Adapter extends RecyclerView.Adapter<Ranking_A_Adapter.ViewHolder> {

    ArrayList<Ranking_A_Model> ranking_a_modelArrayList = new ArrayList<>();
    Ranking_A_Model ranking_a_model;
    Context context;
    Boolean fragment;
    public Ranking_A_Adapter(ArrayList<Ranking_A_Model> ranking_a_modelArrayList,Context context,Boolean fragment){
        this.ranking_a_modelArrayList = ranking_a_modelArrayList;
        this.context = context;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

//        if (fragment){
            View view = LayoutInflater.from(context).inflate(R.layout.ranking_raw_a,viewGroup,false);
            return new ViewHolder(view);
//        }else {
//            View view = LayoutInflater.from(context).inflate(R.layout.ranking_raw_b,viewGroup,false);
//            return new ViewHolder(view);
//        }

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ranking_a_model = this.ranking_a_modelArrayList.get(i);

        viewHolder.rank.setText(i+"");
        viewHolder.rate.setText((i+866)+"");
    }

    @Override
    public int getItemCount() {
        return ranking_a_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements OnclickRate {
        TextView rank,rate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rank = (TextView)itemView.findViewById(R.id.rankin_col_a);
            rate = (TextView)itemView.findViewById(R.id.rate_col_a);
            OnClickRateMethod(T20_A.team);
        }

        @Override
        public void OnClickRateMethod(Boolean item) {
            if (item){
                rate.setVisibility(View.VISIBLE);
            }else {
                rate.setVisibility(View.GONE);
            }
        }
    }

}
