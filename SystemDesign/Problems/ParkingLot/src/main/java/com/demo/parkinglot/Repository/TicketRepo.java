package com.demo.parkinglot.Repository;

import com.demo.parkinglot.Model.Ticket;
import com.demo.parkinglot.Model.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class TicketRepo {

    private Map<UUID,Ticket> ticketMap=new ConcurrentHashMap<>();

    public void save(Ticket ticket) {
        ticketMap.put(ticket.getTicketId(),ticket);
    }


    public Optional<Ticket> getTicket(UUID ticketId) {
        return Optional.ofNullable(ticketMap.get(ticketId));
    }
}
