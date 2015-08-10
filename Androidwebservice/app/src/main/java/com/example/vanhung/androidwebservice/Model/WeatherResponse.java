package com.example.vanhung.androidwebservice.Model;

import com.example.vanhung.androidwebservice.Model.Weather;

import java.util.List;

/**
 * Created by vanhung on 10/08/2015.
 */
public class WeatherResponse {

    private int cod;
    private String base;
    private List<Weather> weather;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
