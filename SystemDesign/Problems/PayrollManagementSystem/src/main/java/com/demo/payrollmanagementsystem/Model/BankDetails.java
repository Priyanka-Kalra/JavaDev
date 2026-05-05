package com.demo.payrollmanagementsystem.Model;

import java.util.UUID;

public class BankDetails {
    private final UUID accountNumber;
    private String branchName;
    private String banKId;//like an IFSC

    public BankDetails(UUID accountNumber, String branchName, String banKId) {
        this.accountNumber = accountNumber;
        this.branchName = branchName;
        this.banKId = banKId;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }


    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBanKId() {
        return banKId;
    }

    public void setBanKId(String banKId) {
        this.banKId = banKId;
    }
}
