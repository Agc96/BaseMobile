package com.qtcteam.anthony.baseproject.api;

import com.qtcteam.anthony.baseproject.api.input.BaseInRO;
import com.qtcteam.anthony.baseproject.api.output.BaseOutRO;
import com.qtcteam.anthony.baseproject.api.output.UbigeoOutRO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {

    @POST("common/justificaciones")
    Call<BaseOutRO> getJustifications(@Body BaseInRO request);

    @POST("common/ubigeo")
    Call<UbigeoOutRO> getUbigeo(@Body BaseInRO request);
}
