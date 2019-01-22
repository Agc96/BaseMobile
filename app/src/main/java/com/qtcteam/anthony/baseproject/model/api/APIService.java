package com.qtcteam.anthony.baseproject.model.api;

import com.qtcteam.anthony.baseproject.model.api.input.BaseInRO;
import com.qtcteam.anthony.baseproject.model.api.output.BaseOutRO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {

    @POST("element")
    Call<BaseOutRO> getElements(@Body BaseInRO request);
}
