package com.oneweather.sunyb3.oneweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by sunyb3 on 17-1-7.
 */

public class HttpUtil {
public static void sendOkhttpRequest(String address,okhttp3.Callback call){
    OkHttpClient client=new OkHttpClient();
    Request request=new Request.Builder().url(address).build();
    client.newCall(request).enqueue(call);
}


}
