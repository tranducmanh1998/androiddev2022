package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment ff = ForecastFragment.newInstance(", ")
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, ff).commit();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag "Weather", msg "onStart() called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag "Weather", msg "onResume() called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag "Weather", msg "onPause() called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag "Weather", msg "onStop() called");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag "Weather", msg "onDestroy() called");
        }
    }
}