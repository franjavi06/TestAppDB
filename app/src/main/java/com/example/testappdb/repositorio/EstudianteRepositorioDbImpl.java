package com.example.testappdb.repositorio;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.testappdb.entidad.Estudiante;

import java.util.List;

public class EstudianteRepositorioDbImpl implements EstudianteRepositorio{

    private DbConexion dbConexion;

    public EstudianteRepositorioDbImpl(Context context){
        this.dbConexion = new DbConexion(context);
    }

    @Override
    public void crear(Estudiante estudiante) {

        ContentValues cv = new ContentValues();
        cv.put("nombre", estudiante.getNombre());
        cv.put("matricula", estudiante.getMatricula());

        SQLiteDatabase db = dbConexion.getWritableDatabase();
        long id = db.insert("estudiante",null,cv);

        if (id <= 0){
            Log.i("EstudianteRepositorio","Error al crear estudiante");
        }else {
            Log.i("EstudianteRepositorio","El estudiante se ha creado exitosamente - "+"id: "+id);
        }

    }

    @Override
    public void actualizar(Estudiante estudiante) {

    }

    @Override
    public void borrar(Estudiante estudiante) {

    }

    @Override
    public Estudiante buscar(int id) {
        return null;
    }

    @Override
    public List<Estudiante> buscar() {
        return null;
    }
}
