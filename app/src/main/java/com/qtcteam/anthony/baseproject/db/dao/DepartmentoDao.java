package com.qtcteam.anthony.baseproject.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.qtcteam.anthony.baseproject.model.Departamento;

import java.util.List;

@Dao
public interface DepartmentoDao {

    @Query("SELECT * FROM departamento")
    List<Departamento> getAll();

    @Insert
    void insertAll(Departamento... departamentos);

    @Delete
    void delete(Departamento departamento);
}
