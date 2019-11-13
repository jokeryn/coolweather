package com.coolweather.android.gson;

/**
 * Created by 杨宁 on 2019/11/12.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public  String aqi;
        public String pm25;
    }
}
