package org.lld.PracticeQuestions.ParkingLot.Vehicle;

public class Bike extends Vehicle{

    public Bike(String numberPlate){
        super(numberPlate);

    }
    @Override
    public VehicleType getType(){
        return VehicleType.BIKE;
    }

}
