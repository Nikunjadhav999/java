package com.java.wipro.designpattern.builder.builders;

import com.java.wipro.designpattern.builder.cars.CarType;
import com.java.wipro.designpattern.builder.components.Engine;
import com.java.wipro.designpattern.builder.components.GPSNavigator;
import com.java.wipro.designpattern.builder.components.Transmission;
import com.java.wipro.designpattern.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}