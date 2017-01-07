package com.oneweather.sunyb3.oneweather.gson;

/**
 * Created by sunyb3 on 17-1-7.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
