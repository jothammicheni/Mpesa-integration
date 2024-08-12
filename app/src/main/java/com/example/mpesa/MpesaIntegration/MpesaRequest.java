package com.example.mpesa.MpesaIntegration;

public class MpesaRequest {
    private String BusinessShortCode;
    private String Password;
    private String Timestamp;
    private String TransactionType;
    private double Amount;
    private long PartyA;
    private long PartyB;
    private long PhoneNumber;
    private String CallBackURL;
    private String AccountReference;
    private String TransactionDesc;

    public MpesaRequest(String businessShortCode, String password, String timestamp, String transactionType,
                        double amount, long partyA, long partyB, long phoneNumber,
                        String callBackURL, String accountReference, String transactionDesc) {
        BusinessShortCode = businessShortCode;
        Password = password;
        Timestamp = timestamp;
        TransactionType = transactionType;
        Amount = amount;
        PartyA = partyA;
        PartyB = partyB;
        PhoneNumber = phoneNumber;
        CallBackURL = callBackURL;
        AccountReference = accountReference;
        TransactionDesc = transactionDesc;
    }

    // Getters
    public String getBusinessShortCode() {
        return BusinessShortCode;
    }

    public String getPassword() {
        return Password;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public double getAmount() {
        return Amount;
    }

    public long getPartyA() {
        return PartyA;
    }

    public long getPartyB() {
        return PartyB;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public String getCallBackURL() {
        return CallBackURL;
    }

    public String getAccountReference() {
        return AccountReference;
    }

    public String getTransactionDesc() {
        return TransactionDesc;
    }

    // Setters
    public void setBusinessShortCode(String businessShortCode) {
        BusinessShortCode = businessShortCode;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }

    public void setTransactionType(String transactionType) {
        TransactionType = transactionType;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public void setPartyA(long partyA) {
        PartyA = partyA;
    }

    public void setPartyB(long partyB) {
        PartyB = partyB;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setCallBackURL(String callBackURL) {
        CallBackURL = callBackURL;
    }

    public void setAccountReference(String accountReference) {
        AccountReference = accountReference;
    }

    public void setTransactionDesc(String transactionDesc) {
        TransactionDesc = transactionDesc;
    }
}
