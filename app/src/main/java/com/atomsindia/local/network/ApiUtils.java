package com.atomsindia.local.network;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://192.168.1.18:8090";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

}
