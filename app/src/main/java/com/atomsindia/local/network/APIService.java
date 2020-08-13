package com.atomsindia.local.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {

    @POST("/api/posicion")
    Call<PosicionDTO> savePost(@Body PosicionDTO posicionDTO);
}
