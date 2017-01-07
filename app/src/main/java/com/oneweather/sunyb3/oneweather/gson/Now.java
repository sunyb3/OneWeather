package com.oneweather.sunyb3.oneweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sunyb3 on 17-1-7.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
