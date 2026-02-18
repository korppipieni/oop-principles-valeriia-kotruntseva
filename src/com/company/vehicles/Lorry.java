package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double carryingCapacity;

    public Lorry(String brand, String carClass, double weight, Driver driver,
                 Engine engine, double carryingCapacity){
        super(brand, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nГрузоподъемность: " + carryingCapacity;
    }
}
