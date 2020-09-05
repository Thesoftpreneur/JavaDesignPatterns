package com.amberlion.behavioral.weatherApp;

import com.amberlion.behavioral.weatherApp.Observers.CurrentConditionsDisplay;
import com.amberlion.behavioral.weatherApp.Subjects.WeatherData;

public class WeatherStations {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

    }
}
