package com.demo.parkinglot.Service;

import com.demo.parkinglot.Model.ParkingSlot;
import com.demo.parkinglot.Model.Vehicle;
import com.demo.parkinglot.Repository.SlotRepo;

import java.util.Optional;
import java.util.UUID;

public class SlotService {

    private SlotRepo slotRepo;
    public SlotService(SlotRepo slotRepo) {
        this.slotRepo = slotRepo;
    }
    public Optional<ParkingSlot> getSlot(Vehicle.VehicleType vehicleType) {
        return slotRepo.getSlot(vehicleType);

    }

    public void releaseSlot(UUID slotId) {

        ParkingSlot slot=slotRepo.findByID(slotId);
        slot.setOccupied(false);
        slotRepo.saveSlot(slot);

    }
}
