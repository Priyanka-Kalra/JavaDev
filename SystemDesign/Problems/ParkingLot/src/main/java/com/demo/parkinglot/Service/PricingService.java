package com.demo.parkinglot.Service;

import com.demo.parkinglot.Model.PricingRule;
import com.demo.parkinglot.Model.Ticket;
import com.demo.parkinglot.Model.Vehicle;
import com.demo.parkinglot.Repository.PricingRepo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.UUID;

public class PricingService {
    private PricingRepo pricingRepo;

    private double computePriceHelper(Vehicle.VehicleType vehicleType,Ticket ticket){

        //FETCHING PRICING STRATEGY
        UUID strategyId=pricingRepo.findStrategyByVehicle(vehicleType);
        PricingRule pricingStrategy=pricingRepo.findStrategyById(strategyId);
        Double hourlyRate=pricingStrategy.getRatePerHour();
        Double flatRate=pricingStrategy.getFlatRate();

        //computing time
        LocalDateTime start=ticket.getDateTime();
        LocalDateTime end=LocalDateTime.now();
        Long minutes= ChronoUnit.MINUTES.between(start, end);
        int time=(int)(minutes/60);//time in hrs

        return Math.min(flatRate, hourlyRate*time);

    }
    public Double computePrice(Optional<Ticket> ticket) {

        //getting vehicle details from ticket id
        UUID vehicleId = ticket.get().getVehicleId();
        Vehicle.VehicleType vehicleType = ticket.get().getVehicleType();
        return computePriceHelper(vehicleType,ticket.get());

    }
}
