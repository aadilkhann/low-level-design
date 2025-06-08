package org.lld.PracticeQuestions.ParkingLot.Infrastructure;

import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot.ParkingSpot;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private final int floorNo;
    private final List<ParkingSpot> parkingSpotList;

    //Redundant
    public ParkingFloor(int floorNo, List<ParkingSpot> parkingSpotList) {
        this.floorNo = floorNo;
        this.parkingSpotList = new ArrayList<>();
    }

    public ParkingFloor(int floorNo) {
        this.floorNo = floorNo;
        this.parkingSpotList = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.add(parkingSpot);
    }

    public ParkingSpot getAvailableParkingSpot(Vehicle  vehicle) {
        for (ParkingSpot parkingSpot : parkingSpotList) {
            if (parkingSpot.isFree() && parkingSpot.canFitVehicle(vehicle)) {
                parkingSpot.occupySpace();
                return parkingSpot;
            }
        }
        return null;
    }

    public void releaseParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.freeSpace();
    }

    public int getFloorNo() {
        return floorNo;
    }
}
