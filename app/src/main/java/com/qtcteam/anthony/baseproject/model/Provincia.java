package com.qtcteam.anthony.baseproject.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@Entity
public class Provincia {

    @PrimaryKey()
    @ColumnInfo(name = "id_provincia")
    @SerializedName("idProvincia")
    private int idProvincia;

    @ForeignKey(entity = Departamento.class, parentColumns = "id_departamento",
            childColumns = "id_departamento", onDelete = ForeignKey.CASCADE)
    @ColumnInfo(name = "id_departamento")
    private int idDepartamento;

    // @ColumnInfo(name = "codigo")
    @SerializedName("codigo")
    private String codigo;

    // @ColumnInfo(name = "nombre")
    @SerializedName("nombre")
    private String nombre;

    @Ignore
    @SerializedName("distritos")
    private ArrayList<Distrito> distritos;

    /**
     * Constructor para obtener los datos desde SQLite.
     * @param idProvincia ID de la provincia.
     * @param idDepartamento ID del departamento al que pertenece la provincia.
     * @param codigo Código de ubigeo de la provincia.
     * @param nombre Nombre de la provincia.
     */
    public Provincia (int idProvincia, int idDepartamento, String codigo, String nombre) {
        this.idProvincia = idProvincia;
        this.idDepartamento = idDepartamento;
        this.codigo = codigo;
        this.nombre = nombre;
        this.distritos = null;
    }

    /**
     * Constructor para obtener los datos desde el servicio REST.
     * @param idProvincia ID de la provincia.
     * @param codigo Código de ubigeo la provincia.
     * @param nombre Nombre de la provincia.
     * @param distritos Lista de distritos.
     */
    public Provincia (int idProvincia, String codigo, String nombre,
                      ArrayList<Distrito> distritos) {
        this.idProvincia = idProvincia;
        this.idDepartamento = 0;
        this.codigo = codigo;
        this.nombre = nombre;
        this.distritos = distritos;
    }

    public int getDistritoCount () {
        return (distritos == null) ? 0 : distritos.size();
    }

    public Distrito getDistritoAt (int index) {
        return (distritos == null) ? null : distritos.get(index);
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public int getIdDepartamento () {
        return idDepartamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
