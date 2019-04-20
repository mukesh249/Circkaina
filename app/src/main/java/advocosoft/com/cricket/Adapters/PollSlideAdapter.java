package advocosoft.com.cricket.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

import advocosoft.com.cricket.Model.ViewPagerHomeModel;
import advocosoft.com.cricket.R;

/**
 * Created by mukku on 1/5/2018.
 */

public class PollSlideAdapter extends PagerAdapter{
    private Context context;
    private LayoutInflater layoutInflater;
    private List<ViewPagerHomeModel> testimonialsItemList;
    ViewPagerHomeModel viewPagerHomeModel;

//    public int[] list_images = {R.drawable.imaga,R.drawable.imagb,R.drawable.imagc};
//    public String[] list_title = {"image 1","image 2","image 3"};
//    public String[] list_description = {"Description 1","Description 2","Description 3"};
    public PollSlideAdapter(List<ViewPagerHomeModel> testimonialsItemList, Context context) {
        this.testimonialsItemList = testimonialsItemList;
        this.context = context;
    }
    @Override
    public int getCount() {
        return testimonialsItemList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {return view == object;    }

    @Override
    public Object instantiateItem(ViewGroup container,final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.poll_on_raw, null);
        viewPagerHomeModel = testimonialsItemList.get(position);

        Button submit = (Button) view.findViewById(R.id.submit_btn);
        final RelativeLayout form =(RelativeLayout) view.findViewById(R.id.form);
        final RelativeLayout bar_chart_rel = (RelativeLayout)view.findViewById(R.id.bar_chart_rel);
//        final BarChart barChart=(BarChart) view.findViewById(R.id.bar_chart);
        form.setVisibility(View.VISIBLE);
        bar_chart_rel.setVisibility(View.GONE);

//
//        int startColor1 = ContextCompat.getColor(context, android.R.color.holo_orange_light);
//        int startColor2 = ContextCompat.getColor(context, android.R.color.holo_blue_light);
//        int startColor3 = ContextCompat.getColor(context, android.R.color.holo_orange_light);
//        int endColor1 = ContextCompat.getColor(context, android.R.color.holo_blue_dark);
//        int endColor2 = ContextCompat.getColor(context, android.R.color.holo_purple);
//        int endColor3 = ContextCompat.getColor(context, android.R.color.holo_green_dark);
//
//        List<GradientColor> gradientColors = new ArrayList<>();
//        gradientColors.add(new GradientColor(startColor1, endColor1));
//        gradientColors.add(new GradientColor(startColor2, endColor2));
//        gradientColors.add(new GradientColor(startColor3, endColor3));
//
//
//        List<BarEntry> entries = new ArrayList<>();
//        entries.add(new BarEntry(0f, 10f));
//        entries.add(new BarEntry(1f, 20f));
//        entries.add(new BarEntry(2f, 30f));
//
//        BarDataSet set = new BarDataSet(entries, "BarDataSet");
//        set.setGradientColors(gradientColors);
//
//        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
//        dataSets.add(set);
//        BarData data = new BarData(dataSets);
//        data.setBarWidth(0.9f); // set custom bar width
//        barChart.setData(data);
//        barChart.setPinchZoom(false);
////        barChart.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
//        barChart.setDoubleTapToZoomEnabled(false);
//        barChart.setFitBars(true); // make the x-axis fit exactly all bars
//        barChart.invalidate();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                form.setVisibility(View.GONE);
                bar_chart_rel.setVisibility(View.VISIBLE);
            }
        });

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}
