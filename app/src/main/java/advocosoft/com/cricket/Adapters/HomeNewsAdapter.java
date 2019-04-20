package advocosoft.com.cricket.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.shape.CutCornerTreatment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.florent37.shapeofview.shapes.CutCornerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import advocosoft.com.cricket.Model.HomeNewsModel;
import advocosoft.com.cricket.R;

public class HomeNewsAdapter extends RecyclerView.Adapter<HomeNewsAdapter.ViewHolder> {

    ArrayList<HomeNewsModel> homeNewsModelArrayList = new ArrayList<>();
    HomeNewsModel homeNewsModel;
    Context context;

    public HomeNewsAdapter(ArrayList<HomeNewsModel> homeNewsModelArrayList,Context context){
        this.homeNewsModelArrayList = homeNewsModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.home_news_raw,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        homeNewsModel = this.homeNewsModelArrayList.get(i);

    }

    @Override
    public int getItemCount() {
        return homeNewsModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title,description;
        CutCornerView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.title_news);
            description = (TextView)itemView.findViewById(R.id.description_news);
            imageView = (CutCornerView)itemView.findViewById(R.id.clipCorner);
        }
    }
}
