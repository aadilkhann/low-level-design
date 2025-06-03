package org.lld.PracticeQuestions.ParkingLot.Infrastructure;

import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;

import java.util.List;
import java.util.UUID;

public class Level {
    int floor;
    List<ParkingSpot> spots;
    int availableSpot;

    public Level(int floor,int availableSpot){
        this.floor=floor;
        this.availableSpot=availableSpot;
    }

    public boolean parkVehicle(Vehicle vehicle){
        spots.add(new ParkingSpot(UUID.randomUUID().toString(),vehicle.getType()));
    }
}
