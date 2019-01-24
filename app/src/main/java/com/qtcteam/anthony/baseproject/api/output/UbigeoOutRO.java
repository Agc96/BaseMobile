package com.qtcteam.anthony.baseproject.api.output;

import com.google.gson.annotations.SerializedName;
import com.qtcteam.anthony.baseproject.model.Departamento;

import java.util.ArrayList;

public class UbigeoOutRO extends BaseOutRO {

    @SerializedName("departamentos")
    private ArrayList<Departamento> departamentos;

    public UbigeoOutRO (int errorCode, String message, ArrayList<Departamento> departamentos) {
        super(errorCode, message);
        this.departamentos = departamentos;
    }

    public int getDepartamentoCount () {
        return departamentos.size();
    }

    public Departamento getDepartamentoAt (int index) {
        return departamentos.get(index);
    }
}
