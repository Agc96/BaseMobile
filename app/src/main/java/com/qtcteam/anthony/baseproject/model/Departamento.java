package com.qtcteam.anthony.baseproject.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@Entity
public class Departamento {

    @PrimaryKey
    @ColumnInfo(name = "id_departamento")
    @SerializedName("idDepartamento")
    private int idDepartamento;

    // @ColumnInfo(name = "codigo")
    @SerializedName("codigo")
    private String codigo;

    // @ColumnInfo(name = "nombre")
    @SerializedName("nombre")
    private String nombre;

    @Ignore
    @SerializedName("provincias")
    private ArrayList<Provincia> provincias;

    /**
     * Constructor para obtener los datos desde SQLite.
     * @param idDepartamento ID del departamento.
     * @param codigo Código de ubigeo del departamento.
     * @param nombre Nombre del departamento.
     */
    public Departamento (int idDepartamento, String codigo, String nombre) {
        this.idDepartamento = idDepartamento;
        this.codigo = codigo;
        this.nombre = nombre;
        this.provincias = null;
    }

    /**
     * Constructor para obtener los datos desde el servicio REST.
     * @param idDepartamento ID del departamento.
     * @param codigo Código de ubigeo del departamento.
     * @param nombre Nombre del departamento.
     * @param provincias Lista de provincias.
     */
    public Departamento (int idDepartamento, String codigo, String nombre,
                         ArrayList<Provincia> provincias) {
        this.idDepartamento = idDepartamento;
        this.codigo = codigo;
        this.nombre = nombre;
        this.provincias = provincias;
    }

    public int getProvinciaCount () {
        return (provincias == null) ? 0 : provincias.size();
    }

    public Provincia getProvinciaAt (int index) {
        return (provincias == null) ? null : provincias.get(index);
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
