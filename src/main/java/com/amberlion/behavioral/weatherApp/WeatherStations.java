package com.amberlion.behavioral.weatherApp;

import com.amberlion.behavioral.weatherApp.Observers.CurrentConditionsDisplay;
import com.amberlion.behavioral.weatherApp.Subjects.WeatherData;

public class WeatherStations {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80.6f, 65, 45.8f);
        weatherData.setMeasurements(75.7f, 60, 35.7f);
        weatherData.setMeasurements(76.0f, 67, 40.6f);
    }
}
