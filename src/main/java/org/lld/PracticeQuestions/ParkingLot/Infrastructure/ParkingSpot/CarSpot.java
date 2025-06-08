package org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot;

import org.lld.PracticeQuestions.ParkingLot.Vehicle.Car;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;

public class CarSpot extends ParkingSpot{
    public CarSpot(String spotId, int floorNo) {
        super(spotId, floorNo);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicleType){
        return vehicleType instanceof Car;
    }
}
