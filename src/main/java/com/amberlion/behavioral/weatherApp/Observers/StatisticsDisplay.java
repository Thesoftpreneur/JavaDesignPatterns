package com.amberlion.behavioral.weatherApp.Observers;


import com.amberlion.behavioral.weatherApp.Subjects.WeatherData;

import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final List<Float> temperature;

    public StatisticsDisplay(Observable observable) {
        temperature = new ArrayList<>();
        observable.addObserver(this);
    }

    @Override
    public void display() {
        DoubleSummaryStatistics doubleSummaryStatistics = temperature.stream().mapToDouble(d->d).summaryStatistics();
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n",
                doubleSummaryStatistics.getAverage(),
                doubleSummaryStatistics.getMax(),
                doubleSummaryStatistics.getMin());
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param obs   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature.add(weatherData.getTemperature());
            display();
        }
    }
}