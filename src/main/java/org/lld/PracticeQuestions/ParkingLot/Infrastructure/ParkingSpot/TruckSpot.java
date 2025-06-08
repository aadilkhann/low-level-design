package org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot;

import org.lld.PracticeQuestions.ParkingLot.Vehicle.Truck;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;

public class TruckSpot extends ParkingSpot {


    public TruckSpot(String spotId, int floorNo) {
        super(spotId, floorNo);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicleType) {
        return vehicleType instanceof Truck;
    }
}
