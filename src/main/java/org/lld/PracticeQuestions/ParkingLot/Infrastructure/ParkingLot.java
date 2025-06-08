package org.lld.PracticeQuestions.ParkingLot.Infrastructure;

import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot.ParkingSpot;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;

import java.util.*;

public class ParkingLot {
    private final List<ParkingFloor> parkingFloors;
    private final Map<Vehicle, ParkingTicket> ticketMap;

    public ParkingLot() {
        this.parkingFloors = new ArrayList<>();
        this.ticketMap = new HashMap<>();
    }

    public void addParkingFloor(ParkingFloor floor) {
        parkingFloors.add(floor);
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : parkingFloors) {
            ParkingSpot parkingSpot = floor.getAvailableParkingSpot(vehicle);
            if(parkingSpot != null) {
                ParkingTicket ticket=new ParkingTicket(UUID.randomUUID().toString(),vehicle,parkingSpot);
                ticketMap.put(vehicle,ticket);
                System.out.println(vehicle.getType() + " with number plate "+ vehicle.getNumberPlate()+" parked at "+floor.getFloorNo()
                + " with ticket no. "+ ticket.getId() + " Date | Time "+ ticket.getEntranceTime());
                return ticket;
            }
        }
        System.out.println("No Available Parking Floor "+ vehicle.getType() + " with number plate "+ vehicle.getNumberPlate());
        return null;
    }

    public void unparkVehicle(Vehicle vehicle) {
        ParkingTicket ticket = ticketMap.get(vehicle);
        if (ticket == null) {
            System.out.println("No Vehicle with number plate "+ vehicle.getNumberPlate());
            return;
        }
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        for (ParkingFloor floor : parkingFloors) {
            if(floor.getFloorNo()==parkingSpot.getFloorNo()) {
                floor.releaseParkingSpot(parkingSpot);
                ticketMap.remove(vehicle);
                System.out.println("Vehicle Unparked "+vehicle.getType() + " with number plate "+ vehicle.getNumberPlate());
                return;
            }
        }

    }
}
