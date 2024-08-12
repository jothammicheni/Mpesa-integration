package com.example.mpesa.integrattions;

import android.content.Context;
import android.content.SharedPreferences;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class AppUtils {

    private static final String PREFS_NAME = "project_prefs";

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static String getPassKey() {
        return "32iSluTYMmyLOOPHXXdHJM8SJvV8TuGG"; // Replace with your actual pass key
    }

    public static void saveAccessToken(Context context, String accessToken) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("accessToken", accessToken);
        editor.apply();
    }

    public static String getAccessToken(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getString("accessToken", null);
    }

    public static String generateTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(Calendar.getInstance().getTime());
    }

    public static String generatePassword(String timestamp) {
        String businessShortCode = Config.BUSINESS_SHORTCODE;
        String passKey = getPassKey();
        String password = ""; // Generate password using Base64 encoding
        // Implement the Base64 encoding logic here
        return password;
    }
}
