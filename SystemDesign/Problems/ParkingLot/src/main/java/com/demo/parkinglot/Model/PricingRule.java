package com.demo.parkinglot.Model;

import java.util.UUID;

public class PricingRule {

    private UUID id;
    private Vehicle.VehicleType vehicleType;
    private double ratePerHour;
    private double flatRate;

    public PricingRule(Vehicle.VehicleType vehicleType, double ratePerHour, double flatRate) {
        this.id = UUID.randomUUID();
        this.vehicleType = vehicleType;
        this.ratePerHour = ratePerHour;
        this.flatRate = flatRate;
    }

    public UUID getId() {
        return id;
    }

    public Vehicle.VehicleType getVehicleType() {
        return vehicleType;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public double getFlatRate() {
        return flatRate;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setVehicleType(Vehicle.VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public void setFlatRate(double flatRate) {
        this.flatRate = flatRate;
    }
}

