package com.example.mpesa.integrattions;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface MpesaApi {

    // Using headers directly in the method
    @Headers({
            "Authorization: Bearer xz4FTGzRJERhGSAZOBIXiuSvMlpc"
    })
    @POST("mpesa/stkpush/v1/processrequest")
    Call<MpesaResponse> stkPushWithHeaders(
            @Header("Authorization") String authToken,
            @Body MpesaRequest request
    );

    // Using Form URL Encoded parameters
    @FormUrlEncoded
    @POST("mpesa/stkpush/v1/processrequest")
    Call<MpesaResponse> stkPushFormEncoded(
            @Header("Authorization") String authorization,
            @Field("BusinessShortCode") String businessShortCode,
            @Field("Password") String password,
            @Field("Timestamp") String timestamp,
            @Field("TransactionType") String transactionType,
            @Field("Amount") String amount,
            @Field("PartyA") String partyA,
            @Field("PartyB") String partyB,
            @Field("PhoneNumber") String phoneNumber,
            @Field("CallBackURL") String callBackURL,
            @Field("AccountReference") String accountReference,
            @Field("TransactionDesc") String transactionDesc
    );

    // Alternative method for processing request with a request object
    @POST("mpesa/stkpush/v1/processrequest")
    Call<MpesaResponse> stkPush(@Body MpesaRequest request);
}
