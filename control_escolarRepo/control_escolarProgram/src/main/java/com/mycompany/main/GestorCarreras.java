package com.mycompany.main;

public class GestorCarreras {
    
    public GestorCarreras(){
        
    }
    
    public void menuCarreras(){
        System.out.println("1.- Añadir carrera");
        System.out.println("2.- Actualizar carrera");
        System.out.println("3.- Ver todas las carreras");
        System.out.println("4.- Ver una carrera");
        System.out.println("1.- Eliminar carrera");
    }
    
    public String eleccionesMenu(int eleccion){
        String query= " ";
        switch(eleccion){
            case 1:
                query = "INSERT INTO carreras (nombre, idCarreras) VALUES (?,?)";
                break;
            case 2:
                query = "UPDATE "
        }
        return query;
    }
}
