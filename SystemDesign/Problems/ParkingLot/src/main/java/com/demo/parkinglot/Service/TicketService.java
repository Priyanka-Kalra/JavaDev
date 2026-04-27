package com.demo.parkinglot.Service;

import com.demo.parkinglot.Model.Ticket;
import com.demo.parkinglot.Model.Vehicle;
import com.demo.parkinglot.Repository.TicketRepo;

import java.util.Optional;
import java.util.UUID;

public class TicketService {
    private TicketRepo ticketRepo;

    public TicketService(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public Ticket generateTicket(UUID vehicleId, Vehicle.VehicleType vehicleType, UUID slotId) {

        Ticket ticket=new Ticket(vehicleId,vehicleType,slotId);
        ticketRepo.save(ticket);
        return ticket;
    }

    public Optional<Ticket> getTicket(UUID ticketId) {
        return ticketRepo.getTicket(ticketId);
    }

    public void deactivate(Ticket ticket) {
        ticket.setActive(false);
        ticketRepo.save(ticket);
    }
}

