package com.example.mpesa.MpesaIntegration;

import android.util.Base64;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AccessTokenInterceptor implements Interceptor {
    public AccessTokenInterceptor() {

    }

    @Override
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        String keys = "A0cyJrfzGx9zQ6vZgd1GpaP0wUcAAbmGH6JgYXtHNZikkGhr" + ":" + "fjwBlkAWn6IOGdAyGmnmOqPnQFYpIx1se8EA5RKXrTlGnnIFOBvZiV4EEAWN9lco";

        Request request = chain.request().newBuilder()
                .addHeader("Authorization", "Basic " + Base64.encodeToString(keys.getBytes(), Base64.NO_WRAP))
                .build();
        return chain.proceed(request);
    }
}
