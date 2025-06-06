package org.lld.PracticeQuestions.ParkingLot.Vehicle;

public class Truck extends Vehicle{

    public Truck(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public VehicleType getType(){
        return VehicleType.TRUCK;
    }
}
