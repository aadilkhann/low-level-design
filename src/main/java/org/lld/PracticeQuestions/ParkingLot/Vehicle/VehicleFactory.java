package org.lld.PracticeQuestions.ParkingLot.Vehicle;

public class VehicleFactory {
    static  Vehicle createVehicle(String type){
        switch (type){
            case "CAR" : return new Car("321");
            case "BIKE" : return new Bike("123");
            case "TRUCK" : return new Truck("132");
            default: throw new IllegalArgumentException("Unkown Vehicle Type");
        }
    }
}
