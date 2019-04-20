package advocosoft.com.cricket.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import advocosoft.com.cricket.Adapters.HomeNewsAdapter;
import advocosoft.com.cricket.Model.HomeNewsModel;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsActivity extends AppCompatActivity {

    @BindView(R.id.recyclerview_news) RecyclerView recyclerview_news;
    @BindView(R.id.news_toolbar) Toolbar news_toolbar;

    HomeNewsAdapter newsAdapter;
    ArrayList<HomeNewsModel> newsModelArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ButterKnife.bind(this,this);
        setSupportActionBar(news_toolbar);
        getSupportActionBar().setTitle("News");

        for (int i= 0;i<30;i++){
            HomeNewsModel newsModel =new HomeNewsModel();
            newsModelArrayList.add(newsModel);
        }

        recyclerview_news.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        newsAdapter = new HomeNewsAdapter(newsModelArrayList,NewsActivity.this);
        recyclerview_news.setAdapter(newsAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
