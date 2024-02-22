package com.mycompany.model;

public class Carreras {
    
    private int id;
    private String name;

    public Carreras() {
    }

    public Carreras(int id, String name) {
        setId(id);
        setName(name);
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

    @Override
    public String toString() {
        return "Carreras{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
