package com.demo.parkinglot.Repository;

import com.demo.parkinglot.Model.ParkingSlot;
import com.demo.parkinglot.Model.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SlotRepo {
    private Map<UUID, ParkingSlot> slots=new ConcurrentHashMap<>();

    public Optional<ParkingSlot> getSlot(Vehicle.VehicleType vehicleType) {

        Optional<ParkingSlot> slot= slots.values().stream().filter(slot->slot.getSlotType()==vehicleType && !slot.isOccupied()).findFirst();
        if(slot.isPresent()) {
            slot.get().setOccupied(true);
            slots.put(slot.get().getSlotId(),slot.get());
        }
        return slot;

    }

    public ParkingSlot findByID(UUID slotId) {
        return slots.get(slotId);
    }

    public void saveSlot(ParkingSlot slot) {
        slots.put(slot.getSlotId(),slot);
    }
}
