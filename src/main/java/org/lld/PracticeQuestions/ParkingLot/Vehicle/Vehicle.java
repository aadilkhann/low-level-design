package org.lld.PracticeQuestions.ParkingLot.Vehicle;

import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot;

public abstract class Vehicle {
    String numberPlate;

    public Vehicle(String numberPlate){
        this.numberPlate=numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public abstract VehicleType getType();

//    public void parkinSpot(ParkingSpot parkingSpot){
//
//    }
//
//    public void clearSpot(){
//
//    }

}
