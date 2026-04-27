package com.demo.parkinglot.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLevel {

    private UUID levelId;
    private int floorNumber;
    private List<ParkingSlot> slots;

    public ParkingLevel( int floorNumber) {
        this.levelId =UUID.randomUUID();
        this.floorNumber = floorNumber;
        this.slots = new ArrayList<>();
    }

    public UUID getLevelId() {
        return levelId;
    }

    public void setLevelId(UUID levelId) {
        this.levelId = levelId;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }
}
