package advocosoft.com.cricket.Activitys;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import advocosoft.com.cricket.Fragments.Homefragment;
import advocosoft.com.cricket.Fragments.MoreFragment;
import advocosoft.com.cricket.Fragments.PollFragment;
import advocosoft.com.cricket.Fragments.RecentFragment;
import advocosoft.com.cricket.Fragments.UpComingFragment;
import advocosoft.com.cricket.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    @BindView(R.id.share_icon) ImageView share_icon;

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    share_icon.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.app_name);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Homefragment()).commit();
                    return true;
                case R.id.navigation_poll:
                    share_icon.setVisibility(View.GONE);
                    mTextMessage.setText(R.string.title_poll);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new PollFragment()).commit();
                    return true;
                case R.id.navigation_more:
                    share_icon.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.title_more);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MoreFragment()).commit();
                    return true;
                case R.id.navigation_recent:
                    share_icon.setVisibility(View.GONE);
                    mTextMessage.setText(R.string.title_recent);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new RecentFragment()).commit();
                    return true;
                case R.id.navigation_upcoming:
                    share_icon.setVisibility(View.GONE);
                    mTextMessage.setText(R.string.title_upcoming);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new UpComingFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);
        share_icon.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new Homefragment()).commit();
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
