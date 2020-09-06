package com.amberlion.behavioral.weatherApp;

import com.amberlion.behavioral.weatherApp.Observers.CurrentConditionsDisplay;
import com.amberlion.behavioral.weatherApp.Observers.StatisticsDisplay;
import com.amberlion.behavioral.weatherApp.Subjects.WeatherData;

public class WeatherStations {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(81.0f, 65, 45.8f);
        weatherData.setMeasurements(70.0f, 60, 35.7f);
        weatherData.setMeasurements(60.0f, 67, 40.6f);
    }
}
