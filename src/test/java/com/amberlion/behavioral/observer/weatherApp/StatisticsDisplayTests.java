package com.amberlion.behavioral.observer.weatherApp;

import com.amberlion.behavioral.observer.weatherApp.Observers.StatisticsDisplay;
import com.amberlion.behavioral.observer.weatherApp.Subjects.WeatherData;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class StatisticsDisplayTests
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMaxTempeature()
    {
        WeatherData weatherData = new WeatherData();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(81.0f, 65, 45.8f);
        weatherData.setMeasurements(70.0f, 60, 35.7f);
        weatherData.setMeasurements(60.0f, 67, 40.6f);

        assertEquals(statisticsDisplay.getMaxTemp(), 81.0f, 0);
    }
    @Test
    public void testMinTempeature()
    {
        WeatherData weatherData = new WeatherData();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(81.0f, 65, 45.8f);
        weatherData.setMeasurements(70.0f, 60, 35.7f);
        weatherData.setMeasurements(60.0f, 67, 40.6f);

        assertEquals(statisticsDisplay.getMinTemp(), 60.0f, 0);
    }
}
