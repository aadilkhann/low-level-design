package org.lld.PracticeQuestions.ParkingLot.Vehicle;

public abstract class Vehicle {
    String numberPlate;

    public Vehicle(String numberPlate){
        this.numberPlate=numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public abstract VehicleType getType();

}
