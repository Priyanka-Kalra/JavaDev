package com.demo.parkinglot.Model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {

    private UUID ticketId;
    private UUID vehicleId;
    private UUID slotId;
    private LocalDateTime dateTime;
    private boolean isActive;
    private Vehicle.VehicleType vehicleType;

    public Ticket(UUID vehicleId,Vehicle.VehicleType vehicleType, UUID slotId) {
        this.ticketId = UUID.randomUUID();
        this.vehicleId = vehicleId;
        this.slotId = slotId;
        this.dateTime = LocalDateTime.now();
        this.isActive = true;
        this.vehicleType = vehicleType;
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

    public UUID getSlotId() {
        return slotId;
    }

    public void setSlotId(UUID slotId) {
        this.slotId = slotId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Vehicle.VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle.VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
