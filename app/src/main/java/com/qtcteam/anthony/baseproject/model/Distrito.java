package com.qtcteam.anthony.baseproject.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class Distrito {

    @PrimaryKey
    @ColumnInfo(name = "id_distrito")
    @SerializedName("idDistrito")
    private int idDistrito;

    @ForeignKey(entity = Provincia.class, parentColumns = "idProvincia",
            childColumns = "idProvincia", onDelete = ForeignKey.CASCADE)
    @ColumnInfo(name = "id_provincia")
    private int idProvincia;

    // @ColumnInfo(name = "codigo")
    @SerializedName("codigo")
    private String codigo;

    // @ColumnInfo(name = "nombre")
    @SerializedName("nombre")
    private String nombre;

    /**
     * Constructor para obtener los datos desde SQLite.
     * @param idDistrito ID del distrito.
     * @param idProvincia ID de la provincia a la que pertenece el distrito.
     * @param codigo Código de ubigeo del distrito.
     * @param nombre Nombre del distrito.
     */
    public Distrito (int idDistrito, int idProvincia, String codigo, String nombre) {
        this.idDistrito = idDistrito;
        this.idProvincia = idProvincia;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * Constructor para obtener los datos desde el servicio REST.
     * @param idDistrito ID del distrito
     * @param codigo Código de ubigeo del distrito.
     * @param nombre Nombre del distrito.
     */
    public Distrito (int idDistrito, String codigo, String nombre) {
        this.idDistrito = idDistrito;
        this.idProvincia = 0;
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

    public int getIdProvincia() {
        return idProvincia;
    }
}
