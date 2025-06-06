package org.lld.PracticeQuestions.ParkingLot.Vehicle;

public class Car extends Vehicle{

    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    public VehicleType getType(){
        return VehicleType.CAR;
    }
}
