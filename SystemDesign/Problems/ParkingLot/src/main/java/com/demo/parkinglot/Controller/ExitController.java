package com.demo.parkinglot.Controller;

import com.demo.parkinglot.Adapters.RazorPayAdapter;
import com.demo.parkinglot.Interface.PaymentMethodGateway;
import com.demo.parkinglot.Model.Payment;
import com.demo.parkinglot.Model.Receipt;
import com.demo.parkinglot.Model.Ticket;
import com.demo.parkinglot.Service.*;

import java.util.Optional;
import java.util.UUID;


public class ExitController {

    private SlotService slotService;
    private TicketService ticketService;
    private PricingService pricingService;
    private PaymentService paymentService;
    private ReceiptService receiptService;

    public ExitController(SlotService slotService, TicketService ticketService, PricingService pricingService, PaymentService paymentService, ReceiptService receiptService) {
        this.slotService = slotService;
        this.ticketService = ticketService;
        this.pricingService = pricingService;
        this.paymentService = paymentService;
        this.receiptService = receiptService;
    }


    public ExitResult exitVehicle(UUID ticketId) {

        System.out.println("Exit Vehicle");

        try{
            Optional<Ticket> ticket=ticketService.getTicket(ticketId);
            if(ticket.isEmpty())return new ExitResult(ticketId,0,false,"Ticket not found");

            Double amount=pricingService.computePrice(ticket);

            boolean paymentSuccess=paymentService.paymentWithRetry(ticketId,amount,new RazorPayAdapter(), Payment.PaymentGateway.RAZORPAY,3);

            if(! paymentSuccess)return new ExitResult(ticketId,amount,false,"Payment failed");
            //admin logic of overriding

            Receipt receipt=receiptService.generateReceipt(ticket,amount);
            receiptService.markSucces(receipt);

            slotService.releaseSlot(ticket.get().getSlotId());
            ticketService.deactivate(ticket.get());

            return new ExitResult(ticketId,amount,true,"Vehicle exit successfully");

        }
        catch(Exception e){
            return new ExitResult(ticketId,0,false,e.getMessage());
        }
    }



    }


    public static class ExitResult{

        private final UUID ticketId;
        private final double amt;
        private final boolean success;
        private final String message;

        public ExitResult(UUID ticketId, double amt, boolean success, String message) {
            this.ticketId = ticketId;
            this.amt = amt;
            this.success = success;
            this.message = message;
        }

        public UUID getTicketId() {
            return ticketId;
        }

        public double getAmt() {
            return amt;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }
    }