package com.demo.parkinglot.Service;

import com.demo.parkinglot.Model.Receipt;
import com.demo.parkinglot.Model.Ticket;
import com.demo.parkinglot.Repository.ReceiptRepo;

import java.util.Optional;

public class ReceiptService {
    private ReceiptRepo receiptRepo;
    public Receipt generateReceipt(Optional<Ticket> ticket, Double amount) {

        Receipt receipt=new Receipt(ticket.get().getTicketId(), amount);
        receiptRepo.save(receipt);
        return receipt;
    }

    public void markSucces(Receipt receipt) {

        receipt.setPaymentStatus(Receipt.PaymentStatus.SUCCESS);
        receiptRepo.save(receipt);

    }
}
