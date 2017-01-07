package com.oneweather.sunyb3.oneweather;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sunyb3 on 17-1-7.
 */

public class WeatherFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.activity_weather,container,false);
        return view;

    }

}
