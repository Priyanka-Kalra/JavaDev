package com.demo.parkinglot.Model;


import java.util.UUID;

public class Vehicle {

    private UUID vehicleId;
    private String vehicleNumber;
    private VehicleType vehicleType;

    public enum VehicleType{ BIKE,CAR,TRUCK,EV }

    public Vehicle( String vehicleNumber, VehicleType vehicleType) {
        this.vehicleId = UUID.randomUUID();
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
