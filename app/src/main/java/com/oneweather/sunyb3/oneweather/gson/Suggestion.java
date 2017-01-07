package com.oneweather.sunyb3.oneweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sunyb3 on 17-1-7.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;

    }


    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
