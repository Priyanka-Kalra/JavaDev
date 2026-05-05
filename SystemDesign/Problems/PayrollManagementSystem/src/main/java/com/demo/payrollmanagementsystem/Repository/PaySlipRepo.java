package com.demo.payrollmanagementsystem.Repository;

import com.demo.payrollmanagementsystem.Model.PaySlip;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PaySlipRepo {

    private Map<UUID, PaySlip> paySlipDB=new ConcurrentHashMap<>();


    public void save(PaySlip paySlip) {
        paySlipDB.put(paySlip.getPaySlipId(), paySlip);
    }
}
