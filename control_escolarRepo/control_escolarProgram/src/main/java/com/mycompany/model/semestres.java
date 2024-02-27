/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Mati
 */
public class semestres {
    private int id;
    private String nombre;
    private int idCarreras;

    
    public semestres(int id, String nombre, int idCarreras) {
        this.id = id;
        this.nombre = nombre;
        this.idCarreras = idCarreras;
    }

    public semestres() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdCarreras() {
        return idCarreras;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCarreras(int idCarreras) {
        this.idCarreras = idCarreras;
    }

    @Override
    public String toString() {
        return "semestres{" + "id=" + id + ", nombre=" + nombre + ", idCarreras=" + idCarreras + '}';
    }
    
    
}
