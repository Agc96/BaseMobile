package com.qtcteam.anthony.baseproject.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.qtcteam.anthony.baseproject.model.Provincia;

import java.util.List;

@Dao
public interface ProvinciaDao {

    @Query("SELECT * FROM provincia")
    List<Provincia> getAll();

    @Query("SELECT * FROM provincia WHERE id_departamento = :idDepartamento")
    List<Provincia> getByDepartamento(int idDepartamento);

    @Insert
    void insertAll(Provincia... provincias);

    @Delete
    void delete(Provincia provincia);
}
