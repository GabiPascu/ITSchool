package ro.itschool.project.utils.design_patterns;

import java.util.Vector;

public class FactoryExample {
}

abstract class Vehicle {
    //...common properties & methods (name, speed(), etc...)
}

class Truck extends Vehicle {
    //...truck common properties & methods
}

class Car extends Vehicle {
    //...car common properties & methods
}

class Bicycle extends Vehicle {
    //...bicycle common properties & methods
}

class VehicleFactory {

    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "truck":
                return new Truck();
            case "car":
                return new Car();
            case "bicycle":
                return new Bicycle();
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }
}
