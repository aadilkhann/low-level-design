package org.lld.PracticeQuestions.ParkingLot;

import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingFloor;
import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingLot;
import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot.BikeSpot;
import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot.CarSpot;
import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingSpot.TruckSpot;
import org.lld.PracticeQuestions.ParkingLot.Infrastructure.ParkingTicket;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Bike;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Car;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Truck;
import org.lld.PracticeQuestions.ParkingLot.Vehicle.Vehicle;

import java.util.UUID;

public class Simulation {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();


        ParkingFloor floor0=new ParkingFloor(0);
        ParkingFloor floor1=new ParkingFloor(1);
        ParkingFloor floor2=new ParkingFloor(2);

        floor0.addParkingSpot(new CarSpot(UUID.randomUUID().toString(),0));
        floor0.addParkingSpot(new CarSpot(UUID.randomUUID().toString(),0));
        floor0.addParkingSpot(new BikeSpot(UUID.randomUUID().toString(),0));
        floor0.addParkingSpot(new TruckSpot(UUID.randomUUID().toString(),0));
        floor1.addParkingSpot(new CarSpot(UUID.randomUUID().toString(),1));
        floor1.addParkingSpot(new CarSpot(UUID.randomUUID().toString(),1));

        parkingLot.addParkingFloor(floor0);
        parkingLot.addParkingFloor(floor1);

        Vehicle car=new Car("KA-01-1111");
        Vehicle bike=new Bike("KA-01-2222");
        Vehicle truck=new Truck("KA-01-3333");

        ParkingTicket carTicket=parkingLot.parkVehicle(car);
        ParkingTicket bikeTicket=parkingLot.parkVehicle(bike);
        ParkingTicket truckTicket=parkingLot.parkVehicle(truck);

        parkingLot.unparkVehicle(car);
        parkingLot.unparkVehicle(bike);


    }
}
