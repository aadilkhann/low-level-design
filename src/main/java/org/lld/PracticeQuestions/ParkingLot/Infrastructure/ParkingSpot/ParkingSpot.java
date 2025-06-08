package org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot;

import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.VehicleType;

public abstract class ParkingSpot {
    private final String spotId;
    private final int floorNo;
    private boolean isFree;

    public ParkingSpot(String spotId, int floorNo) {
        this.spotId = spotId;
        this.floorNo = floorNo;
        this.isFree = true;
    }

    public String getSpotId() {
        return spotId;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public boolean isFree() {
        return isFree;
    }

    public void occupySpace() {
        this.isFree = false;
    }

    public void freeSpace() {
        this.isFree = true;
    }

    public abstract boolean canFitVehicle(Vehicle vehicleType);
}
