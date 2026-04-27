package com.demo.parkinglot.Controller;

import com.demo.parkinglot.Model.Ticket;
import com.demo.parkinglot.Model.Vehicle;
import com.demo.parkinglot.Repository.TicketRepo;
import com.demo.parkinglot.Service.SlotService;
import com.demo.parkinglot.Service.TicketService;

import java.util.Optional;
import java.util.UUID;

public class EntryController {

    private SlotService slotService;
    private TicketService ticketService;

    public EntryController(SlotService slotService, TicketService ticketService) {
        this.slotService = slotService;
        this.ticketService = ticketService;
    }

    public EntryResult enterVehicle(Vehicle.VehicleType vehicleType, String vehicleNumber){

        System.out.println("Enter Vehicle");
        Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType);

        try{
            Optional<UUID> slotId=slotService.getSlot(vehicleType).map(slot->slot.getSlotId());

            if(slotId.isEmpty())return new EntryResult(false,null,null,"No slot found");

            Ticket ticket=ticketService.generateTicket(vehicle.getVehicleId() ,vehicleType,slotId.get());

            System.out.println("Vehicle enetry success");
            return new EntryResult(true,ticket.getTicketId(),slotId.get(),"Vehicle enetry success");

        }
        catch (Exception e){
            return new EntryResult(false,null,null,e.getMessage());
        }
    }


    public static class EntryResult{

        private final boolean isSuccess;
        private final UUID ticketId;
        private final UUID slotId;
        private final String message;

        public EntryResult(boolean isSuccess, UUID ticketId, UUID slotId, String message) {
            this.isSuccess = isSuccess;
            this.ticketId = ticketId;
            this.slotId = slotId;
            this.message = message;
        }

        public boolean isSuccess() {
            return isSuccess;
        }

        public UUID getTicketId() {
            return ticketId;
        }

        public UUID getSlotId() {
            return slotId;
        }

        public String getMessage() {
            return message;
        }
    }
}
