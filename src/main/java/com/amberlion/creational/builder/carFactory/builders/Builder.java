package com.amberlion.creational.builder.carFactory.builders;

import com.amberlion.creational.builder.carFactory.cars.Type;
import com.amberlion.creational.builder.carFactory.components.Engine;
import com.amberlion.creational.builder.carFactory.components.GPSNavigator;
import com.amberlion.creational.builder.carFactory.components.Transmission;
import com.amberlion.creational.builder.carFactory.components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
