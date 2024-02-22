/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Mati
 */
public class Alumnos {
    
    private int id;
    private String name;
    private int idCarreras;

    public Alumnos() {
    }

    public Alumnos(int id, String name, int idCarreras) {
        setId(id);
        setName(name);
        setIdCarreras(idCarreras);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCarreras() {
        return idCarreras;
    }

    public void setIdCarreras(int idCarreras) {
        this.idCarreras = idCarreras;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "id=" + id + ", name=" + name + ", idCarreras=" + idCarreras + '}';
    }
    
    
    
}
