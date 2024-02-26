/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Mati
 */
public class Catedraticos {
    private int id;
    private String nombre;

    public Catedraticos() {
    }

    public Catedraticos(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Catedraticos{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
