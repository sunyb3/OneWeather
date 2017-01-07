package com.oneweather.sunyb3.oneweather.util;

import com.google.gson.Gson;
import com.oneweather.sunyb3.oneweather.gson.Weather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Created by sunyb3 on 17-1-7.
 * Gson解析
 */

public class Utility {
    public static Weather handleWeatherResponse(String response){
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather5");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent,Weather.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
      return null;
    }



}
