package org.lld.PracticeQuestions.ParkingLot.Vehicle;

public class VehicleFactory {
    static  Vehicle createVehicle(String type, String numberPlate){
        switch (type){
            case "CAR" : return new Car(numberPlate);
            case "BIKE" : return new Bike(numberPlate);
            case "TRUCK" : return new Truck(numberPlate);
            default: throw new IllegalArgumentException("Unkown Vehicle Type");
        }
    }
}
