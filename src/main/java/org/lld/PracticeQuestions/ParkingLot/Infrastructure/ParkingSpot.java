package org.lld.PracticeQuestions.ParkingLot.Infrastructure;

import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.VehicleType;

public class ParkingSpot {
    String spotId;
    boolean isFree;
    VehicleType spotType;
    Vehicle currentVehicle;

    public ParkingSpot(String id,VehicleType spotType){
        spotId=id;
        this.spotType=spotType;
    }

    public boolean parkVehicle(Vehicle currentVehicle){
        isFree=false;
        this.currentVehicle=currentVehicle;
        return false;
    }

    public boolean unParkVehicle(){
        isFree=true;
        this.currentVehicle=null;
        return true;
    }

    public boolean isAvailable(){
        return isFree;
    }

    public boolean canFitVehicle(Vehicle currentVehicle){
        //Logic Pending
        return true;
    }
    
}
