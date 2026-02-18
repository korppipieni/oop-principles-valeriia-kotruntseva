package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String brand, String carClass, double weight, Driver driver,
                    Engine engine, int maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nМаксимальная скорость: " + maxSpeed;
    }
}
