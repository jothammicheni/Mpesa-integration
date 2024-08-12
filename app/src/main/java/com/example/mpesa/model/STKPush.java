package com.example.mpesa.model;

import com.google.gson.annotations.SerializedName;

public class STKPush {
    @SerializedName("BusinessShortCode")
    private String businessShortCode;
    @SerializedName("Password")
    private String password;
    @SerializedName("Timestamp")
    private String timestamp;
    @SerializedName("TransactionType")
    private String transactionType;
    @SerializedName("Amount")
    private String amount;  // Store amount as String
    @SerializedName("PartyA")
    private String partyA;
    @SerializedName("PartyB")
    private String partyB;
    @SerializedName("PhoneNumber")
    private String phoneNumber;
    @SerializedName("CallBackURL")
    private String callBackURL;
    @SerializedName("AccountReference")
    private String accountReference;
    @SerializedName("TransactionDesc")
    private String transactionDesc;

    public STKPush(String businessShortCode, String password, String timestamp, String transactionType,
                   int amount, String partyA, String partyB, String phoneNumber, String callBackURL,
                   String accountReference, String transactionDesc) {
        this.businessShortCode = businessShortCode;
        this.password = password;
        this.timestamp = timestamp;
        this.transactionType = transactionType;
        this.amount = String.valueOf(amount);  // Convert int to String
        this.partyA = partyA;
        this.partyB = partyB;
        this.phoneNumber = phoneNumber;
        this.callBackURL = callBackURL;
        this.accountReference = accountReference;
        this.transactionDesc = transactionDesc;
    }

    // Getter methods...
    public String getBusinessShortCode() {
        return businessShortCode;
    }

    public String getPassword() {
        return password;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getAmount() {
        return amount;
    }

    public String getPartyA() {
        return partyA;
    }

    public String getPartyB() {
        return partyB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCallBackURL() {
        return callBackURL;
    }

    public String getAccountReference() {
        return accountReference;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }
}