package com.factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if(type=="car"){
            return new Car();
        } else if(type=="bike"){
            return new Bike();
        } else {
            return null;
        }
    }
}
