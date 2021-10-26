package vn.edu.usth.usthweather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        PagerAdapter lmeow = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(lmeow);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("weather", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("weather", "onResume: ");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("weather", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("weather", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("weather", "onDestroy: ");
    }
    public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 3;
        private String titles[] = new String[] { "F1", "F2", "F3" };
        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public int getCount() {
            return PAGE_COUNT; 
        }
        @Override
        public Fragment getItem(int page) {
/
            switch (page) {
                case 0: return new WeatherAndForecastFragment();
                case 1: return new WeatherAndForecastFragment();
                case 2: return new WeatherAndForecastFragment();
            }
            return new Fragment(); 
        }
        @Override
        public CharSequence getPageTitle(int page) {
/
            return titles[page];
        }
    }
}