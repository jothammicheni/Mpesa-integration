package com.example.mpesa.integrattions;

public class MpesaResponse {
    private String MerchantRequestID;
    private String CheckoutRequestID;
    private String ResponseCode;
    private String ResponseDescription;
    private String CustomerMessage;

    // Getters
    public String getMerchantRequestID() {
        return MerchantRequestID;
    }

    public String getCheckoutRequestID() {
        return CheckoutRequestID;
    }

    public String getResponseCode() {
        return ResponseCode;
    }

    public String getResponseDescription() {
        return ResponseDescription;
    }

    public String getCustomerMessage() {
        return CustomerMessage;
    }

    // Setters
    public void setMerchantRequestID(String merchantRequestID) {
        MerchantRequestID = merchantRequestID;
    }

    public void setCheckoutRequestID(String checkoutRequestID) {
        CheckoutRequestID = checkoutRequestID;
    }

    public void setResponseCode(String responseCode) {
        ResponseCode = responseCode;
    }

    public void setResponseDescription(String responseDescription) {
        ResponseDescription = responseDescription;
    }

    public void setCustomerMessage(String customerMessage) {
        CustomerMessage = customerMessage;
    }
}
