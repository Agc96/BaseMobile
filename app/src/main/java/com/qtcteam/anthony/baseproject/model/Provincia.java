package com.qtcteam.anthony.baseproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Provincia {

    @SerializedName("idProvincia")
    private int idProvincia;

    @SerializedName("codigo")
    private String codigo;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("distritos")
    private ArrayList<Distrito> distritos;

    public Provincia (int idProvincia, String codigo, String nombre,
                      ArrayList<Distrito> distritos) {
        this.idProvincia = idProvincia;
        this.codigo = codigo;
        this.nombre = nombre;
        this.distritos = distritos;
    }

    public int getDistritoCount () {
        return distritos.size();
    }

    public Distrito getDistritoAt (int index) {
        return distritos.get(index);
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
