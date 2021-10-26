package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    public static final String TAG = "WeatherActivity";

  

    private void commit() {
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i( "Weather","onStart() called");
    }

    @Override
    public void onResume() {
        super.onResume();
       Log.i( "Weather","onResume() called");
    }

    @Override
    public void onPause() {
        super.onPause();
       Log.i( "Weather","onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
           Log.i( "Weather","onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i( "Weather", "onDestroy() called");
    }
  /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment lmeow = ForecastFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, lmeow).commit();
        Log.i("Weather", "onCreate: ");
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment ff = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, ff).commit();
    }
}
