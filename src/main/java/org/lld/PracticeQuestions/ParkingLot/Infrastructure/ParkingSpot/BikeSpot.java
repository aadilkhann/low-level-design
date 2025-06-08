package org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot;

import org.lld.PracticeQuestions.ParkingLot.Vehicle.Bike;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;

public class BikeSpot extends ParkingSpot {

    public BikeSpot(String spotId, int floorNo) {
        super(spotId, floorNo);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicleType) {
        return vehicleType instanceof Bike;
    }
}
