package com.qtcteam.anthony.baseproject.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.qtcteam.anthony.baseproject.model.Distrito;

import java.util.List;

@Dao
public interface DistritoDao {

    @Query("SELECT * FROM distrito")
    List<Distrito> getAll();

    @Query("SELECT * FROM distrito WHERE id_provincia = :idProvincia")
    List<Distrito> getByProvincia(int idProvincia);

    @Insert
    void insertAll(Distrito... distritos);

    @Delete
    void delete(Distrito distrito);
}

