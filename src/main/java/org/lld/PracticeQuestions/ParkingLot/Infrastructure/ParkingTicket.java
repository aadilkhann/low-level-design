package org.lld.PracticeQuestions.ParkingLot.Infrastructure;

import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot.ParkingSpot;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;

import java.time.LocalDateTime;

public class ParkingTicket {
    private final String id;
    private final Vehicle  vehicle;
    private final ParkingSpot  parkingSpot;
    private final LocalDateTime entranceTime;

    public ParkingTicket(String id, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.id = id;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entranceTime = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntranceTime() {
        return entranceTime;
    }
}
