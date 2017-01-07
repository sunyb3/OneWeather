package com.oneweather.sunyb3.oneweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sunyb3 on 17-1-7.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
