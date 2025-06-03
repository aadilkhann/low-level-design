package org.lld.PracticeQuestions.ParkingLot.Vehicle;

public class VehicleFactory {
    static  Vehicle createVehicle(String type){
        switch (type){
            case "CAR" : return new Car();
            case "BIKE" : return new Bike();
            case "TRUCK" : return new Truck();
            default: throw new IllegalArgumentException("Unkown Vehicle Type");
        }
    }
}
