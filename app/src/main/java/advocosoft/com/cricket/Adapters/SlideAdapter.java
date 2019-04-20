package advocosoft.com.cricket.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

import advocosoft.com.cricket.Model.ViewPagerHomeModel;
import advocosoft.com.cricket.R;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by mukku on 1/5/2018.
 */

public class SlideAdapter extends PagerAdapter{
    private Context context;
    private LayoutInflater layoutInflater;
    private List<ViewPagerHomeModel> testimonialsItemList;
    ViewPagerHomeModel viewPagerHomeModel;


//    public int[] list_images = {R.drawable.imaga,R.drawable.imagb,R.drawable.imagc};
//    public String[] list_title = {"image 1","image 2","image 3"};
//    public String[] list_description = {"Description 1","Description 2","Description 3"};
    public SlideAdapter(List<ViewPagerHomeModel> testimonialsItemList, Context context) {
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
        View view = layoutInflater.inflate(R.layout.view_pager_home_raw, null);
        viewPagerHomeModel = testimonialsItemList.get(position);

//        CircleImageView imageView = (CircleImageView) view.findViewById(R.id.slideimg);
//        TextView txt_test_title=(TextView) view.findViewById(R.id.txttitle);
//        TextView txt_test_description=(TextView) view.findViewById(R.id.txtdescription);

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
