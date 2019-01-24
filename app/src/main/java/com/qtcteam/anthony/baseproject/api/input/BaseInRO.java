package com.qtcteam.anthony.baseproject.api.input;

import com.google.gson.annotations.SerializedName;

public class BaseInRO {

    @SerializedName("applicationName")
    private String applicationName;

    public BaseInRO (String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationName() {
        return applicationName;
    }
}
