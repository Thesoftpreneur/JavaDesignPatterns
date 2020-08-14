package com.amberlion.creational.builder.carFactory.builders;

import com.amberlion.creational.builder.carFactory.cars.Car;
import com.amberlion.creational.builder.carFactory.cars.Type;
import com.amberlion.creational.builder.carFactory.components.Engine;
import com.amberlion.creational.builder.carFactory.components.GPSNavigator;
import com.amberlion.creational.builder.carFactory.components.Transmission;
import com.amberlion.creational.builder.carFactory.components.TripComputer;

public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
