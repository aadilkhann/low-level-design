package org.lld.PracticeQuestions.ParkingLot.Vehicle;

import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot;

public abstract class Vehicle {
    String numberPlate;
//    VehicleType type;

    public Vehicle(String numberPlate){
        this.numberPlate=numberPlate;
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
