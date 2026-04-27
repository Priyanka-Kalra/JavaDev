package com.demo.parkinglot.Model;

import java.util.UUID;

public class ParkingSlot {

    private UUID slotId;
    private int floorNumber;
    private Vehicle.VehicleType slotType;
    private boolean isOccupied;

    public ParkingSlot( int floorNumber, Vehicle.VehicleType slotType) {
        this.slotId = UUID.randomUUID();
        this.floorNumber = floorNumber;
        this.slotType = slotType;
        this.isOccupied = false;
    }

    public UUID getSlotId() {
        return slotId;
    }

    public void setSlotId(UUID slotId) {
        this.slotId = slotId;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Vehicle.VehicleType getSlotType() {
        return slotType;
    }

    public void setSlotType(Vehicle.VehicleType slotType) {
        this.slotType = slotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
