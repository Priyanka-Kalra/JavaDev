package com.demo.parkinglot.Repository;

import com.demo.parkinglot.Model.PricingRule;
import com.demo.parkinglot.Model.Vehicle;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PricingRepo {

    private Map<Vehicle.VehicleType, UUID> vehicleTypeToRule=new ConcurrentHashMap<>();//to fetch pricing rule id based on vehicle type
    private Map<UUID,PricingRule> rules=new ConcurrentHashMap<>();//fetch details of pricing uuid -fetched above


    public UUID findStrategyByVehicle(Vehicle.VehicleType vehicleType) {

        return vehicleTypeToRule.get(vehicleType);
    }

    public PricingRule findStrategyById(UUID strategyId) {
        return rules.get(strategyId);
    }
}
