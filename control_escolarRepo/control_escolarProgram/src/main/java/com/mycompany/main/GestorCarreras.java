package com.mycompany.main;

import com.mycompany.db.Querys;
import java.util.Scanner;

public class GestorCarreras {
    
    Scanner scan = new Scanner(System.in);
    String nombre = " ";
    String nuevoNombre = "";
    Querys querys = new Querys();
    
    public GestorCarreras(){
        
    }
    
    public void menuCarreras(){
        System.out.println("1.- Añadir carrera");
        System.out.println("2.- Actualizar carrera");
        System.out.println("3.- Ver todas las carreras");
        System.out.println("4.- Ver una carrera");
        System.out.println("5.- Eliminar carrera");
    }
    
    public String eleccionesCarreras(int eleccion){
        String query= " ";
        switch(eleccion){
            case 1:
                añadirCarrera();                
                break;
            case 2:
                actualizarCarrera();
                break;
            case 3:
                mostrarCarreras();
                break;
            case 4:
                mostrarCarrera();
                break;
            case 5:
                eliminarCarrera();
        }
        return query;
    }
    
    public void añadirCarrera(){
        
        System.out.println("Nombre de la carrera: ");
        nombre = scan.nextLine();
        querys.añadirCarrera(nombre);
    }
    
    public void actualizarCarrera(){
        System.out.println("Introduce el nombre de la carrera a modificar");
        nombre = scan.nextLine();
        System.out.println("Nuevo nombre para la carrera");
        nuevoNombre = scan.nextLine();
        querys.actualizarCarrera(nombre, nuevoNombre);
        
    }
    
    public void mostrarCarreras(){
        querys.mostrarCarreras();
    }
    
    public void mostrarCarrera(){
        System.out.println("Introduce el nombre de la carrera que quieres ver");
        nombre = scan.nextLine();
        querys.mostrarCarrera(nombre);
    }
    
    public void eliminarCarrera(){
        System.out.println("Introduce el nombre de la carrera que quieres eliminar");
        nombre = scan.nextLine();
        querys.eliminarCarrera(nombre);
    }
}
