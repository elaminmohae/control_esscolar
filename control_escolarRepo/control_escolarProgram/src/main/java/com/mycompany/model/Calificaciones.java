package com.mycompany.model;

public class Calificaciones {
    
    private int id;
    private int nota;
    private int idAlumnos;
    private int idMaterias;

    public Calificaciones() {
    }

    public Calificaciones(int id, int nota, int idAlumnos, int idMaterias) {
        setId(id);
        setNota(nota);
        setIdAlumnos(idAlumnos);
        setIdMaterias(idMaterias);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(int idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public int getIdMaterias() {
        return idMaterias;
    }

    public void setIdMaterias(int idMaterias) {
        this.idMaterias = idMaterias;
    }

    @Override
    public String toString() {
        return "Calificaciones{" + "id=" + id + ", nota=" + nota + ", idAlumnos=" + idAlumnos + ", idMaterias=" + idMaterias + '}';
    }
}
