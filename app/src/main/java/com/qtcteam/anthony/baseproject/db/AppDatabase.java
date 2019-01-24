package com.qtcteam.anthony.baseproject.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.qtcteam.anthony.baseproject.db.dao.DepartmentoDao;
import com.qtcteam.anthony.baseproject.db.dao.DistritoDao;
import com.qtcteam.anthony.baseproject.db.dao.ProvinciaDao;
import com.qtcteam.anthony.baseproject.model.Departamento;
import com.qtcteam.anthony.baseproject.model.Distrito;
import com.qtcteam.anthony.baseproject.model.Provincia;

@Database(entities = {Departamento.class, Distrito.class, Provincia.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    // DAOs de Ubigeo
    public abstract DepartmentoDao departmentoDao();
    public abstract ProvinciaDao provinciaDao();
    public abstract DistritoDao distritoDao();
}
