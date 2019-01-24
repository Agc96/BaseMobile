package com.qtcteam.anthony.baseproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Departamento {

    @SerializedName("idDepartamento")
    private int idDepartamento;

    @SerializedName("codigo")
    private String codigo;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("provincias")
    private ArrayList<Provincia> provincias;

    public Departamento (int idDepartamento, String codigo, String nombre,
                         ArrayList<Provincia> provincias) {
        this.idDepartamento = idDepartamento;
        this.codigo = codigo;
        this.nombre = nombre;
        this.provincias = provincias;
    }

    public int getProvinciaCount () {
        return provincias.size();
    }

    public Provincia getProvinciaAt (int index) {
        return provincias.get(index);
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
