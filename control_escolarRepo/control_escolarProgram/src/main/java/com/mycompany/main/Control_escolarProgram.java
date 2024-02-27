package com.mycompany.main;

import com.mycompany.db.Connect;
import java.util.Scanner;



public class Control_escolarProgram {

    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opciones = 0;
        //Connect connect = new Connect();
        //connect.startConnection();
        
        menuPrincipal();
        opciones = scan.nextInt();
        eleccionPrincipal(opciones);
              
    }
    
    public static void menuPrincipal(){
        System.out.println("1.- Carreras");
        System.out.println("2.- Alumnos");
        System.out.println("3.- Calificaciones");
        System.out.println("4.- Catedraticos");
        System.out.println("5.- Materias");
        System.out.println("6.- Semestres");
    }
    
    public static void eleccionPrincipal(int opcion){
        switch(opcion){
            case 1:
                GestorCarreras gestorCarreras = new GestorCarreras();
                gestorCarreras.menuCarreras();
                opcion = scan.nextInt();
                gestorCarreras.eleccionesCarreras(opcion);
                break;
        }
    }
}
