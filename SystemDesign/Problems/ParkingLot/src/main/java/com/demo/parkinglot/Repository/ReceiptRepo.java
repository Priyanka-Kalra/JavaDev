package com.demo.parkinglot.Repository;

import com.demo.parkinglot.Model.Receipt;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ReceiptRepo {
    private Map<UUID, Receipt> receiptDB=new ConcurrentHashMap<>();

    public void save(Receipt receipt) {
        receiptDB.put(receipt.getReceiptId(), receipt);
    }
}
