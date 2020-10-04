package com.amberlion.behavioral.observer.weatherApp;

import com.amberlion.behavioral.observer.weatherApp.Observers.StatisticsDisplay;
import com.amberlion.behavioral.observer.weatherApp.Observers.CurrentConditionsDisplay;
import com.amberlion.behavioral.observer.weatherApp.Subjects.WeatherData;

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
