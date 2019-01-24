package com.qtcteam.anthony.baseproject.model;

import com.google.gson.annotations.SerializedName;

public class Distrito {

    @SerializedName("idDistrito")
    private int idDistrito;

    @SerializedName("codigo")
    private String codigo;

    @SerializedName("nombre")
    private String nombre;

    public Distrito (int idDistrito, String codigo, String nombre) {
        this.idDistrito = idDistrito;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
